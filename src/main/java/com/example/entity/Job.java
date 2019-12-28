package com.example.entity;

import java.util.Date;
public class Job {
    private Integer jid;
    private String context;
    private Date deadline;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Job(Integer jid, String context, Date deadline) {
        this.jid = jid;
        this.context = context;
        this.deadline = deadline;
    }
}
