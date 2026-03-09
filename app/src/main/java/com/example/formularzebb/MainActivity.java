package com.example.formularzebb;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextImie, editTextGatunek, editTextWaga;
    Spinner spinnerGromada;
    CheckBox checkBoxWymarle, checkBoxMiesko, checkBoxRosliny;
    RadioButton radioButtonDzien, radioButtonNoc;
    Switch aSwitch;
    SeekBar seekBar;
    Button buttonDodaj;
    TextView textViewKominukat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextGatunek = findViewById(R.id.gatunek);
        editTextImie = findViewById(R.id.imie);
        editTextWaga = findViewById(R.id.waga);

        spinnerGromada = findViewById(R.id.gromada);

        checkBoxWymarle = findViewById(R.id.wymarle);
        checkBoxMiesko = findViewById(R.id.mieso);
        checkBoxRosliny = findViewById(R.id.rosliny);

        radioButtonDzien = findViewById(R.id.radioButtonDzienny);
        radioButtonNoc = findViewById(R.id.radioButtonNocny);

        aSwitch = findViewById(R.id.switch1);
        seekBar = findViewById(R.id.wiek);
        buttonDodaj = findViewById(R.id.buttonDodaj);
        textViewKominukat = findViewById(R.id.textViewKomunikat);



    }
}