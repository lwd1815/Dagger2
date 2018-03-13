package com.example.lwd18.dagger2.modulenoparame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.example.lwd18.dagger2.R;
import javax.inject.Inject;
import okhttp3.OkHttpClient;

public class HttpActivity extends AppCompatActivity {

  /**
   * 利用module对三方类注解后,在这里就可以利用inject拿到
   * @param savedInstanceState
   */

  @Inject
  OkHttpClient okHttpClient;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_http);

    /**
     * make project后可以生成对应的daggercommpnet类,在被指订的方法中创建并调用inject
     */
    DaggerHttpActivityComponent.builder().build().inject(this);

    Toast.makeText(HttpActivity.this, ""+okHttpClient.hashCode(), Toast.LENGTH_SHORT).show();
  }
}
