package com.kailas.xmlparsingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDetails = findViewById(R.id.tvDetails);
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            InputStream inputStream = getApplicationContext().getAssets().open("student.xml");
            parser.setInput(inputStream, null);

            int eventType = parser.getEventType();
            ArrayList<Student> studentArrayList = new ArrayList<>();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagName = parser.getName();
                if (eventType == XmlPullParser.END_TAG) {
                    if (tagName.equals("student")) {
                        Student student = new Student();
                        student.setName(parser.getAttributeValue(0));
                        student.setBatch(Integer.parseInt(parser.getAttributeValue(1)));
                        student.setCourse(parser.getAttributeValue(2));
                        student.setDivision(parser.getAttributeValue(3));
                        studentArrayList.add(student);
                    }
                }
                eventType = parser.next();
            }
            tvDetails.setText(studentArrayList.toString());
        } catch (XmlPullParserException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}