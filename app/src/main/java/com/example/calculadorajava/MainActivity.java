package com.example.calculadorajava;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar;
    EditText edtn1, edtn2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criaElementos();
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                try {
                    num1 = Double.parseDouble(edtn1.getText().toString());
                    num2 = Double.parseDouble(edtn2.getText().toString());
                    res = num1 + num2;
                    result.setText(String.valueOf(res));
                } catch (Exception e) {
                    String msg = "ERRO!\n\n";
                    msg = msg + "Valores inválidos!\n";
                    msg = msg + "Erro: " + e.getMessage();
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                try {
                    num1 = Double.parseDouble(edtn1.getText().toString());
                    num2 = Double.parseDouble(edtn2.getText().toString());
                    res = num1 - num2;
                    result.setText(String.valueOf(res));
                } catch (Exception e) {
                    String msg = "ERRO!\n\n";
                    msg = msg + "Valores inválidos!\n";
                    msg = msg + "Erro: " + e.getMessage();
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                try {
                    num1 = Double.parseDouble(edtn1.getText().toString());
                    num2 = Double.parseDouble(edtn2.getText().toString());
                    res = num1 * num2;
                    result.setText(String.valueOf(res));
                } catch (Exception e) {
                    String msg = "ERRO!\n\n";
                    msg = msg + "Valores inválidos!\n";
                    msg = msg + "Erro: " + e.getMessage();
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1, num2, res;
                String msgErro = "Operação ínvalida";
                try {
                    num1 = Double.parseDouble(edtn1.getText().toString());
                    num2 = Double.parseDouble(edtn2.getText().toString());
                    res = num1 / num2;
                    if(num2 > 0){
                        result.setText(String.valueOf(res));
                    }else{
                        result.setText(msgErro);
                    }
                } catch (Exception e) {
                    String msg = "ERRO!\n\n";
                    msg = msg + "Valores inválidos!\n";
                    msg = msg + "Erro: " + e.getMessage();
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtn1.setText("");
                edtn2.setText("");
                result.setText("");
            }
        });
    }

    private void criaElementos() {
        btnSomar = findViewById(R.id.btnAdicao);
        btnSubtrair = findViewById(R.id.btnSubtracao);
        btnMultiplicar = findViewById(R.id.btnMultiplicacao);
        btnDividir = findViewById(R.id.btnDivisao);
        btnLimpar = findViewById(R.id.btnLimpar);
        edtn1 = findViewById(R.id.edtNum1);
        edtn2 = findViewById(R.id.edtNum2);
        result = findViewById(R.id.txtResultado);
    }
}