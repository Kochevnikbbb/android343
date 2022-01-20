package com.nomad.android343;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<LanguageProgramm> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        recyclerView = findViewById(R.id.recicle_view);
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new LanguageProgramm("C","https://img2.freepng.ru/20180405/doe/kisspng-the-c-programming-language-computer-programming-co-programmer-5ac6bd83099b97.1672069615229740830394.jpg"));
        list.add(new LanguageProgramm("C++","https://upload.wikimedia.org/wikipedia/commons/1/18/ISO_C%2B%2B_Logo.svg"));
        list.add(new LanguageProgramm("Java","https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Java_logo.svg/1200px-Java_logo.svg.png"));
        list.add(new LanguageProgramm("Android","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/512px-Android_robot.svg.png"));
        list.add(new LanguageProgramm("Kotlin","https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin_Icon.png/640px-Kotlin_Icon.png"));
        list.add(new LanguageProgramm("Html","https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/640px-HTML5_logo_and_wordmark.svg.png"));

    }
}