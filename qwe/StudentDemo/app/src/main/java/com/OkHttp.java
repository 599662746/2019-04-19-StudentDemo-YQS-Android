package com;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OkHttp {

    public OkHttp(String Canshu , String action , Callback callback) {
        MediaType mediaType = MediaType.parse("application/json;charset=utf-8");
        RequestBody body = RequestBody.create(mediaType,Canshu);
        String URL = "http://10.1.1.201:8088/transportservice/action/"+action;
        Request request = new Request.Builder()
                .post(body)
                .url(URL)
                .build();

        OkHttpClient client = new OkHttpClient();
        Call call =client.newCall(request);
        call.enqueue(callback);

    }

}
