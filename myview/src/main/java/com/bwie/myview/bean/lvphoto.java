package com.bwie.myview.bean;

/**
 * Created by Administrator on 2016/11/3.
 */
public class lvphoto {
    private int lvimg;
    private String lvtitle;
    private String lvtime;

    public int getLvimg() {
        return lvimg;
    }

    public void setLvimg(int lvimg) {
        this.lvimg = lvimg;
    }

    public String getLvtitle() {
        return lvtitle;
    }

    public void setLvtitle(String lvtitle) {
        this.lvtitle = lvtitle;
    }

    public String getLvtime() {
        return lvtime;
    }

    public void setLvtime(String lvtime) {
        this.lvtime = lvtime;
    }

    public lvphoto(int lvimg, String lvtitle, String lvtime) {
        this.lvimg = lvimg;
        this.lvtitle = lvtitle;
        this.lvtime = lvtime;
    }

    public lvphoto() {
    }
}
