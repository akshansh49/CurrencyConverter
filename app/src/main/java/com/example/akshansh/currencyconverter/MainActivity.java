package com.example.akshansh.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText dollarAmount=findViewById(R.id.dollarAmount);
        Double amount=Double.parseDouble(dollarAmount.getText().toString());
        Double ruppees=65.0D*amount;
        Toast.makeText(this, ruppees.toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
