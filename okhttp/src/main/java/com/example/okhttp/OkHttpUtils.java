package com.example.okhttp;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/11/4.
 */
public class OkHttpUtils {

    private static OkHttpClient  mClient;
    //设置标题头格式
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static OkHttpClient getOkHttpClient(){
         if(mClient==null){

             mClient=new OkHttpClient.Builder()
                     .build();


         }
        return mClient;

   }

    /**
     * 同步get
     * @param url
     * @return
     */
    public static String get(String url){

        Request request =new Request.Builder()
                .url(url)
                .build();
        try {
            Call call = getOkHttpClient().newCall(request);
            Response response = call.execute();
            if(response.isSuccessful()){
                return response.body().string();
            }else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }





}
