package com.example.kadaiapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

////////////////////////////////////////////////
//
//画面遷移(別のActivityへ移る)
//
////////////////////////////////////////////////

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(mButton1Listener);
	}
	private OnClickListener mButton1Listener = new OnClickListener() {
        public void onClick(View v) {
        	Intent intent = new Intent(MainActivity.this, SubActivity.class);
        	
       
        	Uri uri = Uri.parse("mailto:ino0341@gmail.com"); 
      		Intent intent1 = new Intent(Intent.ACTION_SENDTO,uri); 
        	intent1.putExtra(Intent.EXTRA_SUBJECT,"タイトル"); 
        	intent1.putExtra(Intent.EXTRA_TEXT,"本文"); 
        	intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
        	startActivity(intent1); 
        	
        	
        	
        	
        	
        }
    };
}