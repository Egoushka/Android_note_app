package com.languagexx.simplenotes.ui

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.languagexx.simplenotes.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {

    lateinit var navController: NavController

    // Method #1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = findNavController(R.id.container)


        //Floating action button will redirect to Add New Notes Fragment #AddFragment
        add_new_note.setOnClickListener {
            onFloatingClicked()
        }
    }

    // Method #2
    private fun onFloatingClicked() {
        navController.navigate(R.id.action_listFragment_to_addFragment)
        add_new_note.hide()
    }

    // Method #3
    fun showFloatingButton(){
        add_new_note.show()
        add_new_note.visibility = View.VISIBLE
    }
}