package com.example.ratemyminis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var miniatureAdapter: MiniatureAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val miniatures = listOf("Miniature 1", "Miniature 2", "Miniature 3") // Placeholder data
        miniatureAdapter = MiniatureAdapter(miniatures)
        recyclerView.adapter = miniatureAdapter
    }
}