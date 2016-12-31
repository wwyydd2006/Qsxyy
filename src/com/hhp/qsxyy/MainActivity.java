package com.hhp.qsxyy;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	String AppName = "qsxyy";
	SharedPreferences sp = getSharedPreferences(AppName, MODE_PRIVATE);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (!sp.getBoolean("isLoged", false)) {
			SharedPreferences.Editor editor = sp.edit();
			editor.putString("uname", "����ƽ");
			editor.putString("upassword", "0621");
			editor.putBoolean("isLoged", true);
			editor.commit();
		}
		
		
		
		TextView view = (TextView) findViewById(R.id.Test);
		view.setText("�û���:"+sp.getString("uname", "�����"));
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
