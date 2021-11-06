package com.example.listsaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.lista);
        List<Saga> sagas = Saga.getSaga();
        listview.setAdapter(new SagaAdapter(this,sagas));
        listview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Saga s = (Saga)parent.getAdapter().getItem(position);
        Toast.makeText(this,"Saga: " + s.nome, Toast.LENGTH_SHORT).show();
    }
}