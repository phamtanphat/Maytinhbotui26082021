package com.example.maytinhbotui26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai báo
    EditText mEdtSoThu1, mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong, mBtnTru, mBtnNhan, mBtnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Ánh xạ
        mEdtSoThu1 = findViewById(R.id.edittextSoThu1);
        mEdtSoThu2 = findViewById(R.id.edittextSoThu2);
        mTvKetQua = findViewById(R.id.textViewKetQua);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);

        // ctrl + p : xem tham so truyen vao

        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ 2 edittext
                String textEdittext1 = mEdtSoThu1.getText().toString();
                String textEdittext2 = mEdtSoThu2.getText().toString();

                // Xem dữ liệu trong hệ thống
//                Log.d("BBB","Số thứ 1 " + textEdittext1);
//                Log.d("BBB","Số thứ 2 " + textEdittext2);

                // kiểm tra nếu có giá trị rỗng
                if (textEdittext1.isEmpty() || textEdittext2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn nhập chưa đầy đủ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển đổi kiểu dữ liệu từ string sang integer
                Integer intSt1 = Integer.parseInt(textEdittext1);
                Integer intSt2 = Integer.parseInt(textEdittext2);

                int ketQua = intSt1 + intSt2;

                mTvKetQua.setText("Kết quả : " + ketQua);
            }
        });

        mBtnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ 2 edittext
                String textEdittext1 = mEdtSoThu1.getText().toString();
                String textEdittext2 = mEdtSoThu2.getText().toString();

                // Xem dữ liệu trong hệ thống
//                Log.d("BBB","Số thứ 1 " + textEdittext1);
//                Log.d("BBB","Số thứ 2 " + textEdittext2);

                // kiểm tra nếu có giá trị rỗng
                if (textEdittext1.isEmpty() || textEdittext2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn nhập chưa đầy đủ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển đổi kiểu dữ liệu từ string sang integer
                Integer intSt1 = Integer.parseInt(textEdittext1);
                Integer intSt2 = Integer.parseInt(textEdittext2);

                int ketQua = intSt1 * intSt2;

                mTvKetQua.setText("Kết quả : " + ketQua);
            }
        });

        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ 2 edittext
                String textEdittext1 = mEdtSoThu1.getText().toString();
                String textEdittext2 = mEdtSoThu2.getText().toString();

                // Xem dữ liệu trong hệ thống
//                Log.d("BBB","Số thứ 1 " + textEdittext1);
//                Log.d("BBB","Số thứ 2 " + textEdittext2);

                // kiểm tra nếu có giá trị rỗng
                if (textEdittext1.isEmpty() || textEdittext2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn nhập chưa đầy đủ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Chuyển đổi kiểu dữ liệu từ string sang integer
                Integer intSt1 = Integer.parseInt(textEdittext1);
                Integer intSt2 = Integer.parseInt(textEdittext2);

                int ketQua = intSt1 - intSt2;

                mTvKetQua.setText("Kết quả : " + ketQua);
            }
        });
        mBtnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy dữ liệu từ 2 edittext
                String textEdittext1 = mEdtSoThu1.getText().toString();
                String textEdittext2 = mEdtSoThu2.getText().toString();

                // Xem dữ liệu trong hệ thống
//                Log.d("BBB","Số thứ 1 " + textEdittext1);
//                Log.d("BBB","Số thứ 2 " + textEdittext2);

                // kiểm tra nếu có giá trị rỗng
                if (textEdittext1.isEmpty() || textEdittext2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn nhập chưa đầy đủ", Toast.LENGTH_SHORT).show();
                    return;
                }


                // Chuyển đổi kiểu dữ liệu từ string sang integer
                float floatSt1 = Float.parseFloat(textEdittext1);
                float floatSt2 = Float.parseFloat(textEdittext2);

                if (floatSt2 == 0){
                    Toast.makeText(MainActivity.this, "Không chia với giá trị 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                float ketQua = floatSt1 / floatSt2;

                mTvKetQua.setText("Kết quả : " + ketQua);
            }
        });

    }
}