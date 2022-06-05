package com.example.nfboatapplication.workflow4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;

import com.example.nfboatapplication.R;

public class PortbookDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portbook_date);
        CalendarView simpleCalendarView =  findViewById(R.id.simpleCalenderView); // get the reference of CalendarView
        long selectedDate = simpleCalendarView.getDate();// get selected date in milliseconds
        simpleCalendarView.setDate(selectedDate);


    }
}