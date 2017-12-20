package com.example.rahul.contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Rahul on 19-12-2017.
 */

public interface ApiInterface {

    @POST("readcontacts.php")
    Call<List<Contact>> getContacts();
}
