package com.mbrenes.myfirstcircle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	private Spinner optBackground;
	private Spinner optCircle;
	private LinearLayout bgLayout;
	private static CircleView circle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bgLayout = (LinearLayout) findViewById(R.id.bgLayout);
		circle = new CircleView(this);
		bgLayout.addView(circle);

		addListenerOnItemSelected();
	}

	public static CircleView getCircle() {
		return circle;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void addListenerOnItemSelected() {
		optBackground = (Spinner) findViewById(R.id.optBackground);
		optBackground.setOnItemSelectedListener(new SpinnerListener());

		optCircle = (Spinner) findViewById(R.id.optCircle);
		optCircle.setOnItemSelectedListener(new SpinnerListener());
	}
}
