package com.example.nfboatapplication.workflow5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.nfboatapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class RechercheStep4Activity extends AppCompatActivity {

    ConstraintLayout constraintLayout1,constraintLayout3;
    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_recherche_step4);

        constraintLayout1=findViewById(R.id.constraint1);
        constraintLayout3=findViewById(R.id.constraint3);
        autoCompleteTextView = findViewById(R.id.drop_item);

        ArrayList<String> list_Marque = new ArrayList<>();
        list_Marque.add("Zodiac");
        list_Marque.add("Riva");
        list_Marque.add("Boston-whaler");
        list_Marque.add("Quicksilver");
        list_Marque.add("Bayliner");
        list_Marque.add("Bénéteau");
        list_Marque.add("Jeanneau");
        list_Marque.add("Four-winns");
        list_Marque.add("Capelli");
        list_Marque.add("Princess");
        list_Marque.add("Sea-Ray");
        list_Marque.add("Grand-banks");
        list_Marque.add("Alubat");
        list_Marque.add("Guy-Couach");
        list_Marque.add("Rm-yachts");
        list_Marque.add("Dufour Yachts");
        list_Marque.add("Rhéa");
        list_Marque.add("Bavaria");
        list_Marque.add("Amel");
        list_Marque.add("Fjord");
        list_Marque.add("Axopar");
        list_Marque.add("Lagoon");
        list_Marque.add("Fountaine-pajot");
        list_Marque.add("Bombard");
        list_Marque.add("Sunseeker");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(RechercheStep4Activity.this,R.layout.list_typedebateau, list_Marque);
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


        constraintLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog();
            }
        });


        constraintLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog1();
            }
        });

    }


    private void showBottomSheetDialog() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_puissance);
        bottomSheetDialog.show();

    }


    private void showBottomSheetDialog1() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_sheet_duree);
        bottomSheetDialog.show();

    }
}