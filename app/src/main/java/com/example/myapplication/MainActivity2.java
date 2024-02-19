package com.example.myapplication;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;

import static com.example.myapplication.MainActivity.KEY;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String str = bundle.getString(KEY);
            textView = findViewById(R.id.textView2);
            textView.setText(str);
        }
    }
}