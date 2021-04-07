package com.example.clubcardregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.clubcardregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ccWeb.settings.javaScriptEnabled = true
        binding.ccWeb.webViewClient = WebViewClient()


        binding.txtUrl.setText("https://clubcardregister.ppe.ncp-th.tescolotus.com/th")
    }

    fun loadWeb(view: View){

        val customHeaders = mapOf<String, String>(
            "tmn-access-token" to "999-999-9999"
        )
        binding.ccWeb.loadUrl(binding.txtUrl.text.toString(), customHeaders)
    }
}