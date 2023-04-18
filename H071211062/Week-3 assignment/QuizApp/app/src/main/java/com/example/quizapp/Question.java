package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Question extends AppCompatActivity {

    public static String question[] ={
            "1. Siapa Pembuat Game Mobile Legends?",
            "2. Game apa yang buriq?",
            "3. Manakah Hero Marksman dibawah ini?",
            "4. Tim esport mana yang terbaik?",
            "5. Siapa Nama saya?"
    };

    public static String choices[][] = {
            {"Moonton","Garena","Tencent","Saya"},
            {"Mobile Legend","EPEP","PUBG Mobile","Clash Of CLans"},
            {"Argus","Franco","Layla","Alucard"},
            {"RRQ","AURA","BTR","EVOS"},
            {"Tidak Tau","Ronaldo","Taufiq","Messi"}
    };

    public static String correctAnswers[] = {
            "Moonton",
            "EPEP",
            "Layla",
            "EVOS",
            "Taufiq"
    };
}