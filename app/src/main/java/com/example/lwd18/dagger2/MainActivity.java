package com.example.lwd18.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.lwd18.dagger2.modulhaveparame.HaveModuleActivity;

public class MainActivity extends AppCompatActivity {

  private Button btn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    btn = findViewById(R.id.btn);
    btn.setText("无参");
    btn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, HaveModuleActivity.class));
      }
    });
  }
}
