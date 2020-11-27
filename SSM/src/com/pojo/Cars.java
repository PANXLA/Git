package com.pojo;

import java.util.Date;

public class Cars {
    private Integer id;

    private String carnumber;

    private String color;

    private String cartype;

    private Double price;

    private Double deposit;

    private Double rentprice;

    private String isrenting;

    private String description;

    private String buyTime;

    private String carimag;

    private String insurainfo;

    private String weihuinfo;

    private String weizhanginfo;

    private String timerange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getRentprice() {
        return rentprice;
    }

    public void setRentprice(Double rentprice) {
        this.rentprice = rentprice;
    }

    public String getIsrenting() {
        return isrenting;
    }

    public void setIsrenting(String isrenting) {
        this.isrenting = isrenting == null ? null : isrenting.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public String getCarimag() {
        return carimag;
    }

    public void setCarimag(String carimag) {
        this.carimag = carimag == null ? null : carimag.trim();
    }

    public String getInsurainfo() {
        return insurainfo;
    }

    public void setInsurainfo(String insurainfo) {
        this.insurainfo = insurainfo == null ? null : insurainfo.trim();
    }

    public String getWeihuinfo() {
        return weihuinfo;
    }

    public void setWeihuinfo(String weihuinfo) {
        this.weihuinfo = weihuinfo == null ? null : weihuinfo.trim();
    }

    public String getWeizhanginfo() {
        return weizhanginfo;
    }

    public void setWeizhanginfo(String weizhanginfo) {
        this.weizhanginfo = weizhanginfo == null ? null : weizhanginfo.trim();
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }
}