package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
 private static final String TAG = "LifeCycle";
 
	@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
}

	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		Log.v(TAG, "onStart is called.");
	}

	@Override
	protected void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		Log.v(TAG, "onRestart is called");
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Log.v(TAG, "onResume is called");
	}

	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
		Log.v(TAG, "onStop is called");
	}
}


