package com.example.manelmm3.kmamillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editKm = findViewById(R.id.editKm);
        editKm.setText("1.0");
        EditText editMillas = findViewById(R.id.editMillas);
        editMillas.setText("0.621371");
    }

    public void OnClickMillas(View view) {
        EditText editKm = findViewById(R.id.editKm);
        EditText editMillas = findViewById(R.id.editMillas);
        String skm = editKm.getText().toString();
        if(!skm.equals("")){
            float km = Float.valueOf(skm);
            float millas = km * 0.621371f;
            String smillas = Float.toString(millas);
            editMillas.setText(smillas);
        }
    }

    public void OnClickKm(View view) {
        EditText editKm = findViewById(R.id.editKm);
        EditText editMillas = findViewById(R.id.editMillas);
        String smillas = editMillas.getText().toString();
        if(!smillas.isEmpty()) {
            float millas = Float.valueOf(smillas);
            float km = millas / 0.621371f;
            String skm = Float.toString(km);
            editKm.setText(skm);
        }
    }
}
