package com.remi.sugarmole.model;

import org.json.JSONArray;

/**
 * Created by remi on 28/05/15.
 */
public class Response {
    int code;
    String response;

    public Response(int code, String response) {
        this.code = code;
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
