package com.slidingmenu;

import com.slidingmenu.view.SlidingMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

	private SlidingMenu mLeftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		mLeftMenu = (SlidingMenu) findViewById(R.id.slidingmenu);
		
	}

	public void toggleMenu() {
		mLeftMenu.toggle();
	}
}
