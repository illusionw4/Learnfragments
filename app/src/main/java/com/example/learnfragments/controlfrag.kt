package com.example.learnfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnfragments.Fragments.tryfrags

class controlfrag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_controlfrag)

        val tryfrag = tryfrags()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framefrag, tryfrag)
            commit()
        }
    }
}