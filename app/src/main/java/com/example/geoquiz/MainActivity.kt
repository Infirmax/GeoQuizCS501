package com.bignerdranch.android.geoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.bignerdranch.android.geoquiz.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//USED AI TO FIGURE OUT BINDING OTHER SNACKBAR FUNCTIONS () AND USED IT TO DEBUG A LOT OF ISSUES
class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener{
            Snackbar.make(binding.root, "True", Snackbar.LENGTH_SHORT)
                .setAction("Dismiss") {
                }
                .show()
        }

        binding.falseButton.setOnClickListener {
            Snackbar.make(binding.root, "False", Snackbar.LENGTH_SHORT)
                .setAction("Dismiss") {
                    // Optional: Define action behavior here if needed
                }
                .show()
        }
    }
}




