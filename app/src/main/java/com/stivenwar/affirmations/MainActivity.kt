    package com.stivenwar.affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.stivenwar.affirmations.adapter.ItemAdapter
import com.stivenwar.affirmations.data.DataSource
import com.stivenwar.affirmations.databinding.ActivityMainBinding


    class MainActivity : ComponentActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource().loadAffirmations()
        val recyclerView = binding.reciclerView
        recyclerView.adapter = ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)
    }
}
