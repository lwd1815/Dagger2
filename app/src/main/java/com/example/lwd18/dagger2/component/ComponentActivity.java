package com.example.lwd18.dagger2.component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.lwd18.dagger2.R;

public class ComponentActivity extends AppCompatActivity {

  /**
   * Component 依赖Component
   * 当我们其中一个Component跟另外一个Component所提供的依赖有重复的时候，我们没有必要完全再写一遍，
   * 一个Component是可以依赖另外一个依赖的，理解起来就像extends关键字；有两种实现方式：
   *
   * @param savedInstanceState
   */

  private ComponentActivityComponent componentActivityComponent;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_component);
    componentActivityComponent=DaggerComponentActivityComponent.builder()
        .componentActivityModule(new ComponentActivityModule(200))
        .build();
  }

  @Override protected void onResume() {
    super.onResume();
    getFragmentManager().beginTransaction().replace(R.id.fragment,CompontFragment.getInstance()).commit();
  }

  public ComponentActivityComponent getComponentActivityComponent(){
    return componentActivityComponent;
  }
}
