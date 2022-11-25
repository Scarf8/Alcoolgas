package com.example.alcoolgas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RendActivity extends AppCompatActivity {

    private EditText editlitroAb;
    private EditText editquiPe;
    private TextView textRend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rend);

        editlitroAb = findViewById(R.id.litroAb);
        editquiPe = findViewById(R.id.quiloPe);
        textRend = findViewById(R.id.textRend);
    }

    public void calcularPreco(View view){

        Double litroAb = Double.parseDouble(editlitroAb.getText().toString());
        Double quiloPe = Double.parseDouble(editquiPe.getText().toString());

        Double resultado = litroAb/quiloPe;

        textRend.setText("O rendimento do seu carro é de");

    }
}
