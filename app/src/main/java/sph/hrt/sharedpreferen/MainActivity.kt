package sph.hrt.sharedpreferen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import sph.hrt.sharedpreferen.config.SharedPreferentApplication
import sph.hrt.sharedpreferen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
         txtPassword.setText(SharedPreferentApplication.prefs.GetPass())
         txtUserName.setText(SharedPreferentApplication.prefs.GetUser())
            btnSave.setOnClickListener {
                SharedPreferentApplication.prefs.SaveUser(txtUserName.text.toString(), txtPassword.text.toString())
           Toast.makeText(this@MainActivity, "It has been saved successfully",Toast.LENGTH_LONG).show()
            }
        }
    }
}