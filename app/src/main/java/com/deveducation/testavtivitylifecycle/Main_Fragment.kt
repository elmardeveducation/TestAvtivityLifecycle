package com.deveducation.testavtivitylifecycle


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main_.*

/**
 * A simple [Fragment] subclass.
 */
class Main_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Mynewbutton.setOnClickListener{it: View? ->  test()}
    }

    fun test(){
        Log.d("fragment","Cliecked Fragmentbutton")
    }
}
