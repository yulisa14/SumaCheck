package com.example.fundacioncuervo.sumacheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1;
    EditText varTxtNum2;
    RadioButton varRdSuma;
    RadioButton varRdResta;
    RadioButton varRdMultiplicacion;
    RadioButton varRdDivision;
    Button varButton;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       varTxtNum1= (EditText) findViewById(R.id.txtnum1);
        varTxtNum2=(EditText) findViewById(R.id.txtnum2);

        varRdSuma = (RadioButton) findViewById(R.id.rdsuma);
        varRdResta = (RadioButton) findViewById(R.id.rdresta);
        varRdMultiplicacion = (RadioButton) findViewById(R.id.rdmultiplicacion);
        varRdDivision = (RadioButton) findViewById(R.id.rddivision);

        varButton = (Button) findViewById(R.id.btnoperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

      varButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              int Resultado=0;
              int num1 = Integer.parseInt(varTxtNum1.getText().toString());
              int num2 = Integer.parseInt(varTxtNum2.getText().toString());
              if (varRdSuma.isChecked())
                  Resultado= num1+num2;
              if (varRdResta.isChecked())
                 Resultado= num1-num2;
              if (varRdMultiplicacion.isChecked())
                  Resultado = num1*num2;
              if (varRdDivision.isChecked())
                  Resultado= num1/num2;
              txtResultado.setText("El resultado es "+ Resultado);
          }
      });


        }



    }


