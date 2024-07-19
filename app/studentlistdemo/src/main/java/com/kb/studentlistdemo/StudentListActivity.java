package com.kb.studentlistdemo;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentListActivity extends AppCompatActivity {

    ListView listViewStudent;
    Context context;
    // Array of strings...
    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        context = StudentListActivity.this;
        listViewStudent = findViewById(R.id.listViewStudent);


        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student(1, "Ram", "Patil", 20);
        studentArrayList.add(student1);
        Student student2 = new Student(1, "Gamesh", "Joshi", 10);
        studentArrayList.add(student2);
        Student student3 = new Student(1, "Kailas", "Bhakade", 20);
        studentArrayList.add(student3);

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_spinner_item, mobileArray);
//        listViewStudent.setAdapter(adapter);

        ArrayList<HashMap<String, String> >maps = new ArrayList<>();
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("st1", mobileArray[0]);
        maps.add(0, hashMap1);
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("st2", mobileArray[1]);
        maps.add(1, hashMap2);

        String[] from = {"st1", "st2"};
        int[] to = {R.id.titleTextView, R.id.subtitleTextView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(context,
                maps, R.layout.list_item, from, to);
        listViewStudent.setAdapter(simpleAdapter);


//        String[] fruitsNames = {"Apple", "Banana", "Litchi", "Mango", "PineApple"};
//        String[] fruitsInitials = {"A", "B", "L", "M", "P"};
//
//        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
//        for (int i=0;i<fruitsNames.length;i++)
//        {
//            HashMap<String,String> hashMap=new HashMap<>();
//            hashMap.put("name",fruitsNames[i]);
//            hashMap.put("initials",fruitsInitials[i]+"");
//            arrayList.add(hashMap);
//        }
//        String[] from={"name","initials"};
//        int[] to={R.id.titleTextView,R.id.subtitleTextView};
//        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.list_item,from,to);
//        listViewStudent.setAdapter(simpleAdapter);
    }
}