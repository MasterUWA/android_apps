package com.example.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

	    private WebView wv1;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
		        //b1=(Button)findViewById(R.id.button);
		        wv1=(WebView)findViewById(R.id.webView1);
	            String url = "https://www.google.com/";
	            wv1.getSettings().setLoadsImagesAutomatically(true);
	            wv1.getSettings().setJavaScriptEnabled(true);
	            wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
	            wv1.loadUrl(url);
	            
	    }
	        
	 }
	 
