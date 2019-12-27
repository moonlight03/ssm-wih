package com.example.entity;

public class Student {
    private String sid;
    private String sname;
    private String gender;
    private String classid;
    private String email;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student(String sid, String sname, String gender, String classid, String email, String phone) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.classid = classid;
        this.email = email;
        this.phone = phone;
    }

    public Student(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
