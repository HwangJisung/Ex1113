package com.hjs.ex_1113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class LotActivity extends AppCompatActivity {

    TextView txt;
    Button b1, b2, b3, b4, b_re;
    int n = 0; // 난수 발생용 변수
    boolean win = false; // 꽝인지 당첨인지를 판단하기 위한 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lot);

        txt = findViewById(R.id.txt_result);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b_re = findViewById(R.id.btn_re);

        // 1 ~ 4 사이의 난수를 발생
        n = new Random().nextInt(4) + 1;

        // 버튼에 이벤트 감지자 등록
        b1.setOnClickListener(click);
        b2.setOnClickListener(click);
        b3.setOnClickListener(click);
        b4.setOnClickListener(click);

        b_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = new Random().nextInt(4 )+1;
                txt.setText("결과는?");
            }
        });
    }

    // 버튼들이 감지할 이벤트 감지자
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.btn1:
                    if (n == 1) {
                        win = true;
                    } else {
                        win = false;
                    }
                    break;
                case R.id.btn2:
                    if (n == 2) {
                        win = true;
                    } else {
                        win = false;
                    }
                    break;
                case R.id.btn3:
                    if (n == 3) {
                        win = true;
                    } else {
                        win = false;
                    }
                    break;
                case R.id.btn4:
                    if (n == 4) {
                        win = true;
                    } else {
                        win = false;
                    }
                    break;
            }

            if ( win == true ) {
                txt.setText("당첨!");
            } else {
                txt.setText("꽝!");
            }
        }
    };
}
