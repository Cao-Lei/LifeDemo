package com.example.lifedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityB extends Activity {
	private Button btn2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_b);

		btn2 = (Button) findViewById(R.id.btn2);
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ActivityB.this, MainActivity.class);
				startActivity(intent);
			}
		});
		Log.i("B--", "onCreate");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("B--", "onStart");
		super.onStart();

	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("B--", "onRestart");
		super.onRestart();

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("B--", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("B--", "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("B--", "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("B--", "onDestroy");
		super.onDestroy();
	}

}
