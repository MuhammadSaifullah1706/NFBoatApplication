package com.example.nfboatapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.nfboatapplication.R;
import com.example.nfboatapplication.workflow5.RechercheStep4Activity;

import java.util.ArrayList;

public class AddDocumentActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView,autoCompleteTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_document);
        autoCompleteTextView = findViewById(R.id.drop_item);
        autoCompleteTextView1 = findViewById(R.id.drop_item1);

        ArrayList<String> list_Choisir_le_bateau = new ArrayList<>();
        list_Choisir_le_bateau.add("Zodiac (NFCard 1)");
        list_Choisir_le_bateau.add("Beneteau (NFCard 2)");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(AddDocumentActivity.this,R.layout.list_typedebateau, list_Choisir_le_bateau);
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


        ArrayList<String> list_Type_de_document = new ArrayList<>();
        list_Type_de_document.add("Facture");
        list_Type_de_document.add("Assurance");
        list_Type_de_document.add("Immatriculation");
        list_Type_de_document.add("Contrôle technique");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(AddDocumentActivity.this,R.layout.list_typedebateau, list_Type_de_document);
        autoCompleteTextView1.setAdapter(arrayAdapter1);
        autoCompleteTextView1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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