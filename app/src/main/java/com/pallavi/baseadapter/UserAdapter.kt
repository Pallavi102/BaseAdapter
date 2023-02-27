package com.pallavi.baseadapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.pallavi.baseadapter.model.UserModel

class UserAdapter(var userlist:ArrayList<UserModel>, var listClick: listClick): BaseAdapter() {
    override fun getCount(): Int {
        return userlist.size
    }

    override fun getItem(p0: Int): Any {
 return 1
    }

    override fun getItemId(p0: Int): Long {
return 1
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(position:Int, view:View?, parent:ViewGroup?):View {


        val view = LayoutInflater.from(parent?.context).inflate(R.layout.userfile, parent, false)
        val tvname = view.findViewById<TextView>(R.id.tvname)
        val tvclass = view.findViewById<TextView>(R.id.tvclass)
        val btnDelete = view.findViewById<Button>(R.id.btnDelete)
        val btnEdit=view.findViewById<Button>(R.id.btnEdit)

        tvname.text = userlist[position].name
        tvclass.text = userlist[position].sclass.toString()

        btnDelete.setOnClickListener {
            listClick.deleteClick(position)

            if(tvname.text.isNotEmpty())
            {


            }
           else
            {
                tvname.error="null"
            }
        }

        btnEdit.setOnClickListener {
            listClick.editClick(position)
        }
        return view


    }

}