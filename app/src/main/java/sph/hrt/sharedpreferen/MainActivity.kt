package sph.hrt.sharedpreferen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import sph.hrt.sharedpreferen.config.SharedPreferentApplication
import sph.hrt.sharedpreferen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            txtPassword.setText(SharedPreferentApplication.prefs.GetPass())
            txtUserName.setText(SharedPreferentApplication.prefs.GetUser())
            btnSave.setOnClickListener {
                SharedPreferentApplication.prefs.SaveLogin(
                    txtUserName.text.toString(),
                    txtPassword.text.toString()
                )
                Toast.makeText(
                    this@MainActivity,
                    "It has been saved successfully",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}