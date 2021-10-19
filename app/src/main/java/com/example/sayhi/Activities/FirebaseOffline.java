package com.example.sayhi.Activities;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

//Buat save Firebase jadi offline dan bisa di buka saat tidak ada internet
public class FirebaseOffline extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

    }
}
