package com.example.korversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText input_uang;
    Button rp_usd, rp_euro,rp_yen;
    TextView hasil_konversi;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_uang = (EditText) findViewById(R.id.uang_input);
//        rp_euro = (Button) findViewById(R.id.rpeuro);
//        rp_usd = (Button) findViewById(R.id.rpusd);
//        rp_yen = (Button) findViewById(R.id.rpyen);
        hasil_konversi = (TextView) findViewById(R.id.hasil_Korvensi);
    }

    public boolean cek(){
        if (input_uang.getText().toString().isEmpty()){
            Toast.makeText(this, "Silahkan masukan jumlah uang", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void toReamur(View v){
        if (!cek()) {
            return;
        }

        try {
            angka = Double.parseDouble(input_uang.getText().toString() );

        }catch(Exception ex){
            Toast.makeText(this, "Masukan angka", Toast.LENGTH_SHORT).show();
        }
        double hasil = 5*angka/4;
        hasil_konversi.setText("Reamurt = "+hasil+"R");
        Toast.makeText(this, "Rumus ( 4/5X"+angka+")", Toast.LENGTH_SHORT).show();
    }

    public void toFarenheit(View v){
        if (!cek()) {
            return;
        }

        try {
            angka = Double.parseDouble(input_uang.getText().toString() );

        }catch(Exception ex){
            Toast.makeText(this, "Masukan angka", Toast.LENGTH_SHORT).show();
        }
        double hasil = 9*angka/5+32;
        hasil_konversi.setText("Farenheit = "+hasil+"F");
        Toast.makeText(this, "Rumus ((4/5X"+angka+")+32)", Toast.LENGTH_SHORT).show();
    }

    public void toKelvin(View v){
        if (!cek()) {
            return;
        }

        try {
            angka = Double.parseDouble(input_uang.getText().toString() );

        }catch(Exception ex){
            Toast.makeText(this, "Masukan angka", Toast.LENGTH_SHORT).show();
        }
        double hasil = angka+273;
        hasil_konversi.setText("Kelvin = "+hasil+"K");
        Toast.makeText(this, "Rumus ("+angka+"+273)", Toast.LENGTH_SHORT).show();
    }
}
