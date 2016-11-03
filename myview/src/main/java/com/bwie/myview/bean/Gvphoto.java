package com.bwie.myview.bean;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Gvphoto {
    private int gvimg;
    private String gvname;

    public Gvphoto() {
    }

    public Gvphoto(int gvimg, String gvname) {

        this.gvimg = gvimg;
        this.gvname = gvname;
    }

    public int getGvimg() {
        return gvimg;
    }

    public void setGvimg(int gvimg) {
        this.gvimg = gvimg;
    }

    public String getGvname() {
        return gvname;
    }

    public void setGvname(String gvname) {
        this.gvname = gvname;
    }
}
