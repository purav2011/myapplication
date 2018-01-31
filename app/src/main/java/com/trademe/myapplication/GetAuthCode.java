//package com.trademe.myapplication;
//
//import android.support.v7.app.AppCompatActivity;
//
//import android.Manifest;
//import android.accounts.Account;
//import android.accounts.AccountManager;
//import android.accounts.AccountManagerCallback;
//import android.accounts.AccountManagerFuture;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.provider.Settings;
//import android.support.v4.app.ActivityCompat;
//import android.support.v4.app.NotificationCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Toast;
///**
// * Created by Purav on 29/01/2018.
// */
//
//public class GetAuthCode extends AppCompatActivity {
//}
//
//
//
//public class GetAuthTokenActivity extends AppCompatActivity {
//
//    private AccountManager accountManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_authtoken);
//
//        accountManager = AccountManager.get(getBaseContext());
//    }
