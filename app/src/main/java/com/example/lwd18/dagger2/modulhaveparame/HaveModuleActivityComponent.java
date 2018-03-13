package com.example.lwd18.dagger2.modulhaveparame;

import dagger.Component;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 10:10
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */
@Component(modules = HaveModules.class)
public interface HaveModuleActivityComponent {
  void inject(HaveModuleActivity haveModuleActivity);
}
