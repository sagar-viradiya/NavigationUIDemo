package com.example.sagar.navigationuidemo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 * Use the [BottomNavFragmentTwo.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class BottomNavFragmentTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_nav_fragment_two, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment BottomNavFragmentTwo.
         */
        @JvmStatic
        fun newInstance() = BottomNavFragmentTwo()
    }
}
