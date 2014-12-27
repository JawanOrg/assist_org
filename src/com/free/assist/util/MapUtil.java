package com.free.assist.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.httpclient.util.EncodingUtil;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.free.assist.domain.SuptPointInfo;
import com.free.assist.domain.SuptPointInfoExample;
import com.free.assist.service.common.CommonOperateService;

public class MapUtil {
    public static JSONArray queryByPointTypeAndGrade(String pointType, int grade) {
        CommonOperateService commonOperateService =
                SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
        SuptPointInfoExample pointEx = new SuptPointInfoExample();
        pointEx.createCriteria().andPointTypeEqualTo(pointType).andGradeLessThanOrEqualTo(grade);
        @SuppressWarnings("unchecked")
        List<SuptPointInfo> pointList = commonOperateService.selectByExample(pointEx);
        JSONArray jsonData = JSONArray.fromObject(pointList);
        return jsonData;
    }

    /**
     * @param keyword
     * @param bounds 39.915,116.404,39.975,116.414
     * @return
     */
    public static String queryByKeywordInBounds(String keyword, String bounds) {
        String path = "http://api.map.baidu.com/geosearch/v3/bound";
        String uri =
                path + "?geotable_id=36222&bounds=" + bounds + "&q=" + keyword
                        + "&output=json&ak=A4491ae6c5c39b359ce21b8d7c5a0d56";
        String strResult = "";
        try {
            HttpGet httpget = new HttpGet(EncodingUtil.getAsciiString(uri.getBytes()));
            HttpResponse response = HttpClientBuilder.create().build().execute(httpget);
            if (response.getStatusLine().getStatusCode() == 200) {
                String conResult = EntityUtils.toString(response.getEntity());
                JSONObject sobj = JSONObject.fromObject(conResult);
                String status = sobj.getString("status");
                if (status.equals("0")) {
                    strResult = conResult;
                } else {
                    strResult += "∑¢ÀÕ ß∞‹:" + conResult;
                }
            } else {
                String err = response.getStatusLine().getStatusCode() + "";
                strResult += "∑¢ÀÕ ß∞‹:" + err;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strResult;
    }

    public static String queryAreaAllPoint(String area) {
        String path = "http://api.map.baidu.com/geosearch/v3/local";
        String uri = path + "?ak=A4491ae6c5c39b359ce21b8d7c5a0d56&geotable_id=36222&region="+area;
        HttpGet httpget = new HttpGet(EncodingUtil.getAsciiString(uri.getBytes()));
        String strResult = "";
        try {
            HttpResponse response = HttpClientBuilder.create().build().execute(httpget);
            if (response.getStatusLine().getStatusCode() == 200) {
                String conResult = EntityUtils.toString(response.getEntity());
                JSONObject sobj = JSONObject.fromObject(conResult);
                String status = sobj.getString("status");
                if (status.equals("0")) {
                    strResult += conResult;
                } else {
                    strResult += conResult;
                }
            } else {
                String err = response.getStatusLine().getStatusCode() + "";
                strResult += "∑¢ÀÕ ß∞‹:" + err;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strResult;
    }

    public static String savePoint(String address, String lng, String lat) {
        String strResult = "";
        String title = Helper.getCurrentTime();
        String ak = "A4491ae6c5c39b359ce21b8d7c5a0d56";

        HttpClient httpclient = HttpClientBuilder.create().build();
        String smsUrl = "http://api.map.baidu.com/geodata/v3/poi/create";
        HttpPost httppost = new HttpPost(smsUrl);

        try {
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("title", title));
            nameValuePairs.add(new BasicNameValuePair("address", address));
            nameValuePairs.add(new BasicNameValuePair("latitude", lat));
            nameValuePairs.add(new BasicNameValuePair("longitude", lng));
            nameValuePairs.add(new BasicNameValuePair("coord_type", "3"));
            nameValuePairs.add(new BasicNameValuePair("geotable_id", "36222"));
            nameValuePairs.add(new BasicNameValuePair("ak", ak));

            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));

            HttpResponse response = httpclient.execute(httppost);
            if (response.getStatusLine().getStatusCode() == 200) {
                String conResult = EntityUtils.toString(response.getEntity(), "UTF-8");
                JSONObject sobj = JSONObject.fromObject(conResult);
                String status = sobj.getString("status");
                String message = sobj.getString("message");
                if (status.equals("0")) {
                    strResult += message;
                } else {
                    strResult += message;
                }

            } else {
                String err = response.getStatusLine().getStatusCode() + "";
                strResult += err;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CommonOperateService commonOperateService =
                SpringContextUtil.getBean("commonOperateService", CommonOperateService.class);
        SuptPointInfo point = new SuptPointInfo();
        point.setAddress(address);
        point.setLatitude(lat);
        point.setLongitude(lng);
        point.setName(title);
        point.setPointType(Constant.POINT_TYPE_DYNAMIC);
        point.setImageType(Constant.IMAGE_TYPE_NORMAL);
        point.setGrade(10);
        commonOperateService.insert(point);

        return strResult;
    }
}
