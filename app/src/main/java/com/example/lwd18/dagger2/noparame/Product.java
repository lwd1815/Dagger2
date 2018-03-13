package com.example.lwd18.dagger2.noparame;

import javax.inject.Inject;

/**
 * 创建者     李文东
 * 创建时间   2018/3/12 17:53
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

public class Product {
  /**
   * 第一种,无参构造,利用inject标注,表示Product可以被dagger2实例化
   */
  private int test;
  @Inject
  public Product(){
    test=12;
  }

  public int getTest(){
    return test;
  }
}
