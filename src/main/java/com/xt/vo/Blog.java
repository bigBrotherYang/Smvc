package com.xt.vo;

public class Blog {
    private int bid;
    private String context;
    private String userId;
    private String type;

    public Blog() {
    }

    public Blog(int bid, String context, String userId, String type) {
        this.bid = bid;
        this.context = context;
        this.userId = userId;
        this.type = type;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
