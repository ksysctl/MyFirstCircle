package com.mbrenes.myfirstcircle;

import android.view.View;
import android.view.WindowManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends View {
    Context mContext;
    int mColor;

    public Circle(Context context, int color) {
        super(context);
        mContext = context;
        mColor = color;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        WindowManager wManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);

        int w = wManager.getDefaultDisplay().getWidth();
        int h = wManager.getDefaultDisplay().getHeight();
        int r = 100;

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(mColor);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(w/2, h/4, r, paint);
    }
}
