package com.matao.buder.entity;

import java.util.Map;

public class Practice {
    private int prac_no = 0;
    private boolean isradio = true;
    private String practice_title = "";
    private Map radiomap = null;

    public Practice(int prac_no, boolean isradio, String practice_title, Map radiomap) {
        this.prac_no = prac_no;
        this.isradio = isradio;
        this.practice_title = practice_title;
        this.radiomap = radiomap;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "prac_no=" + prac_no +
                ", isradio=" + isradio +
                ", practice_title='" + practice_title + '\'' +
                ", radiomap=" + radiomap +
                '}';
    }

    public int getPrac_no() {
        return prac_no;
    }

    public void setPrac_no(int prac_no) {
        this.prac_no = prac_no;
    }

    public boolean isIsradio() {
        return isradio;
    }

    public void setIsradio(boolean isradio) {
        this.isradio = isradio;
    }

    public String getPractice_title() {
        return practice_title;
    }

    public void setPractice_title(String practice_title) {
        this.practice_title = practice_title;
    }

    public Map getRadiomap() {
        return radiomap;
    }

    public void setRadiomap(Map radiomap) {
        this.radiomap = radiomap;
    }
}
