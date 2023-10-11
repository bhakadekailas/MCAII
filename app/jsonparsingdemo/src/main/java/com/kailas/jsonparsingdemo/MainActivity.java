package com.kailas.jsonparsingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetails = findViewById(R.id.tvDetails);

        ArrayList<Student> studentArrayList = parseJsonToDataModelClass();
        tvDetails.setText(studentArrayList.toString());
    }

    private ArrayList<Student> parseJsonToDataModelClass() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray jsonArray = obj.getJSONArray("students");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Student student = new Student();
                student.setName(jsonObject.getString("name"));
                student.setBatch(Integer.parseInt(jsonObject.getString("batch")));
                student.setCourse(jsonObject.getString("course"));
                student.setDivision(jsonObject.getString("division"));
                Log.e("KAILASA", "parseJsonToDataModelClass: " + student);
                studentArrayList.add(student);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return studentArrayList;
    }

    public String loadJSONFromAsset() {
        String json;
        try {
            InputStream is = getApplicationContext().getAssets().open("student.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}