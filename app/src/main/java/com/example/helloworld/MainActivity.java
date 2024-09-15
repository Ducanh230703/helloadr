package com.example.helloworld;

import static com.example.helloworld.R.id.txt_TextView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtOverview;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        txtOverview = findViewById(R.id.txt_TextView);

        Button btn = findViewById(R.id.btn_click);

        btn.setOnClickListener(this);

        };

    @Override
    public void onClick(View view){
//        System.out.println("Clicked");
//        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
        //truyen  cai gi bang Bundle
        String message = "Hello from Activity A!";
        Bundle bundle = new Bundle();
        bundle.putString("message_key", message);
        intent1.putExtras(bundle);
        startActivity(intent1);
    }
}