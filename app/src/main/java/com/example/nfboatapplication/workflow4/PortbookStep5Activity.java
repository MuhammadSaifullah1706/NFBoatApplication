package com.example.nfboatapplication.workflow4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.nfboatapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PortbookStep5Activity extends AppCompatActivity {

    ConstraintLayout constraintLayout1,constraintLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_portbook_step5);
        constraintLayout1=findViewById(R.id.constraint1);
        constraintLayout2=findViewById(R.id.constraint2);


        constraintLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog();
            }
        });


        constraintLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBottomSheetDialog1();
            }
        });

    }
    private void showBottomSheetDialog() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_longer_beaute);
        bottomSheetDialog.show();

    }


    private void showBottomSheetDialog1() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setContentView(R.layout.bottom_longer_beaute2);
        bottomSheetDialog.show();

    }
}