package com.example.aceracer.givemylove;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SecondActivity extends AppCompatActivity {
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout2);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:636214"));
                startActivity(intent);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this,"2016/11/04",Toast.LENGTH_SHORT).show();
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                long nd = 1000*24*60*60;//一天的毫秒数
                long nh = 1000*60*60;//一小时的毫秒数
                long nm = 1000*60;//一分钟的毫秒数
                long ns = 1000;//一秒钟的毫秒数
                long diff;
                try {
                    diff = sd.parse(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date())).getTime() - sd.parse("2016-11-04T23:00:00").getTime();
                    long day = diff/nd;//计算差多少天
                    long hour = diff%nd/nh;//计算差多少小时
                    long min = diff%nd%nh/nm;//计算差多少分钟
                    long sec = diff%nd%nh%nm/ns;//计算差多少秒
                    String str = "今天是我们在一起的"+day+"天"+hour+"小时"+"小时"+min+"分钟"+sec+"秒。";
                    Toast.makeText(SecondActivity.this,str,Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(SecondActivity.this,"我想每天都有你的晚安入眠",Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
