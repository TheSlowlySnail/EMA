package com.example.listview;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity  {

	TextView content;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	
		
	}

	
	public void toListe(View args0){   
		Intent intent = new Intent(this,Liste.class);
		
		startActivity(intent);
		
		
		
	}
	
	

}

