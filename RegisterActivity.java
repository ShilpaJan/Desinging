package com.example.paresh.garagemanagment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView txtName,txtAddress,txtMobNo,txtEmail,txtPassword,txtVehical,txtVehicalNo;
    EditText edtName,edtAddress,edtMobNo,edtEmail,edtPassword,edtVehical,edtVehicalNo;
    Button btnRsgd;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRsgd=findViewById(R.id.btnRsgd);
        txtName=findViewById(R.id.txtName);
        txtAddress=findViewById(R.id.txtAddress);
        txtMobNo=findViewById(R.id.txtMobno);
        txtEmail=findViewById(R.id.txtEmail);
        txtPassword=findViewById(R.id.txtPassword);
        txtVehical=findViewById(R.id.txtVehical);
        txtVehicalNo=findViewById(R.id.txtVehicalNo);
        edtName=findViewById(R.id.edtName);
        edtAddress=findViewById(R.id.edtName);
        edtMobNo=findViewById(R.id.edtMobNo);
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        edtVehical=findViewById(R.id.edtVehical);
        edtVehicalNo=findViewById(R.id.edtVehical);

        btnRsgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                Toast.makeText(getApplicationContext(),"Register successfuly",Toast.LENGTH_SHORT).show();


            }
        });
    }
}
