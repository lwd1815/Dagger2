package com.example.lwd18.dagger2.noparame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.lwd18.dagger2.R;
import javax.inject.Inject;

public class FactorActivity extends AppCompatActivity {
  /**
   *  利用inject注入被inject标记的实例
   */
  @Inject
  Product product;
  private TextView textView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fa);
    textView = findViewById(R.id.test_no);
    /**
     * 写好inject和componnet后,利用buile---market project重构项目,会生成我们编写的Component所对应的类，生成的类的名字的格式为 "Dagger+我们所定义的Component的名字"
     * 在需要注入的类中使用@Inject标注要注入的变量；然后调用自动生成的Component类的方法create()或builder().build()，
     * 然后inject到当前类；在这之后就可以使用这个@Inject标注的变量了。
     */
    DaggerFactorActivityComponent.create().inject(this);

    textView.setText("我是无参构造传过来的数据:"+product.getTest());
  }
}
