package com.example.owner.spidertask0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button B1;
    TextView T1;
    private int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button B1= (Button)findViewById(R.id.button);
        final TextView T1 = (TextView)findViewById(R.id.textView);



        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a++;
                T1.setText(Integer.toString(a));

            }
        });



    }
}

