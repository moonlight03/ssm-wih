package com.example.entity;

public class Teacher {
    private String tid;
    private String tname;
    private String gender;
    private String email;
    private String phone;

    public Teacher(String tid, String tname, String gender, String email, String phone) {
        this.tid = tid;
        this.tname = tname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
