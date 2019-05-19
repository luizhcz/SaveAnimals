package com.example.saveanimals;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.saveanimals.UsuarioActivity.listaAnimal;

public class Lista_Animals_User_Activity extends Activity {

    //Componentes
    private ListView listAnimalsUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista__animals__user_);

        //associacao
        listAnimalsUser = findViewById(R.id.listAnimalsUser);

        ArrayAdapter<Animals> adapter = new ArrayAdapter<Animals>(getApplicationContext(), android.R.layout.simple_list_item_1, listaAnimal);
        listAnimalsUser.setAdapter(adapter);
    }
}
