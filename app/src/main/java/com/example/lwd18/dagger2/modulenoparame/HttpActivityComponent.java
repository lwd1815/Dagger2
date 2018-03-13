package com.example.lwd18.dagger2.modulenoparame;

import dagger.Component;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 9:48
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

/**
 * 用component来注解component类,并指定module类型
 */
@Component(modules = HttpActivityModule.class)
public interface HttpActivityComponent {
  void inject(HttpActivity httpActivity);
}
