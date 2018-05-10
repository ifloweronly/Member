package com.iflower.member.common;

import com.alibaba.fastjson.JSONObject;

public class JsonRequest {

    public JsonRequest() {

    }

    public String toJson() {
        return JSONObject.toJSONString(this);
    }
}
