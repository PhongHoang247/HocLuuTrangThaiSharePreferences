package com.phong.hocluutrangthaisharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    String tenSharePreferences = "trangthai";//tự nó lấy tên này .xml để lưu thông tin

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyLuuTrangThai(View view) {
        //Đối tượng SharePreferences không bao giờ bị null
        SharedPreferences sharedPreferences = getSharedPreferences(tenSharePreferences,MODE_PRIVATE);
        //Lưu thì lấy Editor ra:
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //Muốn lưu các thông tin thì gọi lệnh put:
        editor.putBoolean("b", true);
        editor.putFloat("f", 18.8f);
        editor.putInt("i", 100);
        editor.putLong("l", 200l);
        editor.putString("s", "Phong");
        Set<String> dsChuoi = new HashSet<>();
        dsChuoi.add("Phan Anh");
        dsChuoi.add("Thế Mạnh");
        dsChuoi.add("Bình Nguyên Royal");
        editor.putStringSet("dsChuoi", dsChuoi);
        editor.commit();//Xác nhận lưu
    }
}
