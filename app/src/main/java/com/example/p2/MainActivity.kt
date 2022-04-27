package com.example.p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.p2.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
      private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.bugetage.setOnClickListener {
          //Fire when Button is click
          val calenderyear = Calendar.getInstance().get(Calendar.YEAR)
          val yearofbirht: String = binding.txtyearofbirth.text!!.toString()

          //This conditions statement will decide between valid or invalid Entries
          if (yearofbirht!!.toInt() < 1900 || yearofbirht!!.toInt() > calenderyear)
          //If Invalid
          {
              binding.yourageshow.text = "Invalid Entry"
          }
          else
          //If Valid
          {
              val myage = calenderyear - yearofbirht.toInt()
              binding.yourageshow.text = myage!!.toString()
          }
      }

    }

}