package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Goods implements Serializable {
    private Integer idl;
    private String goodsname;
    private String address;
    private Date goodsdate;
    private Double price;

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "idl=" + idl +
                ", goodsname='" + goodsname + '\'' +
                ", address='" + address + '\'' +
                ", goodsdate=" + goodsdate +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(idl, goods.idl) &&
                Objects.equals(goodsname, goods.goodsname) &&
                Objects.equals(address, goods.address) &&
                Objects.equals(goodsdate, goods.goodsdate) &&
                Objects.equals(price, goods.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idl, goodsname, address, goodsdate, price);
    }

    public Integer getIdl() {
        return idl;
    }

    public void setIdl(Integer idl) {
        this.idl = idl;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getGoodsdate() {
        return goodsdate;
    }

    public void setGoodsdate(Date goodsdate) {
        this.goodsdate = goodsdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods(Integer idl, String goodsname, String address, Date goodsdate, Double price) {
        this.idl = idl;
        this.goodsname = goodsname;
        this.address = address;
        this.goodsdate = goodsdate;
        this.price = price;
    }
}
