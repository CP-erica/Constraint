package com.example.constraint;



import androidx.appcompat.app.AppCompatActivity;
//
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.ImageView;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      ImageView Imageview1, Imageview2;
TextView Txtview1, Txtview2, Txtview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Imageview1 = findViewById(R.id.imageView);
      Imageview2 = findViewById(R.id.imageView2);
     Txtview1 = findViewById(R.id.textView2);
     Txtview2 = findViewById(R.id.textView3);
       Txtview3 = findViewById(R.id.textView4);


    }
}
