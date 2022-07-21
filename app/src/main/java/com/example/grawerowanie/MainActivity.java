package com.example.grawerowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText IP;
    Button playButton;
    Button backButton;
    TextView wyslane;
    TextView tekst;
    TextView ponizej;
    TextView zawartosc;
    TextView wiel_wys;
    RadioButton mala;
    RadioButton duza;
    TextView wybierz;
    String e2 = "M";
    String wielkosc = "Wybrałeś mniejszą czcionkę";
    TextView opis;
    TextView host;
    TextView ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById((R.id.editTextTextPersonName2));
        IP = (EditText)findViewById(R.id.editTextNumber2);

    }

    public void send(View v)
    {
        WysylanieWiadomosci wysylanieWiadomosci = new WysylanieWiadomosci();
        wysylanieWiadomosci.execute(e1.getText().toString(),e2,IP.getText().toString());
        playButton = (Button) findViewById(R.id.button);
        playButton.setVisibility(View.INVISIBLE);
        wyslane = (TextView) findViewById(R.id.textView);
        wyslane.setVisibility(View.VISIBLE);
        zawartosc = (TextView) findViewById(R.id.textView5);
        zawartosc.setText(e1.getText().toString());
        zawartosc.setVisibility(View.VISIBLE);
        wiel_wys = (TextView) findViewById(R.id.textView6);
        wiel_wys.setText(wielkosc);
        wiel_wys.setVisibility(View.VISIBLE);
        tekst = (TextView) findViewById(R.id.editTextTextPersonName2);
        tekst.setVisibility(View.INVISIBLE);
        ponizej = (TextView) findViewById(R.id.textView2);
        ponizej.setVisibility(View.INVISIBLE);
        backButton = (Button) findViewById(R.id.button3);
        backButton.setVisibility(View.INVISIBLE);
        mala = (RadioButton) findViewById(R.id.mala);
        mala.setVisibility(View.INVISIBLE);
        duza = (RadioButton) findViewById(R.id.duza);
        duza.setVisibility(View.INVISIBLE);
        wybierz = (TextView) findViewById(R.id.textView4);
        wybierz.setVisibility(View.INVISIBLE);
        opis = (TextView) findViewById(R.id.textView8);
        opis.setVisibility(View.INVISIBLE);
        host = (TextView) findViewById(R.id.textView7);
        host.setVisibility(View.INVISIBLE);
        ip = (TextView) findViewById(R.id.editTextNumber2);
        ip.setVisibility(View.INVISIBLE);
    }


    public void back(View v)
    {
        playButton = (Button) findViewById(R.id.button);
        playButton.setVisibility(View.VISIBLE);
        wyslane = (TextView) findViewById(R.id.textView);
        wyslane.setVisibility(View.INVISIBLE);
        tekst = (TextView) findViewById(R.id.editTextTextPersonName2);
        tekst.setVisibility(View.VISIBLE);
        ponizej = (TextView) findViewById(R.id.textView2);
        ponizej.setVisibility(View.VISIBLE);
        backButton = (Button) findViewById(R.id.button3);
        backButton.setVisibility(View.INVISIBLE);
        tekst = (TextView) findViewById(R.id.editTextTextPersonName2);
        tekst.setText("");
        mala =(RadioButton) findViewById(R.id.mala);
        mala.setVisibility(View.VISIBLE);
        duza = (RadioButton) findViewById(R.id.duza);
        duza.setVisibility(View.VISIBLE);
        wybierz = (TextView) findViewById(R.id.textView4);
        wybierz.setVisibility(View.VISIBLE);

    }
    public void RadioZazn(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()) {
            case R.id.mala:
                if (checked)
                    e2  = "M";
                    wielkosc = "Wybrałeś mniejszą czcionkę";
                    break;
            case R.id.duza:
                if (checked)
                    e2 = "D";
                    wielkosc = "Wybrałeś większą czcionkę";
                    break;
    }
    }}