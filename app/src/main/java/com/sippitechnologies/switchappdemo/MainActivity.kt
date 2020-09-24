package com.sippitechnologies.switchappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
            {
                switch1.text = resources.getString(R.string.bulbison)
                imageView.setImageResource(R.drawable.bulbon)
            }
            else
            {
                switch1.text = resources.getString(R.string.bulbisoff)
                imageView.setImageResource(R.drawable.bulboff)
            }
        }
    }
}