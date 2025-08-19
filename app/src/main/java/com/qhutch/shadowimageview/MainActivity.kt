package com.qhutch.shadowimageview

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.qhutch.shadowimageview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
            override fun onProgressChanged(p0: SeekBar, value: Int, fromUser: Boolean) {
                setImageElevation(value)
            }
        })
    }

    private fun setImageElevation(elevation: Int) {
        binding.textView.text = "Elevation: $elevation dp"
        val e = elevation.toFloat()
        binding.imageview1.setElevationDp(e)
        binding.imageview2.setElevationDp(e)
        binding.imageview3.setElevationDp(e)
        binding.imageview4.setElevationDp(e)
    }
}
