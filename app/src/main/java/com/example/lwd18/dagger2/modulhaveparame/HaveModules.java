package com.example.lwd18.dagger2.modulhaveparame;

import android.os.Environment;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 10:09
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */
@Module
public class HaveModules {

  /**
   *复杂module的使用.如果我们希望在使用的时候传入一些配置,直接使用Module的构造参数传入即可,不过接收时要在被指定的ACticity中
   * 的component实例化的时候用build模式传入我们的值
   */
  private int cacheSize;
  public HaveModules(int cacheSize){
    this.cacheSize=cacheSize;
    System.out.println("HaveModules");
  }

  @Provides OkHttpClient provideOkhttpClient(){
    OkHttpClient client=new OkHttpClient();
    String path=Environment.getExternalStorageDirectory()+"/";
    File httpCacheDirectory=new File(path,"dagger2");
    Cache cache=new Cache(httpCacheDirectory,this.cacheSize);
    client.newBuilder().cache(cache);
    System.out.println("path=="+path+"==="+this.cacheSize+"====="+cache);
    System.out.println("OkHttpClient");
    return client;
  }

  /**
   * 如果被@Provides标注的方法带有参数,
   * dagger2会自动寻找本Module中其他返回值类型为参数的类型的且被@Provides标注的方法(可以找到provideOkhttpClient)
   * 如果本Module中找不到就会去看这个类的构造参数是否被@Inject标注了
   *
   * 通过打印发现在走到此方法前,已经走了provideOkhttpClient(),此方法传过来的okhttpClient已经是被设置过得
   * @param client
   * @return
   */
  @Provides RetrofitManager provideRetrofitManager(OkHttpClient client){
    System.out.println("RetrofitManager");
    return new RetrofitManager(client);
  }
}
