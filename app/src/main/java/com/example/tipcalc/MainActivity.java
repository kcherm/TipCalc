package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public Button button2;
    public TextView textView;
    public EditText editNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        editNum=findViewById(R.id.editNum);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Integer.parseInt(editNum.getText().toString());
                num = (num * .15) + num;
                textView.setText("The total is "+num);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Integer.parseInt(editNum.getText().toString());
                num = (num * .20) + num;
                textView.setText("The total is "+num);
            }
        });
    }
}