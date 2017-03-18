package com.example.android.payor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

/**
 * Created by Nypro on 16-Mar-17.
 */

public class TabActivity extends AppCompatActivity {

	Fragment viewFrag = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_layout);

		AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_bar);
		viewFrag = new HomeFragment();


		// items
		AHBottomNavigationItem item1 = new AHBottomNavigationItem("Home", R.drawable.home2, R.color.colorPrimary);
		AHBottomNavigationItem item2 = new AHBottomNavigationItem("Notifications", R.drawable.notifications2, R.color.colorPrimary);
		AHBottomNavigationItem item3 = new AHBottomNavigationItem("History", R.drawable.history2, R.color.colorPrimary);
		AHBottomNavigationItem item4 = new AHBottomNavigationItem("Settings", R.drawable.settings2, R.color.colorPrimary);

		bottomNavigation.addItem(item1);
		bottomNavigation.addItem(item2);
		bottomNavigation.addItem(item3);
		bottomNavigation.addItem(item4);
		bottomNavigation.setBackgroundColor(Color.parseColor("#FEFEFE"));
		bottomNavigation.setAccentColor(Color.parseColor("#0EF1B4"));
		bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
			@Override
			public boolean onTabSelected(int position, boolean wasSelected) {
				tabSelect(position, wasSelected);
				return true;
			}
		});

		if(savedInstanceState == null){
			getSupportFragmentManager()
					.beginTransaction()
					.add(R.id.frag_container, viewFrag)
					.commit();
		}
	}

	public void tabSelect(int position, boolean wasSelected){
		FragmentTransaction fragTransaction = getSupportFragmentManager().beginTransaction();
		if(position == 0) {
			if(viewFrag instanceof HomeFragment) return;
			viewFrag = new HomeFragment();
			fragTransaction.replace(R.id.frag_container, viewFrag);
			fragTransaction.commit();
		} else{
			if(viewFrag instanceof DummyFragment) return;
			viewFrag = new DummyFragment();
			fragTransaction.replace(R.id.frag_container, viewFrag);
			fragTransaction.commit();
		}
	}

}
