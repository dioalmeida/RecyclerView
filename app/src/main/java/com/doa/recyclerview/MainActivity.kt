package com.doa.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.doa.recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView = findViewById(R.id.tv_text_view)
//        textView.text = Datasource().loadAffirmations().size.toString()

        val data = Datasource().loadAffirmations()
        val rv = findViewById<RecyclerView>(R.id.rv_affirmations)
        val adapter = ItemAdapter(this,data)
        rv.adapter = adapter

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        rv.setHasFixedSize(true)
    }
}