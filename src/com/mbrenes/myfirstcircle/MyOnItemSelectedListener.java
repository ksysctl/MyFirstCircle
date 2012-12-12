package com.mbrenes.myfirstcircle;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.AdapterView.OnItemSelectedListener;
import android.graphics.Color;

//import android.util.Log;

public class MyOnItemSelectedListener extends Activity implements OnItemSelectedListener {
	//private static final String TAG = "MyLoggingListener";

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    	if (pos > 0)  {
    		int idSelected = parent.getId();
    		String item = parent.getItemAtPosition(pos).toString();

    		if (idSelected == R.id.optBackground) {
    			setBackground(parent, view, item);
    		} else if (idSelected == R.id.optCircle) {
    			drawCircle(parent, view, item);
    		}
    	}
    }

    public void onNothingSelected(AdapterView<?> parent) {
    }

    private void setBackground(AdapterView<?> parent, View view, String item) {
    	int color = Color.WHITE;

    	if (item.equals("Gray")) {
    		color = Color.GRAY;
    	} else if (item.equals("Red")) {
    		color = Color.RED;
    	}

		View v = (View) view.getRootView();
		LinearLayout bg = (LinearLayout) v.findViewById(R.id.bgLayout);
		bg.setBackgroundColor(color);
    }

    private void drawCircle(AdapterView<?> parent, View view, String item) {
    	int color = Color.TRANSPARENT;

    	if (item.equals("Green")) {
    		color = Color.GREEN;
    	} else if (item.equals("Black")) {
    		color = Color.BLACK;
    	}

		View v = (View) view.getRootView();
		LinearLayout bg = (LinearLayout) v.findViewById(R.id.bgLayout);
		Circle cv = new Circle(parent.getContext(), color);

		bg.addView(cv);
    }
}
