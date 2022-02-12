package com.example.pagerfrag

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class adaptadorFragmentViewPager(fa:FragmentActivity):FragmentStateAdapter(fa) {

    override fun getItemCount(): Int =3

    override fun createFragment(position: Int): Fragment {

        when(position){

            0->{
                val fragmento1=frA()
                return fragmento1
            }

            1->{
                val fragmento2=frB()
                return fragmento2
            }

            2->{
                val fragmento3=frC()
                return fragmento3
            }

        }

        return Fragment()

    }

}