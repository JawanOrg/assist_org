package com.free.assist.web.map;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;

import com.free.assist.util.MapUtil;
import com.free.assist.web.BaseAction;

@Controller("/map/mapOperateAction")
public class MapOperateAction extends BaseAction {


    public String queryByKeywordInBounds(String keyword, String bounds) throws Exception {
        return MapUtil.queryByKeywordInBounds(keyword, bounds);
    }

    public String queryByPointTypeAndGrade(String pointType, int grade) {
        JSONArray jsonArray = MapUtil.queryByPointTypeAndGrade(pointType, grade);
        return jsonArray.toString();
    }

    public String savePoint(String address, String lng, String lat) throws Exception {
        return MapUtil.savePoint(address, lng, lat);
    }

    public String queryAreaAllPoint(String area) {
        return MapUtil.queryAreaAllPoint(area);
    }
}
