package com.example.aceracer.givemylove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        button_1 = (Button) findViewById(R.id.button_1);
        editText1 = (EditText) findViewById(R.id.edit_text1);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText1 = editText1.getText().toString();
                String inputText2 = editText2.getText().toString();
                if ("".equals(inputText1)&&"2016/11/04".equals(inputText2)){
                    Toast.makeText(FirstActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(FirstActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
