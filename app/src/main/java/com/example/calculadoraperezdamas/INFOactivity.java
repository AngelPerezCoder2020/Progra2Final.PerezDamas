package com.example.calculadoraperezdamas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class INFOactivity extends AppCompatActivity {
    private Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoactivity);
        setTitle("ANGEL DARIO PEREZ DAMAS");
        regresar = findViewById(R.id.regresarButton);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}