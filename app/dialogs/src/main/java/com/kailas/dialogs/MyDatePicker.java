package com.kailas.dialogs;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyDatePicker extends AppCompatActivity {
    CalendarView calendarView;
    Button buttonShowDateFromDatePicker;
    TextView textViewCurrentDateValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_date_picker);
        textViewCurrentDateValue = findViewById(R.id.textViewCurrentDateValue);
        buttonShowDateFromDatePicker = findViewById(R.id.buttonShowDateFromDatePicker);
        calendarView = findViewById(R.id.calendarView);

        buttonShowDateFromDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePicker();
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                String formattedDate = getFormattedDate(day, month, year);
                textViewCurrentDateValue.setText(formattedDate);
            }
        });
    }

    private void showDatePicker() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(MyDatePicker.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        String formattedDate = getFormattedDate(day, month, year);
                        textViewCurrentDateValue.setText(formattedDate);
                    }
                }, year, month, dayOfMonth);
        datePickerDialog.show();
    }

    private String getFormattedDate(int dayOfMonth, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        cal.set(Calendar.MONTH, month);
//        String DATE_FORMAT = "EE, MMM dd, yyyy";
        String DATE_FORMAT = "EEE-dd-MM-yyyy";
//        String DATE_FORMAT = "E, MMM d, yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(cal.getTime());
    }
}