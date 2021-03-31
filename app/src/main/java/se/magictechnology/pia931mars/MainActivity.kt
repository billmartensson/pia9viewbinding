package se.magictechnology.pia931mars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import se.magictechnology.pia931mars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.mainTextview.text = "BANAN!!!"

        binding.mainButton.setOnClickListener {
            binding.mainTextview.text = "APELSIN!!!"

            //binding.mainTopTextview.text = "CLICK!!!"

            findViewById<TextView>(R.id.mainTopTextview).text = "FUNKAR OCKSÅ!"
        }

    }


}
