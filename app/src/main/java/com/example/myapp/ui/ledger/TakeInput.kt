package com.example.myapp.ui.ledger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapp.R
import kotlinx.android.synthetic.main.activity_take_input.*

class TakeInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_input)

        // Single checked box

    }

    fun onCheckboxClicked(view: View) {
        var checked = view as CheckBox

    }
    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }
//
//    fun onButtonClick(view: View) {
//        var location = text_location.text.toString()
//        var landmark = text_landmark.text.toString()
//        val mFragment = Fragment()
//        val mArgs = Bundle()
//        mArgs.putString("Location", location)
//        mFragment.setArguments(mArgs)
//

}
