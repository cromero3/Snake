package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class Background {

    private Point location = new Point();

    // The range of values we can choose from to spawn a background
    private Point mSpawnRange;
    private int mSize;

    // An image to represent the background
    private Bitmap mBitmapBackground;

    // Constructor
    public Background(Context context, Point spawnRange, int size) {
        mSpawnRange = spawnRange;
        mSize = size;
        // Load the background image
        mBitmapBackground = BitmapFactory.decodeResource(context.getResources(), R.drawable.background);
    }

    // Method to draw the background on the canvas
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(mBitmapBackground, location.x, location.y, paint);
    }

    // Method to set the location of the background
    public void setLocation(Point location) {
        this.location = location;
    }
}