package com.example.usuario.funcionalidad_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private TextView cero;
        private  TextView uno;
        private  TextView dos;
        private  TextView tres;
        private  TextView cuatro;
        private  TextView cinco;
        private  TextView seis;
        private  TextView siete;
        private  TextView ocho;
        private  TextView nueve;
        private  TextView igual;
        private  TextView sumar;
        private  TextView restar;
        private  TextView multi;
        private  TextView dividir;
        private  TextView limpiar;
        private  TextView resultado;
        private String cadena="";
        private String cadena1="";
        private String cadena2="";
        private double res = 0;
        private int swcoma = 0;
        String Error = "Formato Erroneo";
        int sw=0;
        int c=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            //requestWindowFeature(Window.FEATURE_NO_TITLE);
            //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_main);
            cero = (TextView)findViewById(R.id.tvCero);
            uno =(TextView)findViewById(R.id.tvUno);
            dos =(TextView)findViewById(R.id.tvDos);
            tres =(TextView)findViewById(R.id.tvTres);
            cuatro =(TextView)findViewById(R.id.tvCuatro);
            cinco =(TextView)findViewById(R.id.tvCinco);
            seis=(TextView)findViewById(R.id.tvSeis);
            siete =(TextView)findViewById(R.id.tvSiete);
            ocho =(TextView)findViewById(R.id.tvOcho);
            nueve =(TextView)findViewById(R.id.tvNueve);
            igual =(TextView)findViewById(R.id.tvIgual);
            sumar =(TextView)findViewById(R.id.tvSuma);
            restar= (TextView)findViewById(R.id.tvResta);
            multi =(TextView)findViewById(R.id.tvMultiplicacion);
            dividir =(TextView)findViewById(R.id.tvDivision);
            limpiar =(TextView)findViewById(R.id.tvCE);
            resultado =(TextView)findViewById(R.id.tvResultado);
        }
        public void sumar(View v)
        {
            if(!cadena.equals("")) {
                swcoma = 0;
                c = 0;
                cadena1 = cadena;
                sw = 1;
                resultado.setText(sumar.getText().toString());
                cadena = "";
            }
            else{

                Toast.makeText(getBaseContext(),"fORMATO ERRONEO",Toast.LENGTH_SHORT).show();
            }
        }
        public void multiplicar(View v) {
            if (!cadena.equals("")) {
                swcoma = 0;
                c = 0;
                cadena1 = cadena;
                sw = 2;
                resultado.setText(multi.getText().toString());
                cadena = "";
            }
            else{

                Toast.makeText(getBaseContext(),"fORMATO ERRONEO",Toast.LENGTH_SHORT).show();
            }
        }

        public void dividir(View v)
        {
            if(!cadena.equals("")) {
                swcoma = 0;
                c = 0;
                cadena1 = cadena;
                sw = 3;
                resultado.setText(dividir.getText().toString());
                cadena = "";
            }
            else{

                Toast.makeText(getBaseContext(),"fORMATO ERRONEO",Toast.LENGTH_SHORT).show();
            }
        }
        public void restar(View v)
        {
            if(!cadena.equals("")) {
                swcoma = 0;
                c = 0;
                cadena1 = cadena;
                sw = 4;
                resultado.setText(restar.getText().toString());
                cadena = "";
            }else {

                Toast.makeText(getBaseContext(),"fORMATO ERRONEO",Toast.LENGTH_SHORT).show();
            }
        }
        public void igual(View v)
        {
            if(sw!=0) {
                cadena2 = cadena;
                double vall= Double.parseDouble(cadena1);
                double val2= Double.parseDouble(cadena2);

                if (sw == 1) {
                    res = vall + val2;
                    resultado.setText(res + "");
                    cadena2 = "";
                    sw=0;
                    cadena1="";
                    cadena="";
                    res=0;
                }
                if (sw == 2) {
                    res = vall * val2;
                    resultado.setText(res + "");
                    cadena2 = "";
                    sw=0;
                    cadena1="";
                    cadena="";
                    res=0;
                }
                if (sw == 3) {
                    res = vall / val2;
                    resultado.setText(res + "");
                    cadena2 = "";
                    sw=0;
                    cadena1="";
                    cadena="";
                    res=0;
                }
                if (sw == 4) {
                    res = vall - val2;
                    resultado.setText(res + "");
                    cadena2 = "";
                    sw=0;
                    cadena1="";
                    cadena="";
                    res=0;
                }
            }
            else{
                Toast.makeText(getBaseContext(),"fORMATO ERRONEO",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarcero(View v)
        {
            c++;
            if(c<9) {
                String ceroC = cero.getText().toString();
                cadena = cadena + ceroC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertaruno(View v)
        {
            c++;
            if (c<9) {
                String unoC = uno.getText().toString();
                cadena = cadena + unoC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertardos(View v)
        {
            c++;
            if (c<9) {
                String dosC = dos.getText().toString();
                cadena = cadena + dosC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertartres(View v)
        {
            c++;
            if (c<9) {
                String tresC = tres.getText().toString();
                cadena = cadena + tresC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarcuatro(View v)
        {
            c++;
            if (c<9) {
                String cuatroC = cuatro.getText().toString();
                cadena = cadena + cuatroC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarcinco(View v)
        {
            c++;
            if (c<9) {
                String cincoC = cinco.getText().toString();
                cadena = cadena + cincoC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarseis(View v)
        {
            c++;
            if (c<9) {
                String seisC = seis.getText().toString();
                cadena = cadena + seisC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarsiete(View v)
        {
            c++;
            if (c<9) {
                String sieteC = siete.getText().toString();
                cadena = cadena + sieteC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarocho(View v)
        {
            c++;
            if (c<9) {
                String ochoC = ocho.getText().toString();
                cadena = cadena + ochoC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insetarnueve(View v)
        {
            c++;
            if (c<9) {
                String nueveC = nueve.getText().toString();
                cadena = cadena + nueveC;
                resultado.setText(cadena);
            }
            else{
                Toast.makeText(getBaseContext(),"maximo de numeros",Toast.LENGTH_SHORT).show();
            }
        }
        public void insertarcoma(View v)
        {
            if (swcoma==0)
            {
                if (cadena.equals(""))
                {
                    cadena = "0.";
                    resultado.setText(cadena);
                }else {
                    cadena =cadena +".";
                    resultado.setText(cadena);
                }
                swcoma = 1;
            }
        }
        public void ce(View v)
        {
            c=0;
            swcoma =0;
            cadena ="";
            resultado.setText("0");
        }
    }