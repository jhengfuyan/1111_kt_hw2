package com.example.lab5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            Log.e("ThirdFragment","onCreate")
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("ThirdFragment","onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("ThirdFragment", "onActivityCreated")
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    override fun onStart () {
        super.onStart()
        Log.e("ThirdFragment","onStart")
    }
    override fun onResume () {
        super.onResume()
        Log.e("ThirdFragment", "onResume")
    }
    override fun onPause () {
        super.onPause()
        Log.e("ThirdFragment", "onPause")
    }
    override fun onStop () {
        super.onStop()
        Log.e("ThirdFragment", "onStop")
    }
    override fun onDestroyView () {
        super.onDestroyView()
        Log.e("ThirdFragment", "onDestroyView")
    }
    override fun onDestroy () {
        super.onDestroy()
        Log.e("ThirdFragment", "onDestroy")
    }
    override fun onDetach () {
        super.onDetach()
        Log.e("ThirdFragment", "onDetach")
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ThirdFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}