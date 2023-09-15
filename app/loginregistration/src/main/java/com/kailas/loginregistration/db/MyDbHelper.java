package com.kailas.loginregistration.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    public boolean saveStudent(StudentDataModel studentDataModel) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_name", studentDataModel.getFirstName());
        contentValues.put("last_name", studentDataModel.getLastName());
        contentValues.put("email", studentDataModel.getEmail());
        contentValues.put("mobile_no", studentDataModel.getMobile());
        contentValues.put("user_name", studentDataModel.getUsername());
        contentValues.put("password", studentDataModel.getPassword());
        SQLiteDatabase db = this.getWritableDatabase();
        long id = db.insert("student_details", null, contentValues);
        db.close();
        return id > 0;
    }

    public boolean updateStudentDetails(String firstName, String lastName, String newMobileNo) {
        SQLiteDatabase db = this.getWritableDatabase();
        String whereClause = "first_name = ? AND last_name = ? ";
        String[] whereArgs = {firstName, lastName};
        ContentValues contentValues = new ContentValues();
        contentValues.put("mobile_no", newMobileNo);
        long id = db.update("student_details", contentValues, whereClause, whereArgs);
        db.close();
        return id > 0;
    }

    public boolean deleteStudent(String firstName, String lastName) {
        SQLiteDatabase db = this.getWritableDatabase();
        String whereClause = "first_name = ? AND last_name = ? ";
        String[] whereArgs = {firstName, lastName};
        long id = db.delete("student_details", whereClause, whereArgs);
        db.close();
        return id > 0;
    }

    public StudentDataModel getStudent() {
        SQLiteDatabase db = this.getReadableDatabase();
        StudentDataModel studentDataModel = new StudentDataModel();
        Cursor cursor = db.query("student_details", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            studentDataModel.setFirstName(cursor.getString(cursor.getColumnIndexOrThrow("first_name")));
            studentDataModel.setLastName(cursor.getString(cursor.getColumnIndexOrThrow("last_name")));
            studentDataModel.setEmail(cursor.getString(cursor.getColumnIndexOrThrow("email")));
            studentDataModel.setMobile(cursor.getString(cursor.getColumnIndexOrThrow("mobile_no")));
            studentDataModel.setUsername(cursor.getString(cursor.getColumnIndexOrThrow("user_name")));
            studentDataModel.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("password")));
        }
        cursor.close();
        return studentDataModel;
    }


    /**
     * This method returns all students using android inbuilt query method
     *
     * @return studentDataModelArrayList
     */
    public ArrayList<StudentDataModel> getAllStudents() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<StudentDataModel> studentDataModelArrayList = new ArrayList<>();
        Cursor cursor = db.query("student_details", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                StudentDataModel studentDataModel = new StudentDataModel();
                studentDataModel.setFirstName(cursor.getString(cursor.getColumnIndexOrThrow("first_name")));
                studentDataModel.setLastName(cursor.getString(cursor.getColumnIndexOrThrow("last_name")));
                studentDataModel.setEmail(cursor.getString(cursor.getColumnIndexOrThrow("email")));
                studentDataModel.setMobile(cursor.getString(cursor.getColumnIndexOrThrow("mobile_no")));
                studentDataModel.setUsername(cursor.getString(cursor.getColumnIndexOrThrow("user_name")));
                studentDataModel.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("password")));
                studentDataModelArrayList.add(studentDataModel);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return studentDataModelArrayList;
    }


    /**
     * This method returns all students using raw query
     *
     * @return studentDataModelArrayList
     */
    public ArrayList<StudentDataModel> getAllStudent() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<StudentDataModel> studentDataModelArrayList = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM student_details", null);
        if (cursor.moveToFirst()) {
            do {
                StudentDataModel studentDataModel = new StudentDataModel();
                studentDataModel.setFirstName(cursor.getString(cursor.getColumnIndexOrThrow("first_name")));
                studentDataModel.setLastName(cursor.getString(cursor.getColumnIndexOrThrow("last_name")));
                studentDataModel.setEmail(cursor.getString(cursor.getColumnIndexOrThrow("email")));
                studentDataModel.setMobile(cursor.getString(cursor.getColumnIndexOrThrow("mobile_no")));
                studentDataModel.setUsername(cursor.getString(cursor.getColumnIndexOrThrow("user_name")));
                studentDataModel.setPassword(cursor.getString(cursor.getColumnIndexOrThrow("password")));
                studentDataModelArrayList.add(studentDataModel);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return studentDataModelArrayList;
    }

    public boolean isValidUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String[] params = new String[]{username, password};
        Cursor cursor = db.rawQuery("SELECT * FROM student_details WHERE user_name = ? AND password = ? ", params);
        if (cursor.getCount() > 0) {
            cursor.close();
            return true;
        }
        cursor.close();
        return false;
    }
}
