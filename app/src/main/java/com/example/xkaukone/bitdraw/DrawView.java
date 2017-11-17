package com.example.xkaukone.bitdraw;

/**
 * Created by xkaukone on 17.11.2017.
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        /*
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawRect(30, 30, 80, 80, paint);
        paint.setStrokeWidth(0);
        paint.setColor(Color.CYAN);
        canvas.drawRect(33, 60, 77, 77, paint );
        paint.setColor(Color.YELLOW);
        canvas.drawRect(33, 33, 77, 60, paint );
        */
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.katewinslet);
        //Bitmap bitmap = BitmapFactory.decodeFile(R.drawable.katewinslet);
        canvas.drawBitmap(bitmap,0,0,null);
        /*
        String name = c.getString(str_url);
        URL url_value = new URL(name);
        ImageView profile = (ImageView)v.findViewById(R.id.vdo_icon);
        if (profile != null) {
            Bitmap mIcon1 =
                    BitmapFactory.decodeStream(url_value.openConnection().getInputStream());
            profile.setImageBitmap(mIcon1);
        }
       */
    }

}