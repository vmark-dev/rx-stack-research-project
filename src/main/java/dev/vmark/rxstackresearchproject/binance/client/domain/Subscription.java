package dev.vmark.rxstackresearchproject.binance.client.domain;


import org.json.JSONObject;

import java.util.Collection;

//webSocket.send("{\"method\": \"SUBSCRIBE\", \"params\": [\"xrpbtc@kline_1m\",\"ethbtc@kline_1m\" ],  \"id\": 1}");
public class Subscription {

    private String method = "SUBSCRIBE";
    private Collection<String> params;
    private Integer id;

    public Subscription() {
    }

    public Subscription(Collection<String> params, Integer id) {
        this.params = params;
        this.id = id;
    }

    public Subscription(String method, Collection<String> params, Integer id) {
        this.method = method;
        this.params = params;
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Collection<String> getParams() {
        return params;
    }

    public void setParams(Collection<String> params) {
        this.params = params;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    // create by build json plugin
    public String toJson() {
        JSONObject jo = new JSONObject();
        jo.put("method", method);
        jo.put("params", params);
        jo.put("id", id);
        return jo.toString();
    }

    @Override
    public String toString() {
        return toJson().toString();
    }
}
