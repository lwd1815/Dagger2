package com.example.lwd18.dagger2;

import android.app.Application;
import android.content.Context;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 10:27
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

public class App extends Application {

  private static App app=null;
  private Context mcontext;

  private App(){

  }

  @Override public void onCreate() {
    super.onCreate();
    this.mcontext=getApplicationContext();
  }

  public static App getInstance() {
    if (app == null) {
      synchronized (App.class) {
        if (app == null) {
          app = new App();
        }
      }
    }
    return app;
  }

  public Context getContext(){
    return mcontext;
  }
}
