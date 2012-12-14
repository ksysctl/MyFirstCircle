package com.mbrenes.myfirstcircle;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.graphics.Color;

public class SpinnerListener extends Activity implements OnItemSelectedListener {
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    	if (pos > 0)  {
    		CircleView circle = MainActivity.getCircle();
    		String item = parent.getItemAtPosition(pos).toString();

	    	int paddingColor = Color.BLACK;
	    	int backgroundColor = Color.WHITE;
    		int idSelected = parent.getId();

    		if (idSelected == R.id.optBackground) {
    	    	if (item.equals("Gray")) {
    	    		backgroundColor = Color.GRAY;
    	    	} else if (item.equals("Red")) {
    	    		backgroundColor = Color.RED;
    	    	}

        		circle.setBackgroundColor(backgroundColor);
    		} else if (idSelected == R.id.optCircle) {
    	    	if (item.equals("Yellow")) {
    	    		paddingColor = Color.YELLOW;
    	    	} else if (item.equals("Green")) {
    	    		paddingColor = Color.GREEN;
    	    	}

        		circle.setPaddingColor(paddingColor);
    		}
    	}
    }

    public void onNothingSelected(AdapterView<?> parent) {
    }
}
