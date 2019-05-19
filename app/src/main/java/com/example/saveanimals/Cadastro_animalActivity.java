package com.example.saveanimals;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.saveanimals.UsuarioActivity.listaAnimal;

public class Cadastro_animalActivity extends Activity {

    private TextView typeAnimal;
    private TextView nameAnimal;
    private TextView breedAnimal;
    private TextView colorAnimal;
    private ImageView imagemAnimal;
    private Button CreateAnimal;
    private Button PrevAnimal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_animal);


        //associacao
        typeAnimal = findViewById(R.id.typeAnimals);
        nameAnimal = findViewById(R.id.nomeAnimals);
        breedAnimal = findViewById(R.id.racaAnimal);
        colorAnimal = findViewById(R.id.corAnimal);
        imagemAnimal = findViewById(R.id.ImageAnimal);
        CreateAnimal = findViewById(R.id.btnCriarAnimals);
        PrevAnimal = findViewById(R.id.btnVoltarCreateAnimals);


        //methods buttons
        PrevAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        CreateAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipo,nome,raca,cor,image;

                tipo = typeAnimal.getText().toString();
                nome = nameAnimal.getText().toString();
                raca = breedAnimal.getText().toString();
                cor = colorAnimal.getText().toString();
                image = "image" + (listaAnimal.size() + 1);

                listaAnimal.add(new Animals(tipo,nome,raca,cor,image));
                finish();
            }
        });

    }
}
