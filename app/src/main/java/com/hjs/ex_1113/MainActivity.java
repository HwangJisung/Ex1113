package com.hjs.ex_1113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1 , b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);

        b1.setOnClickListener( click );
        b2.setOnClickListener( click );
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "버튼1 클릭함",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "버튼2 클릭함",Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){ // 내가 클릭한 버튼의 아이디를 구별
                case R.id.btn1 :
                    Toast.makeText(MainActivity.this, "버튼1 클릭함",Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btn2 :
                    Toast.makeText(MainActivity.this, "버튼2 클릭함",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
