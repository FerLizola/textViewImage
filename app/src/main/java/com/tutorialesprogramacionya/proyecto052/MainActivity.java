package com.tutorialesprogramacionya.proyecto052;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Persona> listapersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listapersonas=new ArrayList<Persona>();
        listapersonas.add(new Persona("ABREGO DELGADO ALEXIA ARIANA","ISC","13400378"));
        listapersonas.add(new Persona("CARO LOPEZ LUIS RICARDO","ISC","13400395" ));
        listapersonas.add(new Persona("CARVAJAL GUTIERREZ RAUL RAFAEL","ISC","13400396" ));
        listapersonas.add(new Persona("CASILLAS UREÑA FERMIN MICHET","ISC","13400256" ));
        listapersonas.add(new Persona("CRESPO DURAN PABLO ARTURO","ISC","13400397" ));
        listapersonas.add(new Persona("ESPINO SERRANO CESAR RAMSES","ISC","13400402" ));
        listapersonas.add(new Persona("ESPINOZA ORONIA CARLOS EDUARDO","ISC","12401119" ));
        listapersonas.add(new Persona("FREGOSO CORONA JESÚS EDUARDO","ISC","13400405" ));
        listapersonas.add(new Persona("GALAVIZ ARROYO OLIVER JASIEL","ISC","13400406" ));
        listapersonas.add(new Persona("GALINDO DELGADO DONADONY DONAJI","ISC","13400408" ));
        listapersonas.add(new Persona("GONZALEZ CASTELLANOS EDGAR FABRIZIO","ISC","13400419" ));
        listapersonas.add(new Persona("HERNANDEZ SANDOVAL ABRIL YARELI","ISC","13400430" ));
        listapersonas.add(new Persona("JIMENEZ ORTIZ JUAN DANIEL","ISC","13400436" ));
        listapersonas.add(new Persona("LIZOLA CHAVARÍN LUIS FERNANDO","ISC","13400441" ));
        listapersonas.add(new Persona("MEDRANO BARAJAS JUAN DANIEL","ISC","13400457" ));
        listapersonas.add(new Persona("RAMIREZ GARCIA JUAN RAMON","ISC","13400478" ));
        listapersonas.add(new Persona("RODRIGUEZ ADAME OLIVER GIOVANNY","ISC","13400507" ));
        listapersonas.add(new Persona("SANCHEZ JIMENEZ ANA PATRICIA","ISC","13400491" ));
        listapersonas.add(new Persona("SÁNCHEZ PARTIDA HÉCTOR OMAR","ISC","12400322" ));
        listapersonas.add(new Persona("VALDEZ CORREA CARLOS GERMAN","ISC","12400326" ));
        listapersonas.add(new Persona("CARRILLO GONZÁLEZ CARLOS ARTURO","ITIC","13401087" ));
        listapersonas.add(new Persona("HERNANDEZ BAEZA JAVIER","ITIC","13401367" ));
        listapersonas.add(new Persona("IBARRA MARAVILLAS JONATHAN GUADALUPE","ITIC","13401097" ));
        listapersonas.add(new Persona("MARIN BAUTISTA IRVING ALDAHYR","ITIC","12400663" ));
        listapersonas.add(new Persona("OCAMPO AGUILAR JESÚS ANDRÉS","ITIC","13401100" ));
        listapersonas.add(new Persona("TEJEDA MORA CESAR","ITIC","11400309" ));

        AdaptadorPersonas adaptador = new AdaptadorPersonas(this);
        ListView lv1 = (ListView)findViewById(R.id.list1);
        lv1.setAdapter(adaptador);


    }

    class AdaptadorPersonas extends ArrayAdapter<Persona> {

        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context) {
            super(context, R.layout.persona, listapersonas);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.persona, null);

            TextView textView1 = (TextView)item.findViewById(R.id.textView);

            textView1.setText(""+listapersonas.get(position).getNombre()+"\n"+listapersonas.get(position).getCarrera()+"\n"+listapersonas.get(position).getNocontrol());

            ImageView imageView1 = (ImageView)item.findViewById(R.id.imageView);
            /*if (listapersonas.get(position).getGenero()=='m')
                imageView1.setImageResource(R.mipmap.hombre);
            else
                imageView1.setImageResource(R.mipmap.mujer);*/
            imageView1.setImageResource(R.mipmap.ittepic);
            return(item);
        }
    }
}
