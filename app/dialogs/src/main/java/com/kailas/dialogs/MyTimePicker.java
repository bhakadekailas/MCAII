package com.kailas.dialogs;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MyTimePicker extends AppCompatActivity {
    TimePicker timePicker;
    TextView textViewSelectedTime;
    Button buttonShowSelectedTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_time_picker);
        timePicker = findViewById(R.id.timePicker);
        textViewSelectedTime = findViewById(R.id.textViewSelectedTime);
        buttonShowSelectedTime = findViewById(R.id.buttonShowSelectedTime);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int min) {
                String time = showTime(hour, min);
                textViewSelectedTime.setText(time);
            }
        });

        buttonShowSelectedTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTimePickerDialog();
            }
        });
    }

    private void showTimePickerDialog() {
        Calendar mCalendar = Calendar.getInstance();
        int hour = mCalendar.get(Calendar.HOUR_OF_DAY);
        int minute = mCalendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(MyTimePicker.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hour, int min) {
                        String time = showTime(hour, min);
                        textViewSelectedTime.setText(time);
                    }
                }, hour, minute, false);
        timePickerDialog.show();
    }

    public String showTime(int hour, int min) {
        String format;
        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
        return hour + " : " + min + " " + format;
    }
}