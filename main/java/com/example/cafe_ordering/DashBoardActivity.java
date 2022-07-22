package com.example.cafe_ordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DashBoardActivity extends AppCompatActivity
{
    CheckBox chk1,chk2,chk3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                StringBuffer buffer=new StringBuffer();
                buffer.append("\n Selected Items \n");
                int amount=0;

                if (chk1.isChecked())
                {
                    amount+=100;
                    buffer.append("\n Pizza @rs.100 \n");
                }
                if (chk2.isChecked())
                {
                    amount+=50;
                    buffer.append("\n  Burger @rs.50 \n");
                }

                if (chk3.isChecked())
                {
                    amount+=120;
                    buffer.append("\n Coffee @rs.120 \n");
                }
                buffer.append("\n Total:"+amount);

                Intent i=new Intent(DashBoardActivity.this,BillActivity.class);
                i.putExtra("Bill",buffer.toString());
                startActivity(i);


            }
        });

    }
}