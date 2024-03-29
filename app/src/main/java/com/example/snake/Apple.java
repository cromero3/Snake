package com.example.snake;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import java.util.Random;

public class Apple extends GameObject {

    // The range of values we can choose from
    // to spawn an apple
    private Point mSpawnRange;
    private int mSize;

    public Apple(Context context, Point sr, int s, int resourceId) {

        /// Set up the apple in the constructor
        super(context, new Point(-10, -10), s, resourceId);

        // The range of values we can choose from
        this.mSpawnRange = sr;
        // Make a note of the size of an apple
        this.mSize = s;
    }

    // Draw the apple
    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(bitmap, location.x * mSize, location.y * mSize, paint);
    }

    // This is called every time an apple is eaten
    void spawn() {
        Random random = new Random();
        location.x = random.nextInt(mSpawnRange.x - 1) + 1;
        location.y = random.nextInt(mSpawnRange.y - 1) + 1;
    }
}