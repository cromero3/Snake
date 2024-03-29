package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;


public abstract class GameObject {
    protected Point location;
    protected int size;
    protected Bitmap bitmap;
    public GameObject(Context context, Point location, int size, int resourceId) {
        this.location = location;
        this.size = size;
        bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
        bitmap = Bitmap.createScaledBitmap(bitmap, size, size, false);

    }

    // Let SnakeGame know where the apple is
    // SnakeGame can share this with the snake
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // draw method
    public abstract void draw(Canvas canvas, Paint paint);
}
