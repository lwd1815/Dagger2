package com.example.lwd18.dagger2.modulhaveparame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.example.lwd18.dagger2.R;
import javax.inject.Inject;

public class HaveModuleActivity extends AppCompatActivity {

  @Inject
  RetrofitManager retrofitManager;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_have_module);
    /**
     * 在module中设置的参数,在此处传值
     */
    DaggerHaveModuleActivityComponent.builder().haveModules(new HaveModules(100))
        .build().inject(this);

    Toast.makeText(HaveModuleActivity.this, ""
        +retrofitManager.hashCode()
        +"\n"+retrofitManager.getOkHttpClient().hashCode()
        +"\n"+retrofitManager.getOkHttpClient().cache()
        , Toast.LENGTH_SHORT).show();
  }
}
