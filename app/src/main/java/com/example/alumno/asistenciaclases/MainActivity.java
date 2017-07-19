package com.example.alumno.asistenciaclases;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2, et3;
    private Button bt1;
    private TextView tv1;
    private CheckBox chk1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.asignatura1 );
        et2 = (EditText) findViewById(R.id.asignatura2 );
        et3 = (EditText) findViewById(R.id.asignatura3 );
        chk1 = (CheckBox) findViewById(R.id.chk1);
        tv1 = (TextView) findViewById(R.id.tv1);
    }

    public void calcular2(View view)
    {
        int numero1 = Integer.parseInt(et1.getText().toString());
        int numero2 = Integer.parseInt(et2.getText().toString());
        int numero3 = Integer.parseInt(et3.getText().toString());
        float promedio;
        float descuento= 10/100;
        float total;

        if( chk1.isChecked() )
        {
            promedio = ((numero1 + numero2 +numero3)/3);
            total=promedio*descuento;

            tv1.setText(String.valueOf( total ) );
        }
        else
        {
            promedio = (numero1 + numero2 +numero3)/3;
            tv1.setText(String.valueOf(promedio));

        }
    }
}
