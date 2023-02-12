package com.matao.buder.entity;

public class Subject {
    private String name = "";
    private int icon = 0;
    private String desc = "";

    public Subject(String name, int icon, String desc) {
        this.name = name;
        this.icon = icon;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", icon=" + icon +
                ", desc='" + desc + '\'' +
                '}';
    }
}
