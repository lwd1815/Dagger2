package com.example.lwd18.dagger2.haveparame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.lwd18.dagger2.R;
import javax.inject.Inject;

public class HaveActivity extends AppCompatActivity {
   @Inject
   Factor factor;
  private TextView test;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_have);
    test = findViewById(R.id.test);
    DaggerHaveActivityComponent.create().inject(this);
    test.setText("我是有参传过来的数据:"+factor.product.getTest());
  }
}
