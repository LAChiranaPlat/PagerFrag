package com.example.pagerfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val paneles=findViewById<ViewPager2>(R.id.views)
        val tabs=findViewById<TabLayout>(R.id.tab)

        val adaptador=adaptadorFragmentViewPager(this)

        paneles.adapter=adaptador

        val manager=TabLayoutMediator(tabs,paneles,TabLayoutMediator.TabConfigurationStrategy { tab, position ->

            when(position){
                0->tab.text="Nuevo Post"
                1->tab.text="Publicaciones"
                2->tab.text="Guardados"

            }

        })

        manager.attach()


    }
}