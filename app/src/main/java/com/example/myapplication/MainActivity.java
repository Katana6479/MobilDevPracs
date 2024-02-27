package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private TextView textView;
    public static final String KEY = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("111","Create");
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        textView=findViewById(R.id.textView1);
        textView.setText(String.format(Locale.getDefault(), "Android Version: %s (%d)", Build.VERSION.RELEASE, Build.VERSION.SDK_INT));
    }
    protected void onStart(){
        super.onStart();
        Log.d("111","Start");
    }
    protected void onStop(){
        super.onStop();
        Log.d("111","Stop");
    }
    protected void onPause(){
        super.onPause();
        Log.d("111","Pause");
    }
    protected void onResume(){
        super.onResume();
        Log.d("111","Resume");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("111","Destroy");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("111","Restart");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            //явное намерение
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra( KEY, "Message from mainActivity!");
            startActivity(intent);

           /* Intent intent1 = new Intent(Intent.ACTION_VIEW);
            String str = "https://www.youtube.com/watch?v=mAf6WRor4VY";
            intent1.setData(Uri.parse(str));
            startActivity(intent1);*/
        }
    }
}