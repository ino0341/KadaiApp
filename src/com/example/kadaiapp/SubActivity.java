package com.example.kadaiapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
    
		// データの受取
		Intent intent = getIntent();
        String arg = intent.getStringExtra("Name");
        Toast.makeText(this,arg, Toast.LENGTH_LONG).show();
		
		Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(mButton1Listener);
	}
	private OnClickListener mButton1Listener = new OnClickListener() {
        public void onClick(View v) {
        	Uri uri = Uri.parse("ino0341@gmail.com"); 
      		Intent intent=new Intent(Intent.ACTION_SENDTO,uri); 
        	intent.putExtra(Intent.EXTRA_SUBJECT,"タイトル"); 
        	intent.putExtra(Intent.EXTRA_TEXT,"本文"); 
        	intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
        	startActivity(intent); 
        	// 前の画面に戻る
        	finish();
        }
    };

}
