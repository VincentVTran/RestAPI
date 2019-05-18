package com.Backend.Test.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private String username;
    private String password;

    public Person(@JsonProperty("username") String username,
                  @JsonProperty("password") String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
    public void setUsername(String user){
        this.username = user;
    }
}
