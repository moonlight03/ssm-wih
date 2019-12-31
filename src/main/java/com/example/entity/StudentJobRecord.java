package com.example.entity;

public class StudentJobRecord {

    private Integer sjid;
    private String tname;
    private String sid;
    private String jid;
    private Integer status;

    public StudentJobRecord(String tname, String sid, String jid, Integer status) {
        this.tname = tname;
        this.sid = sid;
        this.jid = jid;
        this.status = status;
    }

    public Integer getSjid() {
        return sjid;
    }

    public void setSjid(Integer sjid) {
        this.sjid = sjid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
