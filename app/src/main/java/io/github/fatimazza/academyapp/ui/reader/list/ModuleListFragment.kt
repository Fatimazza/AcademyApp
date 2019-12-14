package io.github.fatimazza.academyapp.ui.reader.list


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView

import io.github.fatimazza.academyapp.R
import kotlinx.android.synthetic.main.fragment_module_list.*

class ModuleListFragment : Fragment() {

    private val progressModuleList: ProgressBar
        get() = pb_module_list

    private val rvModuleList: RecyclerView
        get() = rv_module_list
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module_list, container, false)
    }
    
}
