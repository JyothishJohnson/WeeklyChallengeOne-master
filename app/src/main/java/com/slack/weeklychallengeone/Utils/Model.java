package com.slack.weeklychallengeone.Utils;

public class Model {
    private String name;
    private String actions;

    public Model(String name,String actions) {
        this.name = name;
        this.actions =actions;
    }

    public String getName() {
        return name;
    }

    public String getActions(){
        return actions;
    }

}
