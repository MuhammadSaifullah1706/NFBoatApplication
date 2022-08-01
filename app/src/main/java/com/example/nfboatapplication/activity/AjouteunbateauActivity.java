package com.example.nfboatapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.nfboatapplication.R;
import com.example.nfboatapplication.workflow5.VendreSonBateau1Activity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class AjouteunbateauActivity extends AppCompatActivity {

    TextInputLayout textInputLayout,textInputLayout1,textInputLayout2;
    AutoCompleteTextView autoCompleteTextView,autoCompleteTextView2,autoCompleteTextView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouteunbateau);
        textInputLayout = findViewById(R.id.menu);
        textInputLayout1 = findViewById(R.id.menu1);
        textInputLayout2 = findViewById(R.id.menu2);
        autoCompleteTextView = findViewById(R.id.drop_item);
        autoCompleteTextView2 = findViewById(R.id.drop_item1);
        autoCompleteTextView3 = findViewById(R.id.drop_item2);


        ArrayList<String> list_typedebateau = new ArrayList<>();
        list_typedebateau.add("Bateau à moteur");
        list_typedebateau.add("Semi-rigide");
        list_typedebateau.add("Voilier");
        list_typedebateau.add("Catamaran");
        list_typedebateau.add("Jetski");
        list_typedebateau.add("Péniche");
        list_typedebateau.add("Yacht");
        list_typedebateau.add("Goélette");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(AjouteunbateauActivity.this,R.layout.list_typedebateau, list_typedebateau);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tutorialsName = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + tutorialsName, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });


        //list 2
        ArrayList<String> list_affaires_maritimes = new ArrayList<>();
        list_affaires_maritimes.add("Auvergne-Rhône-Alpes");
        list_affaires_maritimes.add("Bourgogne-Franche-Comté");
        list_affaires_maritimes.add("Bretagne");
        list_affaires_maritimes.add("Centre-Val de Loire");
        list_affaires_maritimes.add("Corse");
        list_affaires_maritimes.add("Grand Est");
        list_affaires_maritimes.add("Hauts-de-France");
        list_affaires_maritimes.add("Île-de-France");
        list_affaires_maritimes.add("\tNormandie");
        list_affaires_maritimes.add("Nouvelle-Aquitaine");
        list_affaires_maritimes.add("Occitanie");
        list_affaires_maritimes.add("Pays de la Loire");
        list_affaires_maritimes.add("Provence-Alpes-Côte d'Azur");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(AjouteunbateauActivity.this,R.layout.list_typedebateau, list_affaires_maritimes);
        autoCompleteTextView2.setAdapter(arrayAdapter1);
        autoCompleteTextView2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tutorialsName = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + tutorialsName, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });


        //list 3
        ArrayList<String> list_franchisé_en_douanes = new ArrayList<>();
        list_franchisé_en_douanes.add("Auvergne-Rhône-Alpes");
        list_franchisé_en_douanes.add("Bourgogne-Franche-Comté");
        list_franchisé_en_douanes.add("Bretagne");
        list_franchisé_en_douanes.add("Centre-Val de Loire");
        list_franchisé_en_douanes.add("Corse");
        list_franchisé_en_douanes.add("Grand Est");
        list_franchisé_en_douanes.add("Hauts-de-France");
        list_franchisé_en_douanes.add("Île-de-France");
        list_franchisé_en_douanes.add("\tNormandie");
        list_franchisé_en_douanes.add("Nouvelle-Aquitaine");
        list_franchisé_en_douanes.add("Occitanie");
        list_franchisé_en_douanes.add("Pays de la Loire");
        list_franchisé_en_douanes.add("Provence-Alpes-Côte d'Azur");

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(AjouteunbateauActivity.this,R.layout.list_typedebateau, list_franchisé_en_douanes);
        autoCompleteTextView3.setAdapter(arrayAdapter2);
        autoCompleteTextView3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tutorialsName = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Selected: " + tutorialsName, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView <?> parent) {
            }
        });

    }
}