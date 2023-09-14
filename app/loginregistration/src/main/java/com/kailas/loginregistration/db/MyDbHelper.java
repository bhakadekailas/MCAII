package com.kailas.loginregistration.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.kailas.loginregistration.dataModel.StudentDataModel;

import java.util.ArrayList;

public class MyDbHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "student.db";
    public static int DATABASE_VERSION = 1;

    public MyDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE student_details (id INTEGER PRIMARY KEY AUTOINCREMENT, first_name TEXT, last_name TEXT, email TEXT, mobile_no TEXT, user_name TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE student_details");
        db.execSQL("CREATE TABLE student_details (id INTEGER PRIMARY KEY AUTOINCREMENT, first_name TEXT, last_name TEXT, email TEXT, mobile_no TEXT, user_name TEXT, password TEXT)");
    }
}
