package io.github.fatimazza.academyapp.ui.reader.list


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView

import io.github.fatimazza.academyapp.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager

import io.github.fatimazza.academyapp.data.ModuleEntity
import io.github.fatimazza.academyapp.ui.reader.CourseReaderActivity
import io.github.fatimazza.academyapp.ui.reader.CourseReaderCallback
import io.github.fatimazza.academyapp.ui.reader.CourseReaderViewModel
import io.github.fatimazza.academyapp.utils.DataDummy
import kotlinx.android.synthetic.main.fragment_module_list.*

class ModuleListFragment : Fragment(), ModuleListAdapter.OnItemClickCallback {

    companion object {
        val TAG = ModuleListFragment::class.java.simpleName
    }

    private val progressModuleList: ProgressBar
        get() = pb_module_list

    private val rvModuleList: RecyclerView
        get() = rv_module_list

    private lateinit var moduleListAdapter: ModuleListAdapter

    private lateinit var courseReaderCallback: CourseReaderCallback

    private lateinit var viewModel: CourseReaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViewModel()
        moduleListAdapter = ModuleListAdapter()
        populateRecyclerView(viewModel.getModule())
    }

    private fun initViewModel() {
        viewModel = ViewModelProviders.of(requireActivity()).get(CourseReaderViewModel::class.java)
    }

    private fun populateRecyclerView(modules: ArrayList<ModuleEntity>) {
        progressModuleList.visibility = View.GONE
        moduleListAdapter.setData(modules)

        rvModuleList.layoutManager = LinearLayoutManager(requireContext())
        rvModuleList.setHasFixedSize(true)
        rvModuleList.adapter = moduleListAdapter

        val dividerItemDecoration = DividerItemDecoration(rvModuleList.context, DividerItemDecoration.VERTICAL)
        rvModuleList.addItemDecoration(dividerItemDecoration)

        moduleListAdapter.setOnItemClickCallback(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        courseReaderCallback = context as CourseReaderActivity
    }

    override fun onItemClicked(position: Int, moduleId: String) {
        courseReaderCallback.moveTo(position, moduleId)
        viewModel.moduleId = moduleId
    }
}
