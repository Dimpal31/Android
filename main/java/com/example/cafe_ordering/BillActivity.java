package com.example.cafe_ordering;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BillActivity extends AppCompatActivity
{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        textView=findViewById(R.id.txt1);

        Intent i=getIntent();
        String data=i.getStringExtra("Bill");
        textView.setText(data);
    }

    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(BillActivity.this);
        alert.setTitle("Are you sure you want to exit?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alert.show();

    }
}