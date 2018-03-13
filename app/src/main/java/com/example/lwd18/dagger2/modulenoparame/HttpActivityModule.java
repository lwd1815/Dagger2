package com.example.lwd18.dagger2.modulenoparame;

/**
 * 创建者     李文东
 * 创建时间   2018/3/12 19:05
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * 直接给构造函数添加@Inject标注的方式对于我们自己编写的代码肯定是没问题，但若是我们引入的第三方库不能随意改动代码的话就不方便了.
 * 这时我们就要采取间接的方式了,可以理解外包装,在module中利用provides注解第三方库,就相当于用inject注解我们自己定义的类
 */
@Module
public class HttpActivityModule {

  /**
   * 返回值是我们要inject的类
   * @return
   */
  @Provides
  OkHttpClient provideOkHttpClient(){
    return new OkHttpClient();
  }


}
