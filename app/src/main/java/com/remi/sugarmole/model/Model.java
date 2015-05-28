package com.remi.sugarmole.model;

import android.util.Log;

import org.json.JSONArray;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by remi on 27/05/15.
 */
public class Model {
    private static Model ourInstance = new Model();

    public static Model getInstance() {
        return ourInstance;
    }
    /*******/



    private URL url;
    private HttpURLConnection conn;
    private int response;

    public int getResponse() {
        return response;
    }

    public void createHouse()
    {

    }

    public void createAccount()
    {

    }

    public void connect()
    {

    }

    public void connectToApi()
    {

    }

    public JSONArray checkUsers()
    {
        Client test = new Client();
        Response res;

        try {
            res = test.execute("/user").get();
            System.out.println("lala " + res.getCode() + res.getResponse());
        }
        catch (Exception e)
        {
            System.out.println("lili " + e.getMessage());
        }
        return null;
    }


    private Model() {

    }

}
