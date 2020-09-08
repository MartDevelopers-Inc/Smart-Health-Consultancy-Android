package com.martdevelopersinc.droidnatifier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
//import android.view.MenuItem;
import android.webkit.WebSettings;
import  android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView natifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        natifier = (WebView)findViewById(R.id.natifier);
        //WebView devlanWebView = (WebView) findViewById(R.id.devlan);
        WebSettings webSettings = natifier.getSettings();
        webSettings.setJavaScriptEnabled(true);
        natifier.setWebViewClient(new WebViewClient());
        //myWebView.setWebViewClient(new WebViewClient());
        //Enter your url Here
        natifier.loadUrl("https://martdev.info");
    }

    @Override
    public void onBackPressed() {
        if(natifier.canGoBack()) {
            natifier.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



}