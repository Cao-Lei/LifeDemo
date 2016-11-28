package com.example.lifedemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityC extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i("C--", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_c);
		
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("C--", "onStart");
		super.onStart();
		
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("C--", "onRestart");
		super.onRestart();
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("C--", "onResume");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("C--", "onPause");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("C--", "onStop");
		super.onStop();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("C--", "onDestroy");
		super.onDestroy();
	}

}
