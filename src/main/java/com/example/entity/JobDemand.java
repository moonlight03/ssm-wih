package com.example.entity;

import java.util.Date;
public class JobDemand {
    private String jid;
    private String context;
    private Date deadline;

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
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

    public JobDemand(String id, String context, Date deadline) {
        this.context = context;
        this.deadline = deadline;
    }
}
