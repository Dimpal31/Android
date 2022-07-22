package com.example.cafe_ordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    EditText edt1,edt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String number=edt1.getText().toString();
                String pass=edt2.getText().toString();

                if (number.length()==0 && pass.length()==0)
                {
                    edt1.setError("Please enter mobile Number");
                    edt2.setError("Please enter Password");
                }
                else if (number.length()==0)
                {
                    edt1.setError("Please enter mobile Number");

                }

                else if (pass.length()==0)
                {
                    edt2.setError("Please enter Password");
                }
                else
                {
                    if (number.equals("7226804490") && pass.equals("1234"))
                    {
                        Toast.makeText(LoginActivity.this, "Logged in successfully", Toast.LENGTH_SHORT).show();

                        Intent i=new Intent(LoginActivity.this,DashBoardActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}