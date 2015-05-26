package g1.aplicaciones.com.nutribio.historial;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import g1.aplicaciones.com.nutribio.R;

/**
 * Created by PINEDA on 24/05/2015.
 */
public class Peso extends ActionBarActivity implements View.OnClickListener {


    private EditText peso;
    private EditText altura;
    private TextView punto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        peso= (EditText) findViewById(R.id.ETpeso);
        altura= (EditText) findViewById(R.id.ETaltura);
        punto= (TextView) findViewById(R.id.TVbmi);
        Button indice = (Button) findViewById(R.id.BTindice);
        indice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    if(view.getId()==R.id.BTindice){
    int pes= Integer.parseInt(peso.getText().toString());
    int a= Integer.parseInt(altura.getText().toString());
    double alt=a*0.01;
    double bmi=pes/(alt*alt);
    if(bmi<16){
    punto.setText(Math.round(bmi)+": Deficiencia nutricional en 3er grado");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<17){
    punto.setText(Math.round(bmi)+": Deficiencia nutricional en 2do grado");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<18.5){
    punto.setText(Math.round(bmi)+": Deficiencia nutricional en 1er grado");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<20){
    punto.setText(Math.round(bmi)+": Bajo peso");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<25){
    punto.setText(Math.round(bmi)+": Normal");
    punto.setTextColor(Color.GREEN);
    }
    else if(bmi<30){
    punto.setText(Math.round(bmi)+": Sobrepeso");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<35){
    punto.setText(Math.round(bmi)+": Obesidad en 1er grado");
    punto.setTextColor(Color.RED);
    }
    else if(bmi<40){
    punto.setText(Math.round(bmi)+": Obesidad en 2do grado");
    punto.setTextColor(Color.RED);
    }
    else{
    punto.setText(Math.round(bmi)+": Obesidad en 3er grado");
    punto.setTextColor(Color.RED);
    }
    }
    }

}
