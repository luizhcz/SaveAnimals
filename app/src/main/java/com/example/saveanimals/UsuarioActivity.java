package com.example.saveanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class UsuarioActivity extends AppCompatActivity {

    //lista static temporaria
    public static ArrayList<Animals> listaAnimal = new ArrayList<Animals>();


    private Button btnCreateAnimals;
    private Button btnSeeMyAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        //associando objetos
        btnCreateAnimals = findViewById(R.id.btnCadastroAnimals);
        btnSeeMyAnimals = findViewById(R.id.btnSeeMyAnimals);

        //metodos dos botoes
        btnCreateAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Cadastro_animalActivity.class);
                startActivity(intent);
            }
        });

        btnSeeMyAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lista_Animals_User_Activity.class);
                startActivity(intent);
            }
        });

    }
}
