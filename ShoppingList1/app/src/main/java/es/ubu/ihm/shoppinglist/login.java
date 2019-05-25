package es.ubu.ihm.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void pasoCarga(View v){
        Intent intent = new Intent (v.getContext(), Carga.class);
        startActivityForResult(intent, 0);
    }

    public void pasoRegistro(View v){
        Intent intent = new Intent (v.getContext(), Registro.class);
        startActivityForResult(intent, 0);
    }

}
