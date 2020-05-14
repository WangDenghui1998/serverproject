package com.example.server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Company {

    private int id;
    private String comname;
    private String teamid;
    private String busid;
    private String comid;
    private String adress;
    private String user;
    private String userphone;
    private int state;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date regdate;
    private int province;

    public Company() {
    }

    public Company(int id, String comname, String teamid, String busid, String comid, String adress, String user, String userphone, int state, Date regdate, int province) {
        this.id = id;
        this.comname = comname;
        this.teamid = teamid;
        this.busid = busid;
        this.comid = comid;
        this.adress = adress;
        this.user = user;
        this.userphone = userphone;
        this.state = state;
        this.regdate = regdate;
        this.province = province;
    }
    public Company(String comname,String teamid,String comid,int province,int state){
        this.comname=comname;
        this.teamid=teamid;
        this.comid=comid;
        this.province=province;
        this.state=state;
    }
    public Company(String comname,String teamid,String comid,int province){
        this.comname=comname;
        this.teamid=teamid;
        this.comid=comid;
        this.province=province;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", comname='" + comname + '\'' +
                ", teamid='" + teamid + '\'' +
                ", busid='" + busid + '\'' +
                ", comid='" + comid + '\'' +
                ", adress='" + adress + '\'' +
                ", user='" + user + '\'' +
                ", userphone='" + userphone + '\'' +
                ", state=" + state +
                ", regdate=" + regdate +
                ", province=" + province +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getBusid() {
        return busid;
    }

    public void setBusid(String busid) {
        this.busid = busid;
    }

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }
}
