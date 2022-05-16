package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CardViewActivity extends AppCompatActivity {


    //criando a varialvel que ira representa o xml no java
    CardView idcardView;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btnreserva1;
    FloatingActionButton idFABCafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view_layout);




        idcardView = findViewById(R.id.idcardView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnreserva1 = findViewById(R.id.btnreserva1);
        idFABCafe = findViewById(R.id.idFABCafe);


        idFABCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ALA FLUTOA",
                        Toast.LENGTH_SHORT).show();
            }
        });

        idcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no cardview!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reservado as 5:30!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reservado as 7:30!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reservado as 8:00!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reservado as 9:00!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnreserva1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Reserva Concluida!!!",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }



}