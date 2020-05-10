package com.warfield.springboot.microservice2.model;

public class UserAccounts {
    private User userId;
    private SocialNetwork socialNetwork;

    public UserAccounts(){}

    public UserAccounts(User userId, SocialNetwork socialNetwork) {
        this.userId = userId;
        this.socialNetwork = socialNetwork;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public SocialNetwork getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
}
