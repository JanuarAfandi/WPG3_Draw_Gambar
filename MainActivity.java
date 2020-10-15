package com.pens.graphicsdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView ourView;

    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do all our drawing in a separate method
        draw();

        // Make ourView ImageView object the view for the Activity
        setContentView(ourView);

    }
    // This is our draw() method
    public void draw(){

        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize our previously declared member object of type ImageView
        ourView = new ImageView(this);
        // Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        // We now have a surface ready to draw on
        // But we need something to draw with

        // Declare an object of type Paint
        Paint paint;
        // Initialize it ready for painting our canvas
        paint = new Paint();

        // Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Make the brush (Yellow)
        paint.setColor(Color.argb(255,  255, 128, 0));
        // We can change this around as well

        // Declare an object of type Bitmap
        Bitmap bitmapBob;
        // Initialize it using the bob.png file
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.man);
        // Now draw bob to our canvas
        canvas.drawBitmap(bitmapBob, 25, 300, paint);



        // Draw some text
        canvas.drawText("Mochammad Januar Afandi (Orang & Matahari)", 50, 50, paint);

        // Draw a pixel
        canvas.drawPoint(40,50,paint);

        // Draw a circle
        canvas.drawCircle(475,150,100,paint);

        // Change the brush color (Orange)
        paint.setColor(Color.argb(255,  255, 255, 0));

        // Draw a circle
        canvas.drawCircle(475,150,70,paint);

        // Back to onCreate method to set our canvas as the view

    }
}
