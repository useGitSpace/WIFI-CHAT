package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapp.ui.main.Model
import com.example.myapp.ui.main.MyAdapter

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_directmessage, R.id.navigation_globalmessage, R.id.navigation_ledger
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

//        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
//            if(position==0)
//            {
//                Toast.makeText(this@Main2Activity, "clicked on 1", Toast.LENGTH_LONG).show()
//            }
//            if(position==1)
//            {
//                Toast.makeText(this@Main2Activity, "clicked on 1", Toast.LENGTH_LONG).show()
//            }
//            if(position==2)
//            {
//                Toast.makeText(this@Main2Activity, "clicked on 1", Toast.LENGTH_LONG).show()
//            }
//            if(position==3)
//            {
//                Toast.makeText(this@Main2Activity, "clicked on 1", Toast.LENGTH_LONG).show()
//            }
//        }
    }
}
