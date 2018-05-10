package com.iflower.member.request;

import com.iflower.member.common.JsonRequest;

import javax.validation.constraints.NotBlank;

public class LoginRequest extends JsonRequest {
    @NotBlank(message = "Can not be null")
    private String loginName;
    @NotBlank(message = "Can not be null")
    private String pwd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }





}
