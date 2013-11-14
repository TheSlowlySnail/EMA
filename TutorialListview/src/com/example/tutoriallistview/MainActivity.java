package com.example.tutoriallistview;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView lv;
	
	private String[] listview_array = {"Eins" , "Zwei" , "Drei" , "Vier"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv = (ListView) findViewById(R.id.listview);
		
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listview_array));
		
		lv.setTextFilterEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() { 
			@Override public void onItemClick(AdapterView<?> arg0, View v, int position, long id) { 
			 AlertDialog.Builder adb = new AlertDialog.Builder( 
			 MainActivity.this); 
			 adb.setTitle("ListView OnClick"); 
			 adb.setMessage("Selected Item is = " 
			 +lv.getItemIdAtPosition(position)); 
			 
			// + lv.getItemAtPosition(position)); 
			 adb.setPositiveButton("Ok", null); 
			 adb.show(); } });
		}
		

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	


}
