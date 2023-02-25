package com.example.testwebview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1st, Insert webview item in acitivity.
        val myWeb = findViewById<WebView>(R.id.MyWebView)

        // Block to run chrome unexpectedly
        myWeb.webViewClient = WebViewClient()

        // 3rd, Run webview loading code.
        myWeb.apply {
            loadUrl("https://www.youtube.com/")
            settings.javaScriptEnabled = true
        }
    }
}
