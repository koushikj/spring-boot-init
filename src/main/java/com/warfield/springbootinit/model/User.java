package com.warfield.springbootinit.model;

public class User {
    private int id;
    private String name;
    private String emailId;
    private int socialAccountId;

    public User(){}

    public User(int id, String name, String emailId, int socialAccountId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.socialAccountId = socialAccountId;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getSocialAccountId() {
        return socialAccountId;
    }

    public void setSocialAccountId(int socialAccountId) {
        this.socialAccountId = socialAccountId;
    }
}
