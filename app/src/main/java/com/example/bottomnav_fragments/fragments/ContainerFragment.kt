package com.example.bottomnav_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnav_fragments.R
import kotlinx.android.synthetic.main.fragment_container.view.*


class ContainerFragment : Fragment() {

    private val startFragment = StartFragment()
    private val oneFragment = OneFragment()
    private val secondFragment = SecondFragment()
    private val thirdFragment = ThirdFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_container, container, false)

        //Sets the Default Fragment on Launch
        replaceFragment(oneFragment)
        view.bottom_nav.selectedItemId = R.id.oneFragment
        view.bottom_nav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.oneFragment -> replaceFragment(oneFragment)
                R.id.secondFragment -> replaceFragment(secondFragment)
                R.id.thirdFragment -> replaceFragment(thirdFragment)
            }
            true
        }


    return view
    }

    //Call the parentFragmentManager, so a transaction can occur
    private fun replaceFragment(fragment : Fragment) {

        val transaction = parentFragmentManager
        transaction.beginTransaction().replace(
            R.id.fragment_container,
            fragment
        ).commit()
    }

}