package com.kailas.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
    }

    public void register(View view) {
        String name = "Kailas Bhakade";
        String division = "MCA";
        String mobile = "9921710694";
        String email = "abcde@gmail.com";
        String password = "12345678";
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Log.e("KAILASA", "createUserWithEmail:Success = " + user.getEmail());
                        db = FirebaseFirestore.getInstance();
                        db.collection("User")
                                .document(FirebaseAuth.getInstance().getUid())
                                .set(new UserModel(name, mobile, division, email, password));
                    } else {
                        Log.e("KAILASA", "createUserWithEmail:failure", task.getException());
                    }
                });
    }
}