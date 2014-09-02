package com.free.assist.service.supt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.assist.dao.SuptCheckDAO;
import com.free.assist.dao.SuptCheckOutDAO;
import com.free.assist.dao.SuptFaceDAO;
import com.free.assist.dao.SuptReturnDAO;
import com.free.assist.dao.SuptReturnValidDAO;
import com.free.assist.domain.IfaceConfigProtocol;
import com.free.assist.domain.IfaceDaemonAttachment;
import com.free.assist.domain.SuptCheck;
import com.free.assist.domain.SuptCheckExample;
import com.free.assist.domain.SuptCheckKey;
import com.free.assist.domain.SuptCheckOut;
import com.free.assist.domain.SuptCheckOutExample;
import com.free.assist.domain.SuptCheckOutKey;
import com.free.assist.domain.SuptFace;
import com.free.assist.domain.SuptFaceErrTack;
import com.free.assist.domain.SuptFaceErrTackExample;
import com.free.assist.domain.SuptReturn;
import com.free.assist.domain.SuptReturnValidKey;
import com.free.assist.domain.SuptSaveValue;
import com.free.assist.domain.SuptSaveValueExample;
import com.free.assist.domain.vo.MorphDTO;
import com.free.assist.exception.IfaceConfigException;
import com.free.assist.service.BaseServiceImpl;
import com.free.assist.service.SuptConstants;
import com.free.assist.service.iface.IfaceConfigFacade;
import com.free.assist.util.DateUtil;
import com.free.assist.util.Helper;
import com.free.assist.util.ObjectUtil;

/**
 * <p>
 * ����: ���Žӿ�ƽ̨
 * </p>
 * <p>
 * ��˾: �������ͨ�ż������޹�˾
 * </p>
 *
 * @version 1.0
 * @author ���
 * @date Dec 9, 2008
 * @time 1:46:10 PM
 */
@Service("checkFaceService")
@SuppressWarnings("unchecked")
public class CheckFaceServiceImpl extends BaseServiceImpl implements ICheckFaceService {
	protected SuptFaceDAO suptFaceDAO;
	protected SuptCheckDAO suptCheckDAO;
	protected SuptCheckOutDAO suptCheckOutDAO;
	protected IfaceConfigFacade ifaceConfigFacade;
	protected ISuptValueListService iSuptValueListService;
	private ITaticConfigService taticConfigService;
	protected SuptReturnDAO suptReturnDAO;
	protected SuptReturnValidDAO suptReturnValidDAO;

	@Autowired
	public void setTaticConfigService(ITaticConfigService taticConfigService) {
		this.taticConfigService = taticConfigService;
	}

	@Autowired
	public void setSuptReturnValidDAO(SuptReturnValidDAO suptReturnValidDAO) {
		this.suptReturnValidDAO = suptReturnValidDAO;
	}

	@Autowired
	public void setSuptReturnDAO(SuptReturnDAO suptReturnDAO) {
		this.suptReturnDAO = suptReturnDAO;
	}

	@Autowired
	public void setSuptFaceDAO(SuptFaceDAO suptFaceDAO) {
		this.suptFaceDAO = suptFaceDAO;
	}

	@Autowired
	public void setSuptCheckDAO(SuptCheckDAO suptCheckDAO) {
		this.suptCheckDAO = suptCheckDAO;
	}

	@Autowired
	public void setSuptCheckOutDAO(SuptCheckOutDAO suptCheckOutDAO) {
		this.suptCheckOutDAO = suptCheckOutDAO;
	}

	@Autowired
	public void setIfaceConfigFacade(IfaceConfigFacade ifaceConfigFacade) {
		this.ifaceConfigFacade = ifaceConfigFacade;
	}

	@Autowired
	public void setISuptValueListService(ISuptValueListService iSuptValueListService) {
		this.iSuptValueListService = iSuptValueListService;
	}

