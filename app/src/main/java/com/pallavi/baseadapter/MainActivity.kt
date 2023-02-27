package com.pallavi.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.pallavi.baseadapter.model.UserModel

class MainActivity : AppCompatActivity(), listClick {
    lateinit var listView: ListView
    lateinit var userAdapter:UserAdapter
    var userlist=ArrayList<UserModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.listview)
        userAdapter= UserAdapter(userlist,this)
        userlist.add(UserModel("pallavi",2))
        userlist.add(UserModel("neha",3))

        listView.adapter=userAdapter
    }

    override fun deleteClick(position: Int) {
        System.out.println("in click delete ")

    }

    override fun editClick(position: Int) {
        System.out.println("in click edit ")
    }
}