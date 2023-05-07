package com.example.clase6_fragmentsbasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var floatingButton : FloatingActionButton
    private var isModeLight : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingButton = findViewById(R.id.floatingActionButton)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView1,BlankFragment()).commit()

        floatingButton.setOnClickListener {
            if(isModeLight){
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView1,BlankFragment()).commit()

            } else{
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView1,BlankFragment2()).commit()
            }

            isModeLight =! isModeLight

        }
    }
}