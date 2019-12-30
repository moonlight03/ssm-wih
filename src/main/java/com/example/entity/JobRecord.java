package com.example.entity;

public class JobRecord {
    private Integer jreid;
    private String tid;
    private String cid;
    private String jid;

    public JobRecord(String tid, String cid, String jid) {
        this.tid = tid;
        this.cid = cid;
        this.jid = jid;
    }

    public Integer getJreid() {
        return jreid;
    }

    public void setJreid(Integer jreid) {
        this.jreid = jreid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }
}
