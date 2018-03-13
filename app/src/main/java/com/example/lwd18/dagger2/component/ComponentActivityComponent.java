package com.example.lwd18.dagger2.component;

/**
 * 创建者     李文东
 * 创建时间   2018/3/13 12:00
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

import dagger.Component;

/**
 * 父component
 *
 * 第一种依赖方式dependencies
 *
 */
@Component(modules = ComponentActivityModule.class)
public interface ComponentActivityComponent {
  /**
   * 显示显示子需要暴露可提供给子Component的依赖
   */

  //RetrofitManager providRetrofitManger();

  /**
   * 第二种依赖方式
   * subComponent
   *
   * 1、先定义子Component，使用@Subcomponent标注（不可同时再使用@Component）；
     2、父Component中定义获得子Component的方法；
   */

  ComponentFragmentComponent componentFragmentComponent();
}
