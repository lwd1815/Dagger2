package com.example.lwd18.dagger2.component;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 10:42
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

public class RetrofitManager {
  static final String BASE_URL = "http://news-at.zhihu.com/api/4/news/";
  private Retrofit retrofit;
  private  OkHttpClient okHttpClient;

  //public static RetrofitManager getInstance(OkHttpClient client) {
  //  okHttpClient=client;
  //  return ourInstace;
  //}

  public RetrofitManager(OkHttpClient client){
    okHttpClient=client;
  }
  /**
   * 获取retrofit实例
   */

  public Retrofit getRetrofit() {
    if (retrofit == null) {
      retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
          .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
          .addConverterFactory(FastJsonConverterFactory.create())
          .build();
    }
    return retrofit;
  }

  public  OkHttpClient getOkHttpClient() {
    return okHttpClient;
  }
}
