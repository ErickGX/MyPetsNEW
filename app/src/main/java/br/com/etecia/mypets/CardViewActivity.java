package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;


public class CardViewActivity extends AppCompatActivity {


    //criando a varialvel que ira represneta o xml NO java
    CardView idcardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view_layout);


        idcardView = findViewById(R.id.idcardView);


        idcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}