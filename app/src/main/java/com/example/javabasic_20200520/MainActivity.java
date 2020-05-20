package com.example.javabasic_20200520;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.javabasic_20200520.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputmessage = binding.contentEdt.getText().toString();
                Log.d("적은 내용",inputmessage);

                binding.contentTxt.setText(inputmessage);
                Toast.makeText(MainActivity.this, "문구를 반영했습니다.", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
