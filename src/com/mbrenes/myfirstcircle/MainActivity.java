package com.mbrenes.myfirstcircle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;

public class MainActivity extends Activity {
	private Spinner optCircle;
	private Spinner optBackground;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addListenerOnItemSelected();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void addListenerOnItemSelected() {
		optCircle = (Spinner) findViewById(R.id.optCircle);
		optCircle.setOnItemSelectedListener(new MyOnItemSelectedListener());

		optBackground = (Spinner) findViewById(R.id.optBackground);
		optBackground.setOnItemSelectedListener(new MyOnItemSelectedListener());
	}
}