	public Map<String, Object> checkXml(Document document, String methodId, String applicationId) throws Exception {
		boolean flag = true;
		String errorStr = "";
		String errorType = "";
		try {
			// �ҳ���֤���򼯺�
			SuptCheckExample chexp = new SuptCheckExample();
			chexp.createCriteria().andCimpFaceIdEqualTo(methodId);
			List<SuptCheck> suptList = suptCheckDAO.selectByExample(chexp);
			// ѭ����֤����
			for (SuptCheck supt : suptList) {
				String nodeid = supt.getFieldName();
				Node node = document.selectSingleNode(nodeid);
				if (node == null) {
					errorType = SuptConstants.ERROR_TYPE_JIEXI;
					throw new Exception("XML��û����Ӧ�Ľڵ�,��ȷ��");
				}
				String text = node.getText();
				// ���ݹ���У��
				// �Ƿ�Ϊ��У��
				if (supt.getIsNull() != null && "N".equals(supt.getIsNull())) {
					if (text == null || "".equals(text)) {
						errorType = SuptConstants.ERROR_TYPE_GEI;
						throw new Exception("У�鲻ͨ�����ֶβ�����Ϊ��");
					}
				}
				// ���ݳ���У��
				if (supt.getFieldLegth() != null && !"".equals(supt.getFieldLegth())) {
					int legth = Integer.parseInt(supt.getFieldLegth());
					if (text.length() > legth) {
						errorType = SuptConstants.ERROR_TYPE_GEI;
						throw new Exception("У�鲻ͨ�����ֶγ��ȳ���Ԥ�賤��");
					}
				}
				// У����������
				if (supt.getDataType() != null && !"".equals(supt.getDataType())) {
					// ����
					if ("int".equals(supt.getDataType())) {
						try {
							Integer.parseInt(text);
						} catch (NumberFormatException e) {
							errorType = SuptConstants.ERROR_TYPE_GEI;
							throw new Exception("У�鲻ͨ�����ֶ����Ͳ�������");
						}
					}

					// ��̬���ݴ���
					if ("static".equals(supt.getDataType())) {
						// ������ӿڣ�ȡ�þ�̬����,�贫�ĸ�����
						boolean faceFlag = ifaceConfigFacade.exists(applicationId, node.getName(), text);
						if (!faceFlag) {
							errorType = SuptConstants.ERROR_TYPE_STATIC;
							throw new Exception("У�鲻ͨ���������ھ�̬����");
						}
					}
				}
				// У���ʽ�Ƿ����
				if (supt.getFormat() != null && !"".equals(supt.getFormat())) {
					boolean b = text.matches(supt.getFormat());
					if (!b) {
						errorType = SuptConstants.ERROR_TYPE_GEI;
						throw new Exception("У�鲻ͨ�����ֶθ�ʽ�����Ϲ涨");
					}
				}

			}
		} catch (Exception e) {
			flag = false;
			errorStr = e.toString();
			if (errorType == null || "".equals(errorType)) {
				errorType = SuptConstants.ERROR_TYPE_JIEXI;
			}
			// ������
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("FLAG", flag);
		map.put("ErrStr", errorStr);
		map.put("ErrType", errorType); // ��������
		return map;
	}

	public Map<String, Object> changerXml(Document document, SuptFace suptFace, String applicationId, String tgr_applicationId) throws Exception {
		String methodId = suptFace.getCimpFaceId();
		boolean flag = true;
		String errorStr = "";
		String errorType = "";
		StringBuffer sbf = null;
		Map<String, String> dependValuesMap = new HashMap<String, String>();
		try {
			// ��ѯ���xml����
			SuptCheckOutExample chexp = new SuptCheckOutExample();
			chexp.createCriteria().andCimpFaceIdEqualTo(methodId).andAvailableEqualTo("Y");
			chexp.setOrderByClause(" t_supt_check_out.order_id ");
			List<SuptCheckOut> suptList = this.selectByExample(chexp);
			if (suptList != null && suptList.size() > 0) {
				sbf = new StringBuffer(256);
				// ѭ�����xml
				sbf.append("<?xml version=\"1.0\" encoding=\"GB2312\"?>");
				List<SuptCheckOut> tmpList = new ArrayList();
				int str = 0;
				// �������ѭ����XML��Ҳ���õ������У��γ�һ��һ
				for (int i = 0; i < suptList.size(); i++) {
					SuptCheckOut sco = suptList.get(i);
					if ("Y".equals(sco.getIsDoubuxml()) && "N".equalsIgnoreCase(sco.getOutIschidNode()) && "N".equalsIgnoreCase(sco.getOutChidnodeOver())) {
						str = i;
					}
					tmpList.add(sco);
					if ("Y".equals(sco.getIsDoubuxml()) && "N".equalsIgnoreCase(sco.getOutIschidNode()) && "Y".equalsIgnoreCase(sco.getOutChidnodeOver())) {
						List<Node> list = document.selectNodes(sco.getDoubuPar()); // ͬ���ڵ�·����
						for (int m = 0; m < list.size() - 1; m++) {
							for (int k = str; k <= i; k++) {
								SuptCheckOut out = suptList.get(k);
								SuptCheckOut copy = new SuptCheckOut();
								ObjectUtil.copyObjectToObject(out, copy);
								copy.setDoubuNum(m + 1 + "");
								tmpList.add(copy);
							}
						}
					}
				}

				for (SuptCheckOut supt : tmpList) {
					if (StringUtils.equals(supt.getIgnoreAbsent(), "Y") && StringUtils.isNotBlank(supt.getInNode())) {
						if ("N".equalsIgnoreCase(supt.getOutIschidNode())) {// ��Ҷ�ӽڵ�ʱ���������ڵ���ڲź���
							Node node = document.selectSingleNode(supt.getInNode());
							if (node == null) {
								continue;
							}
						} else if ("Y".equalsIgnoreCase(supt.getOutIschidNode())) {// Ҷ�ӽڵ�����Կ�ֵ
							Node node = null;
							try {
								node = document.selectSingleNode(supt.getInNode());
								if (node == null || node.getText().trim().length() == 0) {
									continue;
								}
							} catch (Exception e) {
								logger.debug("ȡ�ڵ�ʱ����Ҳ��Ϊ��ֵ");
							}
						}
					}
					// ���νڵ�Ϊ�����ڵ㣬��ֱ����ӽ���������
					if ("Y".equalsIgnoreCase(supt.getOutChidnodeOver())) {
						if (!"D".equalsIgnoreCase(supt.getIsAnnotate())) {// D:��Ч���������������ת������ʱ��
							sbf.append("</").append(supt.getOutNode()).append(">");
						}
					} else {
						// ���νڵ�ΪҶ�ӽڵ㣬����Ҫ��Ҷ�ӽڵ�ֵ
						if ("Y".equalsIgnoreCase(supt.getOutIschidNode())) {
							// ȡ����νڵ��Ӧ��ֵ
							Node inNode = null;
							Node nodeFor = null; // ѭ����XML�Ľڵ�
							String outNodeText = "";
							// �����XML����ͬ���Ľڵ��XML�壬���д���
							if ("Y".equals(supt.getIsDoubuxml())) { // ѭ���ӽڵ�
								int k = 0;
								if (supt.getDoubuNum() != null && !"".equals(supt.getDoubuNum())) {
									k = Integer.valueOf(supt.getDoubuNum()); // ͬ��XML���еڼ���ѭ����

								}
								if (supt.getDoubuPar() != null && !"".equals(supt.getDoubuPar())) {
									List<Node> list = document.selectNodes(supt.getDoubuPar()); // ͬ���ڵ�·����
									if (list == null || list.isEmpty()) {
										continue;
									}
									nodeFor = list.get(k);
								}
							}
							if ("final".equals(supt.getMappPatt())) { // �̶�ֵ
								outNodeText = supt.getInNode();
							} else if ("systime".equals(supt.getMappPatt())) { // ϵͳʱ��
								String format = supt.getMappAftFormat();
								if (format != null && !"".equals(format)) {
									outNodeText = DateUtil.toStringByFormat(this.taticConfigService.getSysDate(), format);
								}
							} else if ("timeReplace".equals(supt.getMappPatt())) { // ʱ���滻
								String nodePaths = supt.getInNode();
								String[] nodesArray = nodePaths.split(",");
								if ("timeStr".equals(supt.getMappForData()) && !"".equals(supt.getMappForFormat()) && supt.getMappForFormat() != null && "timeStr".equals(supt.getMappAftData()) && !"".equals(supt.getMappAftFormat()) && supt.getMappAftFormat() != null) {
									Date beforeDate = null;
									for (String node : nodesArray) {
										inNode = document.selectSingleNode(node);
										if (inNode != null) {
											try {
												SimpleDateFormat sdf = new SimpleDateFormat(supt.getMappForFormat());
												beforeDate = sdf.parse(inNode.getText());
											} catch (ParseException e) {
												if ("yyyy-MM-dd HH:mm:ss".equals(supt.getMappForFormat())) {
													beforeDate = DateUtil.toDateByFormat(inNode.getText(), "yyyyMMddHHmmss");
												} else if ("yyyyMMddHHmmss".equals(supt.getMappForFormat())) {
													beforeDate = DateUtil.toDateByFormat(inNode.getText(), "yyyy-MM-dd HH:mm:ss");
												}
											}
											try {
												outNodeText = DateUtil.toStringByFormat(beforeDate, supt.getMappAftFormat());
											} catch (Exception e) {
												errorType = SuptConstants.ERROR_TYPE_GEI;
												throw new Exception("��ʽת������");
											}
											if (outNodeText != null && outNodeText.trim().length() > 0) {
												break;
											}
										}
									}
									if (beforeDate == null) {
										outNodeText = DateUtil.toStringByFormat(this.taticConfigService.getSysDate(), supt.getMappAftFormat());
									}
								}
							} else if ("tactic".equals(supt.getMappPatt())) { // ȡ����
								outNodeText = this.taticConfigService.getTatiConversionValue(methodId, supt.getOutNode(), document, dependValuesMap, supt.getDepenNode());
							} else if ("source".equals(supt.getMappPatt())) { // Դ����(��ʱû���õ�)
								// ������xml��ȡֵ
								String tmp = document.selectSingleNode(supt.getInNode()).getText();
								int k = 0;
								int m = 0;
								try {
									String[] tmpDep = supt.getDepenNode().split(",");
									if (tmpDep.length > 1) {
										k = Integer.parseInt(tmpDep[0]);
										m = Integer.parseInt(tmpDep[1]);
									} else if (tmpDep.length == 1) {
										k = Integer.parseInt(tmpDep[0]);
									}

									// ��ȡ�õ��ַ����зֽ� �ֽ����Ϊ~~~
									if (tmp != null && !"".equals(tmp)) {
										String[] arrTmp = tmp.split("~~~");

										if (tmpDep.length > 1) {
											String[] tmpStr = arrTmp[k - 1].split(",");
											outNodeText = tmpStr[m - 1];
										} else if (tmpDep.length == 1) {
											if (arrTmp.length >= k)
												outNodeText = arrTmp[k - 1];
										}
									}
								} catch (Exception e) {
									e.printStackTrace();
									errorType = SuptConstants.ERROR_TYPE_GEI;
									throw new Exception("Դ���ݽ�������");
								}
							} else if ("direct".equals(supt.getMappPatt())) { // ֱ��ӳ��
								if ("Y".equals(supt.getIsDoubuxml())) { // ѭ���ӽڵ�
									inNode = nodeFor.selectSingleNode(supt.getDoubuChi());
									outNodeText = inNode == null ? "" : inNode.getText();
								} else {
									if (supt.getInNode() != null && supt.getInNode().indexOf(",") != -1) {
										String[] inNodes = supt.getInNode().split(",");
										for (String nodePath : inNodes) {
											inNode = document.selectSingleNode(nodePath);
											if (inNode != null && inNode.getText() != null && inNode.getText().trim().length() > 0) {
												outNodeText = inNode.getText();
												break;
											}
										}
									} else {
										inNode = document.selectSingleNode(supt.getInNode());
										outNodeText = inNode == null ? "" : inNode.getText();
									}
								}
							} else if ("returnID".equals(supt.getMappPatt())) { // ����ID
								// �ӹ�����Ϣ����ȡֵ
								SuptSaveValueExample ssvEx = new SuptSaveValueExample();
								SuptSaveValueExample.Criteria ssvCri = ssvEx.createCriteria();
								if (supt.getMappAftFormat() != null && supt.getMappForFormat() != null) {
									String[] keyPathArray = Helper.split(supt.getMappAftFormat(), ",");
									String[] keyNameArray = Helper.split(supt.getMappForFormat(), ",");
									for (int i = 0; i < keyNameArray.length; i++) {
										if ("sheetStreamNo".equalsIgnoreCase(keyNameArray[i])) {
											ssvCri.andSheetStreamNoEqualTo(document.selectSingleNode(keyPathArray[i]).getText());
										} else if ("subsheetid".equalsIgnoreCase(keyNameArray[i])) {
											ssvCri.andSubsheetidEqualTo(document.selectSingleNode(keyPathArray[i]).getText());
										}
									}
									List<SuptSaveValue> ssvList = this.taticConfigService.selectByExample(ssvEx);
									if (ssvList != null && ssvList.size() > 0) {
										if ("hireFrom".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getHireFrom();
										} else if ("operuserid".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getOperuserid();
											if (outNodeText != null && outNodeText.indexOf("962112") != -1) {
												outNodeText = "962112";
											} else if (outNodeText != null && supt.getDepenNode() != null && supt.getDepenNode().trim().length() > 0) {
												outNodeText = Helper.split(outNodeText, ",")[Integer.parseInt(supt.getDepenNode()) - 1];
											}
										} else if ("trunkName".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getTrunkName();
										} else if ("workitemid".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getWorkitemid();
										} else if ("back1".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getBack1();
										} else if ("back2".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getBack2();
										} else if ("back3".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getBack3();
										} else if ("back4".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getBack4();
										} else if ("back5".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getBack5();
										} else if ("localKey1".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getLocalKey1();
										} else if ("localKey2".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getLocalKey2();
										} else if ("sheetStreamNo".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getSheetStreamNo();
										} else if ("circuitNo".equalsIgnoreCase(supt.getInNode())) {
											outNodeText = ssvList.get(0).getCircuitNo();
										}
									}
								}
							} else if ("changer".equals(supt.getMappPatt())) { // ����ת��
								if ("Y".equals(supt.getIsDoubuxml())) { // ѭ���ӽڵ�
									inNode = nodeFor.selectSingleNode(supt.getDoubuChi());
								} else {
									inNode = document.selectSingleNode(supt.getInNode());
								}
								if (inNode != null && inNode.getText() != null && !"".equals(inNode.getText().trim())) {
									if ("timeStr".equals(supt.getMappForData()) && !"".equals(supt.getMappForFormat()) && supt.getMappForFormat() != null && "timeStr".equals(supt.getMappAftData()) && !"".equals(supt.getMappAftFormat()) && supt.getMappAftFormat() != null) {
										Date beforeDate = null;
										try {
											SimpleDateFormat sdf = new SimpleDateFormat(supt.getMappForFormat());
											beforeDate = sdf.parse(inNode.getText());
										} catch (ParseException e) {
											if ("yyyy-MM-dd HH:mm:ss".equals(supt.getMappForFormat())) {
												beforeDate = DateUtil.toDateByFormat(inNode.getText(), "yyyyMMddHHmmss");
											} else if ("yyyyMMddHHmmss".equals(supt.getMappForFormat())) {
												beforeDate = DateUtil.toDateByFormat(inNode.getText(), "yyyy-MM-dd HH:mm:ss");
											}
										}
										try {
											outNodeText = DateUtil.toStringByFormat(beforeDate, supt.getMappAftFormat());
										} catch (Exception e) {
											errorType = SuptConstants.ERROR_TYPE_GEI;
											throw new Exception("��ʽת������");
										}
									}
								}
							} else if ("directAndStatic".equals(supt.getMappPatt())) {
								if (supt.getInNode() != null && supt.getInNode().indexOf(",") != -1) {
									String[] inNodes = supt.getInNode().split(",");
									if (inNodes.length > 1) {
										inNode = document.selectSingleNode(inNodes[0]);
										if (inNode != null) {// ֱ��ȡ�ýڵ�ֵ
											outNodeText = inNode.getText();
										}
										// δȡ��ʱȡ��̬ת��ֵ
										if (outNodeText == null || outNodeText.trim().length() == 0) {
											MorphDTO dto = new MorphDTO();
											dto.setHostId(applicationId);
											dto.setHostSn(supt.getDeclareSn());
											dto.setNodeName(supt.getOutNode()); // ��Ȼ������ڵ㣿
											if (StringUtils.startsWith(supt.getIsSimpsys(), "1")) { // Դϵͳ
											} else if (StringUtils.startsWith(supt.getIsSimpsys(), "2")) { // ˫ϵͳ
												dto.setHostId(applicationId);
												dto.setSiteId(tgr_applicationId);
												dto.setSiteSn(supt.getMappingSn());
											} else if (StringUtils.startsWith(supt.getIsSimpsys(), "3")) { // Ŀ��ϵͳ
												dto.setHostId(tgr_applicationId);
											} else { // ����
												logger.error("�ڽӿڷ���{}({})��������һ����̬����ת������û�����þ�̬����ת�����͡�", suptFace.getMethodName(), suptFace.getCimpName());
												throw new RuntimeException("��̬����ת������û�����á�");
											}
											dto.setIndicator(StringUtils.substring(supt.getIsSimpsys(), 1));
											if (inNodes[1] != null && inNodes[1].trim().length() > 0) {
												inNode = document.selectSingleNode(inNodes[1]);
												if (inNode != null) {
													dto.setNodeText(inNode.getText());
												}
											}
											// ��ͬXML�崦��
											if ("Y".equals(supt.getIsDoubuxml()) && supt.getDoubuChi() != null && supt.getDoubuChi().trim().length() > 0) {
												inNode = nodeFor.selectSingleNode(supt.getDoubuChi());
												if (inNode != null) {
													dto.setNodeText(inNode.getText());
												}
											}
											if (supt.getDepenKey() != null && supt.getDepenKey().trim().length() > 0) {// ���ڴ���ȡ
												dto.setCascadeSn(dependValuesMap.get(supt.getDepenKey()));
											} else if (supt.getDepenNode() != null && !"".equals(supt.getDepenNode())) {// ֱ������
												String cascadeSn = document.selectSingleNode(supt.getDepenNode()).getText();
												dto.setCascadeSn(cascadeSn);
											}
											try {
												if (StringUtils.startsWith(supt.getIsSimpsys(), "2")) { // TODO
													// �պ���Ҫϸ������*/
													outNodeText = ifaceConfigFacade.morph(dto);
												} else {
													outNodeText = ifaceConfigFacade.trans(dto);
												}
											} catch (IfaceConfigException e) {
												logger.warn("�޷�ת����̬���ݣ�����ԭֵ��");
												outNodeText = inNode == null ? "" : inNode.getText();
											}
										}
									}
								}
							} else if ("static".equals(supt.getMappPatt())) {// ��̬����
								MorphDTO dto = new MorphDTO();
								dto.setHostId(applicationId);
								dto.setHostSn(supt.getDeclareSn());
								dto.setNodeName(supt.getOutNode()); // ��Ȼ������ڵ㣿
								if (StringUtils.startsWith(supt.getIsSimpsys(), "1")) { // Դϵͳ
								} else if (StringUtils.startsWith(supt.getIsSimpsys(), "2")) { // ˫ϵͳ
									dto.setHostId(applicationId);
									dto.setSiteId(tgr_applicationId);
									dto.setSiteSn(supt.getMappingSn());
								} else if (StringUtils.startsWith(supt.getIsSimpsys(), "3")) { // Ŀ��ϵͳ
									dto.setHostId(tgr_applicationId);
								} else { // ����
									logger.error("�ڽӿڷ���{}({})��������һ����̬����ת������û�����þ�̬����ת�����͡�", suptFace.getMethodName(), suptFace.getCimpName());
									throw new RuntimeException("��̬����ת������û�����á�");
								}
								dto.setIndicator(StringUtils.substring(supt.getIsSimpsys(), 1));
								if (supt.getInNode() != null && supt.getInNode().trim().length() > 0) {
									inNode = document.selectSingleNode(supt.getInNode());
									if (inNode != null) {
										dto.setNodeText(inNode.getText());
									}
								}
								// ��ͬXML�崦��
								if ("Y".equals(supt.getIsDoubuxml()) && supt.getDoubuChi() != null && supt.getDoubuChi().trim().length() > 0) {
									inNode = nodeFor.selectSingleNode(supt.getDoubuChi());
									if (inNode != null) {
										dto.setNodeText(inNode.getText());
									}
								}
								if (supt.getDepenKey() != null && supt.getDepenKey().trim().length() > 0) {// ���ڴ���ȡ
									dto.setCascadeSn(dependValuesMap.get(supt.getDepenKey()));
								} else if (supt.getDepenNode() != null && !"".equals(supt.getDepenNode().trim())) {// ֱ������
									String cascadeSn = document.selectSingleNode(supt.getDepenNode()).getText();
									dto.setCascadeSn(cascadeSn);
								}
								try {
									if (StringUtils.startsWith(supt.getIsSimpsys(), "2")) { // TODO
										// �պ���Ҫϸ������*/
										outNodeText = ifaceConfigFacade.morph(dto);
									} else {
										outNodeText = ifaceConfigFacade.trans(dto);
									}
								} catch (IfaceConfigException e) {
									logger.warn("�޷�ת����̬���ݣ�����ԭֵ��");
									outNodeText = inNode == null ? "" : inNode.getText();
								}
							} else if (StringUtils.equals(supt.getMappPatt(), "append")) {
								StringBuilder stringBuilder = new StringBuilder();
								inNode = document.selectSingleNode(supt.getInNode());
								stringBuilder.append(inNode == null ? "" : inNode.getText());
								List<Node> nodes = document.selectNodes(supt.getAppendNodes());
								for (Node node : nodes) {
									stringBuilder.append(supt.getAppendChars());
									stringBuilder.append(node.getText());
								}
								outNodeText = stringBuilder.toString();
							} else if (StringUtils.equals(supt.getMappPatt(), "UUID")) { // Ψһ��ʶ
								outNodeText = ifaceConfigFacade.buildGUID();
							} else if (StringUtils.equals(supt.getMappPatt(), "upload")) { // ��������
								Node filePathNode, fileNameNode;
								if ("Y".equals(supt.getIsDoubuxml())) { // ѭ���ӽڵ�
									filePathNode = nodeFor.selectSingleNode(supt.getDoubuChi());
									fileNameNode = nodeFor.selectSingleNode(supt.getFileNameNode());
								} else {
									filePathNode = document.selectSingleNode(supt.getInNode());
									fileNameNode = document.selectSingleNode(supt.getFileNameNode());
								}
								IfaceConfigProtocol ifaceConfigProtocol = ifaceConfigFacade.getProtocol(supt.getServerId());
								String filePath = StringUtils.trim(filePathNode.getText());
								String fileName = StringUtils.trim(fileNameNode.getText());
								StringBuilder stringBuilder = new StringBuilder();
								stringBuilder.append(StringUtils.replace(FilenameUtils.normalizeNoEndSeparator(supt.getAttachHome()), "\\", "/"));
								if (!StringUtils.endsWith(stringBuilder.toString(), "/")) {
									stringBuilder.append("/");
								}
								// stringBuilder.append(DateFormatUtils.format(new
								// java.util.Date(), "yyyyMMddHHmmssSSS"));
								// �������ĳ�32λ��guid����
								stringBuilder.append(this.buildGUID());
								stringBuilder.append(".");
								stringBuilder.append(FilenameUtils.getExtension(fileName));

								IfaceDaemonAttachment ifaceDaemonAttachment = new IfaceDaemonAttachment();
								ifaceDaemonAttachment.setHostId(applicationId);
								ifaceDaemonAttachment.setHostLocation(filePath);
								ifaceDaemonAttachment.setSiteId(supt.getServerId());
								ifaceDaemonAttachment.setSiteLocation(stringBuilder.toString());
								ifaceDaemonAttachment.setAvailable("Y");
								ifaceDaemonAttachment.setUpdateOn(new java.util.Date());
								ifaceConfigFacade.insert(ifaceDaemonAttachment);

								if (StringUtils.equalsIgnoreCase(supt.getPathIndicator(), "L")) {
									stringBuilder.insert(0, ifaceConfigProtocol.getRemotePort()).insert(0, ":");
									stringBuilder.insert(0, ifaceConfigProtocol.getRemoteHost()).insert(0, "ftp://");
								}
								outNodeText = stringBuilder.toString();
							} else if ("cycleToPatch".equals(supt.getMappPatt())) {// ѭ��תƴ��
								String needPatchNodeNames = supt.getMappForFormat();// ��Ҫƴ�ӵĽڵ�
								String seperator = supt.getMappAftFormat();// ƴ�ӽڵ��ķָ���
								String[] needPatchNodeNameArray = null;
								if (seperator != null && !"".equals(seperator) && needPatchNodeNames.indexOf(seperator) != -1) {
									needPatchNodeNameArray = needPatchNodeNames.split(seperator);
								}
								List<Node> nodesList = document.selectNodes(supt.getInNode());
								for (Node node : nodesList) {
									if (needPatchNodeNameArray != null) {// ���ڶ���ӽڵ�
										for (String nodeName : needPatchNodeNameArray) {
											outNodeText += node.selectSingleNode(nodeName).getText() + seperator;
										}
									} else {// ֻ����һ���ӽڵ�
										outNodeText += node.selectSingleNode(needPatchNodeNames).getText() + seperator;
									}
								}
								if (outNodeText != null && outNodeText.length() > 0) {
									outNodeText = outNodeText.substring(0, outNodeText.length() - seperator.length());
								}
							} else if ("patchToCycle".equals(supt.getMappPatt())) {// ƴ��תѭ��
								String needPatchNodeNames = supt.getMappForFormat();// ��Ҫѭ�����ӽڵ�
								String seperator = supt.getMappAftFormat();// ƴ�ӽڵ��ķָ���
								String inValues = document.selectSingleNode(supt.getInNode()).getText();
								String[] needCycleNodeNameArray = null;
								String[] inValueArray = null;
								if (StringUtils.isNotBlank(seperator)) {
									needCycleNodeNameArray = StringUtils.split(needPatchNodeNames, seperator);
									inValueArray = StringUtils.split(inValues, seperator);
								}
								if (!ArrayUtils.isEmpty(inValueArray) && !ArrayUtils.isEmpty(needCycleNodeNameArray) && inValueArray.length >= needCycleNodeNameArray.length && inValueArray.length % needCycleNodeNameArray.length == 0) {
									for (int i = 0; i < inValueArray.length;) {
										for (int j = 0; j < needCycleNodeNameArray.length; j++, i++) {
											outNodeText += "<" + needCycleNodeNameArray[j] + ">" + inValueArray[i] + "</" + needCycleNodeNameArray[j] + ">";
										}
									}
								}
							} else if ("copyAllSonInfo".equals(supt.getMappPatt())) {// ֱ��copy�ӽڵ���������Ϣ�������ӽڵ��е��ӽڵ�
								String inNodeStr = supt.getInNode();
								Node allSonNode = document.selectSingleNode(inNodeStr);
								if (allSonNode != null) {
									String allSonInfo = allSonNode.asXML();
									String sonNodeName = allSonNode.getName();
									// ȥ�����˽ڵ���
									if (allSonInfo != null) {
										int infoLength = allSonInfo.length();
										int nodeNameLength = sonNodeName.length();
										if (infoLength > (nodeNameLength * 2 + 5)) {// ��ʽΪ��<name></name>�����Թ�ʽΪ*2+5
											allSonInfo = allSonInfo.substring(nodeNameLength + 2, infoLength - (nodeNameLength + 3));
											outNodeText = allSonInfo;
										}
									}
								}
							}
							// ����ƴ�ӹ�ϵ�Ľڵ�
							if ("Y".equalsIgnoreCase(supt.getJoinEnable())) {
								if ("N".equals(supt.getIsAnnotate())) {// ����Ҫע�ͣ�ֻҪƴ���ֶ���һ����Ҫע���������ֶ�ע�ͣ�
									boolean isOldHasAnnotate = false;
									if (sbf.indexOf("]]></" + supt.getOutNode() + ">") != -1) {// ����ע���򽫽�������ע�ͽ�β��ȥ��
										sbf.delete(sbf.length() - ("]]></" + supt.getOutNode() + ">").length(), sbf.length());
										isOldHasAnnotate = true;
									} else {// ������ע����ֻȥ��������
										sbf.delete(sbf.length() - ("</" + supt.getOutNode() + ">").length(), sbf.length());
									}
									sbf.append(supt.getJoinName()).append(outNodeText == null ? "" : outNodeText);
									if (isOldHasAnnotate) {// ԭ������ע�ͽ��������ٴ����
										sbf.append("]]></").append(supt.getOutNode()).append(">");
									} else {
										sbf.append("</").append(supt.getOutNode()).append(">");
									}
								} else {// ��Ҫע��
									if (sbf.indexOf("]]></" + supt.getOutNode() + ">") != -1) {// ����ע�ͽ�������ȥ��
										sbf.delete(sbf.length() - ("]]></" + supt.getOutNode() + ">").length(), sbf.length());
									} else {
										sbf.delete(sbf.length() - ("</" + supt.getOutNode() + ">").length(), sbf.length());
									}
									// ����ֶ�ͷ�Ƿ���ע�ͱ�־�����û�������
									if (sbf.substring(sbf.indexOf("<" + supt.getOutNode() + ">")).indexOf("<" + supt.getOutNode() + "><![CDATA[") == -1) {
										sbf.insert(sbf.indexOf("<" + supt.getOutNode() + ">") + ("<" + supt.getOutNode() + ">").length(), "<![CDATA[");
									}
									sbf.append(supt.getJoinName()).append(outNodeText == null ? "" : outNodeText).append("]]></").append(supt.getOutNode()).append(">");
								}
							} else {
								// û��ƴ�����
								if (!"D".equalsIgnoreCase(supt.getIsAnnotate())) {// D:��Ч���������������ת������ʱ��
									sbf.append("<").append(supt.getOutNode()).append(">").append(outNodeText == null ? "" : ("N".equals(supt.getIsAnnotate()) ? outNodeText : "<![CDATA[" + outNodeText + "]]>")).append("</").append(supt.getOutNode()).append(">");
								}
							}
							// �洢֮ǰƥ���ֵ
							if (supt.getDepenKey() != null && supt.getDepenKey().trim().length() > 0 && (supt.getDeclareSn() == null || supt.getDeclareSn().trim().length() == 0)) {
								dependValuesMap.put(supt.getDepenKey(), outNodeText);
							}
						} else {
							// ���νڵ�Ϊ��Ҷ�ӽڵ�
							if (!"D".equalsIgnoreCase(supt.getIsAnnotate())) {// D:��Ч���������������ת������ʱ��
								sbf.append("<").append(supt.getOutNode()).append(">");
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
			errorStr = e.toString();
			// ������
			if (errorType == null || "".equals(errorType)) {
				errorType = SuptConstants.ERROR_TYPE_CHANGER;
			}
		}
		// ���ݴ������ͣ���ѯ����ʽ
		String errTack = "";
		if (errorType != null && !"".equals(errorType)) {
			SuptFaceErrTackExample exp = new SuptFaceErrTackExample();
			exp.createCriteria().andCimpFaceIdEqualTo(methodId);
			exp.createCriteria().andErrBusinessEqualTo(errorType);
			List<SuptFaceErrTack> list = this.selectByExample(exp);
			if (list == null || list.size() < 1) {
				errTack = SuptConstants.ERROR_TACK_POP;
			} else {
				errTack = list.get(0).getErrType();
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("FLAG", flag);
		map.put("ErrStr", errorStr);
		map.put("ErrType", errorType); // ת������
		map.put("ErrTack", errTack); // ����ʽ
		map.put("outXml", sbf != null ? sbf.toString() : document.asXML());
		return map;
	}

	public String getOutXml(String methodId) throws Exception {
		StringBuffer sbf = new StringBuffer(256);
		try {
			// ��ѯ���xml����
			SuptCheckOutExample chexp = new SuptCheckOutExample();
			chexp.createCriteria().andCimpFaceIdEqualTo(methodId);
			chexp.setOrderByClause(" t_supt_check_out.order_id ");
			List<SuptCheckOut> suptList = this.selectByExample(chexp);
			if (suptList != null && suptList.size() > 0) {
				// ѭ�����xml
				sbf.append("&lt;?xml version=\"1.0\" encoding=\"GB2312\"?&gt;<br/>");
				for (SuptCheckOut supt : suptList) {
					// ���νڵ�Ϊ�����ڵ㣬��ֱ����ӽ���������
					if ("Y".equalsIgnoreCase(supt.getOutChidnodeOver())) {
						sbf.append("&lt;/").append(supt.getOutNode()).append("&gt;</br>");
					} else {
						// ���νڵ�ΪҶ�ӽڵ㣬����Ҫ��Ҷ�ӽڵ�ֵ
						if ("Y".equalsIgnoreCase(supt.getOutIschidNode())) {
							// ȡ����νڵ��Ӧ��ֵ
							String outNodeText = "";
							if ("final".equals(supt.getMappPatt())) {
								outNodeText = "";
							} else if ("systime".equals(supt.getMappPatt())) {
								outNodeText = "";
							} else if ("source".equals(supt.getMappPatt())) {
								// Դ���ݲ���ֵ
								outNodeText = "";
							} else if (supt.getInNode() != null && !"".equals(supt.getInNode().trim())) {
								outNodeText = "";
							}
							// ����ƴ�ӹ�ϵ�Ľڵ�
							if (supt.getJoinName() != null && !"".equals(supt.getJoinName().trim())) {
								sbf.delete(sbf.length() - ("&lt;/" + supt.getOutNode() + "&gt;").length(), sbf.length()).append(supt.getJoinName()).append(outNodeText).append("&lt;/").append(supt.getOutNode()).append("&gt;</br>");
							} else {
								// û��ƴ�����
								sbf.append("&lt;").append(supt.getOutNode()).append("&gt;").append(outNodeText).append("&lt;/").append(supt.getOutNode()).append("&gt;</br>");
							}
						} else {
							// ���νڵ�Ϊ��Ҷ�ӽڵ�
							sbf.append("&lt;").append(supt.getOutNode()).append("&gt;</br>");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sbf.toString();
	}

	public List<SuptCheck> selectSuptCheckByExample(SuptCheckExample exp) throws Exception {
		List<SuptCheck> supt = this.suptCheckDAO.selectFaceByExample(exp);
		return supt;
	}

	public String deleteCheck(String ids) throws Exception {
		String[] checkIds = ids.split(",");
		for (String id : checkIds) {
			SuptCheckKey key = new SuptCheckKey();
			key.setCheckId(id);
			this.suptCheckDAO.deleteByPrimaryKey(key);
		}
		return null;
	}

	public List<SuptCheckOut> selectCheckOutByExample(SuptCheckOutExample exp) throws Exception {
		List<SuptCheckOut> supt = this.suptCheckOutDAO.selectCheckOutByExample(exp);
		return supt;
	}

	public String deleteCheckOut(String ids) throws Exception {
		String[] sendIds = ids.split(",");
		for (String id : sendIds) {
			SuptCheckOutKey key = new SuptCheckOutKey();
			key.setSendId(id);
			this.suptCheckOutDAO.deleteByPrimaryKey(key);
		}
		return null;
	}

	public String insertReturn(SuptReturn sre) throws Exception {
		suptReturnDAO.insert(sre);
		return null;
	}

	public String deleteReturnValue(String ids) throws Exception {
		String[] sendIds = ids.split(",");
		for (String id : sendIds) {
			SuptReturnValidKey key = new SuptReturnValidKey();
			key.setReturnValidId(id);
			this.suptReturnValidDAO.deleteByPrimaryKey(key);
		}
		return null;
	}
}