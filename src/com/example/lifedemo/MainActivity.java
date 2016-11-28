package com.example.lifedemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ActivityB.class);
				startActivity(intent);
			}
		});

		findViewById(R.id.text_2).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ActivityC.class);
				startActivity(intent);
			}
		});
		Log.i("A--", "onCreate");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("A--", "onSdstart");
		super.onStart();

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("A--", "onRestart");
		super.onRestart();

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("A--", "onResume");
		super.onResume();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("A--", "onPause");
		super.onPause();

	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("A--", "onStop");
		super.onStop();

	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("A--", "onDestroy");
		super.onDestroy();

	}

}
