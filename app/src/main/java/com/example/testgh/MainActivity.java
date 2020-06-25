package com.example.testgh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button przycisk;
    Button przycisk2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        System.out.println("a kto to przyszedł? pan maruda, niszczyciel dobrej zabawy i pogromca uśmiechów dzieci ");
        System.out.println("no ja tu widzę mocne zmiany zostały wprowadzone, nieładnie tak");
        setContentView(R.layout.activity_main);

        przycisk = findViewById(R.id.button2);//

        System.out.println("gałąź");
        System.out.println("ale");
        System.out.println("rent");
        System.out.println("rensat");

        System.out.println("2");
        System.out.println("gałąź czadowych chłopaków");
        System.out.println("gałąź czadowszych chłopaków");
    }

}