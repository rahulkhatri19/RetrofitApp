package com.example.rahul.contact;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rahul on 19-12-2017.
 */

public class Contact {

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
