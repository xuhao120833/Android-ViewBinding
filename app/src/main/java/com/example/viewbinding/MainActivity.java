package com.example.viewbinding;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.viewbinding.databinding.ActivityMainBinding;

/**
 * ViewBinding作用：舍弃findViewbyId这种获取View的繁琐方式
 * 使用方法：build.gradle.kts中打开配置即可使用，使用方法简单。
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn.setOnClickListener(v ->{
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        });
        binding.tv.setText("Viewbinding");
    }
}