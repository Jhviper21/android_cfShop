package com.example.finalspicyfood.mui.orderdetails

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class OrderDetailsPagerAdapter(fragmentManager: FragmentManager, val lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 ->
                OrderStatusFragment();

            else -> {

                OrderDetailsTabFragment()
            }
        }
    }
}
