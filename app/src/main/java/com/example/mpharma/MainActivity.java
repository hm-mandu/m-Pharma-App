package com.example.mpharma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        SystemClock.sleep(3000);

        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.neon));

    }



    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

        if (currentUser == null) {
            Intent loginIntent = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(loginIntent);
            finish();

        }else {
            Intent mainIntent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(mainIntent);
            finish();


        }
    }
}