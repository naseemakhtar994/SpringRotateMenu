package com.southernbox.springrotatemenu.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.southernbox.springrotatemenu.R

/**
 * Created by SouthernBox on 2017/4/11 0011.
 * 兰尼斯特家族
 */

class LannisterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_lannister, container, false)
    }
}