package com.elvertoni.listatelefonica.database;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
    }
}

