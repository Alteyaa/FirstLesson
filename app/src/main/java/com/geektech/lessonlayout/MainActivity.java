package com.geektech.lessonlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnChange;
    private TextView textView;
    private EditText etText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUi();
    }

    private void setupUi() {
        btnChange = findViewById(R.id.btnChange);
        textView = findViewById(R.id.txtView);
        etText = findViewById(R.id.etText);
        imageView = findViewById(R.id.icon);
        btnChange.setText(R.string.txt_btn);
        imageView.setImageResource(R.drawable.ic_launcher_background);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String message = etText.getText().toString();
                 textView.setText(message);
            }
        });
    }
}