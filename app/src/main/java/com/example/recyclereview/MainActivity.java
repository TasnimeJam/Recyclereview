package com.example.recyclereview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv ;
    String [] titre ;
    String [] sousTitre ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recylcereviw) ;
        titre=getResources().getStringArray(R.array.titre);
        sousTitre=getResources().getStringArray(R.array.Stitre);
        ListAdapter ad ;
        Integer[] img ={R.drawable.téléchargement,R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,R.drawable.photo5 };
        ad =new ListAdapter(titre, sousTitre, img, MainActivity.this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ad);

    }
}