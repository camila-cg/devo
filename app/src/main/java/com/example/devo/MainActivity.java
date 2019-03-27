package com.example.devo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.lista_pessoas)
//    public ListView listaPessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listaPessoas = findViewById(R.id.lista_pessoas);
        String[] pessoas = {"Fulano", "Ciclano", "Beltrano"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, pessoas);
        listaPessoas.setAdapter(adapter);
    }
}
