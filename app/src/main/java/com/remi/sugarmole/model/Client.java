package com.remi.sugarmole.model;

import android.os.AsyncTask;

import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by remi on 27/05/15.
 */
public class Client extends AsyncTask<String, Void, Response> {
    private static final String SERVER_ADRESS = "http://54.72.214.104/api";
    Response res;
    HttpURLConnection conn;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected Response doInBackground(String... params) {

        int code;
        String res;
        try {
            URL url = new URL(SERVER_ADRESS + params[0]);
            conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            // Starts the query
            conn.connect();
            InputStream in = new BufferedInputStream(conn.getInputStream());
            res = IOUtils.toString(in);
            code = conn.getResponseCode();
        }
        catch (IOException e)
        {
            res = "";
            code = -1;
        }

        return new Response(code, res);
    }

}
