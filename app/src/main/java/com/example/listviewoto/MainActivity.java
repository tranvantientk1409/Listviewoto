package com.example.listviewoto;

import static com.example.listviewoto.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView lvOto;
    ArrayList<Oto> arrayoto;
    OtoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        lvOto = (ListView) findViewById(id.lvoto);
        arrayoto = new ArrayList<>();
        arrayoto.add(new Oto ("Xe Huyndai", "Xe tốc độ cao từ nhật", drawable.car));

        adapter = new OtoAdapter(this, layout.dong_oto, Collections.unmodifiableList(arrayoto));
        lvOto.setAdapter(adapter);
    }
}