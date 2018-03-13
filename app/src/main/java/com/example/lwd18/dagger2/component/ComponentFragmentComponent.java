package com.example.lwd18.dagger2.component;

import dagger.Subcomponent;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 12:05
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

/**
 * 因为fragment和acticity都需要同一个依赖retrofitmanager,所以不用另写framgnetmodule,只需要集成activity的component即可
 * 利用dependencies来集成actiity的component
 */

@Subcomponent //第二种依赖
//@Component(dependencies = ComponentActivityComponent.class)
public interface ComponentFragmentComponent {
  void inject(CompontFragment compontFragment);

}
