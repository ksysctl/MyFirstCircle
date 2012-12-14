package com.mbrenes.myfirstcircle;

import android.view.View;
import android.view.MotionEvent;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;

public class CircleView extends View {
    private Paint paint;
    private boolean touched;
	private int backgroundColor;
	private int paddingColor;
	private float x;
	private float y;

    public CircleView(Context context) {
        super(context);

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        touched = false;
        paddingColor = Color.BLACK;
        backgroundColor = Color.WHITE;
        x = 0;
        y = 0;
    }

    @Override
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        backgroundColor = color;
    }

    public void setPaddingColor(int color) {
        paddingColor = color;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(backgroundColor);

        if (touched) {
	        paint.setColor(paddingColor);
	        paint.setStyle(Paint.Style.FILL);
	        canvas.drawCircle(x, y, 50, paint);
        }

        touched = false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	super.onTouchEvent(event);

        int action = event.getAction();
        switch (action & MotionEvent.ACTION_MASK) {
        	case MotionEvent.ACTION_DOWN: {
        		x = event.getX();
        		y = event.getY();
        		touched = true;

        		invalidate();
            break;
        	}
        }

        return true;
    }
}
