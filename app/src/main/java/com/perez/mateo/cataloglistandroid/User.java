package com.perez.mateo.cataloglistandroid;

/**
 * Created by pc on 5/07/2017.
 */

public class User {

    private String name;
    private String email;
    private String id;


    public User()
    {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}