package com.example.myapp.ui.ledger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapp.R
import com.example.myapp.ui.main.Model
import com.example.myapp.ui.main.MyAdapter

class LedgerFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ledger, container, false)
        var listView = root.findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("BadBOi", "Hello", R.drawable.btn_rounded))
        list.add(Model("BadBOi1", "Hello!", R.drawable.btn_rounded))
        list.add(Model("BadBOi2", "Hello!!", R.drawable.btn_rounded))
      //  list.add(Model("BadBOi3", "Hello!!!", R.drawable.btn_rounded))

        listView.adapter = MyAdapter(root.context, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->
            if(position==0)
            {
              //  Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
                list.add(Model("new", "new", R.drawable.btn_rounded))
                listView.adapter = MyAdapter(root.context, R.layout.row, list)
            }
            if(position==1)
            {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
            if(position==2)
            {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
            if(position==3)
            {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
        }
        return root
    }


}
