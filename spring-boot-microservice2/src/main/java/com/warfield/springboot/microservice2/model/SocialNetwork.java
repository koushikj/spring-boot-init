package com.warfield.springboot.microservice2.model;

public class SocialNetwork {
    private int id;
    private String name;
    private String desc;
    private String type;

    public SocialNetwork(){}

    public SocialNetwork(int id, String name, String desc, String type) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
