package com.example.android.payor;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);
	}

	public void launchTabActivity(View v){
		Intent home = new Intent(this, TabActivity.class);
		startActivity(home);
	}
}
