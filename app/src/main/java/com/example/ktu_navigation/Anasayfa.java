package com.example.ktu_navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Anasayfa
        extends AppCompatActivity { private Button button1,button2,button3,button4,button5,button6,button7;
    private Button button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
        public void init1(){
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
            button5 = findViewById(R.id.button5);
            button6 = findViewById(R.id.button6);
            button7 = findViewById(R.id.button7);
            button8 = findViewById(R.id.button8);
            button9 = findViewById(R.id.button9);
            button10 = findViewById(R.id.button10);
            button11 = findViewById(R.id.button11);
            button12 = findViewById(R.id.button12);
            button13 = findViewById(R.id.button13);
            button14 = findViewById(R.id.button14);
            button15 = findViewById(R.id.button15);
            button16 = findViewById(R.id.button16);
            button17 = findViewById(R.id.button17);
            button18 = findViewById(R.id.button18);
            button19 = findViewById(R.id.button19);
            button20 = findViewById(R.id.button20);




        }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
        init1();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(Anasayfa.this, com.example.ktu_navigation.Rektorluk.class);

                startActivity(a);
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b = new Intent(Anasayfa.this, com.example.ktu_navigation.Bilgisayar.class);

                startActivity(b);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent c = new Intent(Anasayfa.this, com.example.ktu_navigation.Biyoloji.class);

                startActivity(c);
            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent d = new Intent(Anasayfa.this, com.example.ktu_navigation.Elektrik.class);

                startActivity(d);
            }

        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent e = new Intent(Anasayfa.this, com.example.ktu_navigation.Endustri.class);

                startActivity(e);
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent f = new Intent(Anasayfa.this, com.example.ktu_navigation.Fizik.class);

                startActivity(f);
            }

        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent g = new Intent(Anasayfa.this, com.example.ktu_navigation.Harita.class);

                startActivity(g);
            }

        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent h = new Intent(Anasayfa.this, com.example.ktu_navigation.Jeoloji.class);

                startActivity(h);
            }

        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(Anasayfa.this, com.example.ktu_navigation.Insaat.class);

                startActivity(j);
            }

        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Anasayfa.this, com.example.ktu_navigation.Kimya.class);

                startActivity(k);
            }

        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l = new Intent(Anasayfa.this, com.example.ktu_navigation.Maden.class);

                startActivity(l);
            }

        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m = new Intent(Anasayfa.this, com.example.ktu_navigation.Makina.class);

                startActivity(m);
            }

        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Anasayfa.this, com.example.ktu_navigation.Ibbf.class);

                startActivity(n);
            }

        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(Anasayfa.this, com.example.ktu_navigation.Mimarlik.class);

                startActivity(o);
            }

        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent p = new Intent(Anasayfa.this, com.example.ktu_navigation.Orman.class);

                startActivity(p);
            }

        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent r = new Intent(Anasayfa.this, com.example.ktu_navigation.Peyzaj.class);

                startActivity(r);
            }

        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s = new Intent(Anasayfa.this, com.example.ktu_navigation.Tarih.class);

                startActivity(s);
            }

        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t = new Intent(Anasayfa.this, com.example.ktu_navigation.OgrenciIsleri.class);

                startActivity(t);
            }

        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent z = new Intent(Anasayfa.this, com.example.ktu_navigation.Kutuphane.class);

                startActivity(z);
            }

        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent y = new Intent(Anasayfa.this, com.example.ktu_navigation.Edebiyat.class);

                startActivity(y);
            }

        });





    }

}
