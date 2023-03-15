package com.example.fragments_v28

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragments_v28.databinding.ActivityMainBinding
import com.example.fragments_v28.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragment())
        }
        binding.btnExam.setOnClickListener {
            replaceFrameWithFragment(Exam_Fragment())
        }

        binding.btnValidate.setOnClickListener {
            replaceFrameWithFragment(LoginFragment())
        }
    }
    private fun replaceFrameWithFragment(frag: Fragment)
    {
        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.frameLayout,frag)
        fragTransaction.commit()
    }
}