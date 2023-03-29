package com.imooc.collection.set;

import java.util.Objects;

public class Goods {
    private String sn;
    private String title;

    public Goods() {
    }

    public Goods(String sn, String title) {
        this.sn = sn;
        this.title = title;
    }

    /**
     * 获取
     * @return sn
     */
    public String getSn() {
        return sn;
    }

    /**
     * 设置
     * @param sn
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Goods{sn = " + sn + ", title = " + title + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(sn, goods.sn) && Objects.equals(title, goods.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sn);
    }
}
