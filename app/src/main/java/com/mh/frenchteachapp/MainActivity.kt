package com.mh.frenchteachapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    public fun SayColour(view: View){
        val clickedButton : Button = view as Button

        var mediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(
                clickedButton.tag.toString(),
                "raw",
                packageName))
        mediaPlayer.start()
    }
}