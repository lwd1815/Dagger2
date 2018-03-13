package com.example.lwd18.dagger2.noparame;

import dagger.Component;

/**
 * 创建者     李文东
 * 创建时间   2018/3/12 17:56
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

/**
 * 利用component注解一个接口,定义一个inject方法,主要是为了表示将被inject标注的类注入到的位置(FactorActivity)
 */
@Component
public interface FactorActivityComponent {
  void inject(FactorActivity factorActivity);
}
