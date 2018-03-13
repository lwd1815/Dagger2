package com.example.lwd18.dagger2.haveparame;

import javax.inject.Inject;

/**
 * 创建者     李文东
 * 创建时间   2018/3/12 18:49
 * 描述
 * 更新者     $Author$
 * 更新时间   $Date$
 * 更新描述
 */

public class HaveProject {
  private int test;
  @Inject
  public HaveProject(){
    test=20;
  }

  public int getTest() {
    return test;
  }
}
