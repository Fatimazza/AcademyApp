package io.github.fatimazza.academyapp.ui.academy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.utils.DataDummy
import kotlinx.android.synthetic.main.fragment_academy.*

class AcademyFragment : Fragment() {

    private val rvCourse: RecyclerView
        get() = rv_academy_list

    lateinit var academyAdapter: AcademyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academy, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupAdapter()
        showListCourse()
    }

    private fun setupAdapter() {
        academyAdapter = AcademyAdapter(requireActivity())
        academyAdapter.setData(DataDummy.generateDummyCourses())
    }

    private fun showListCourse() {
        rvCourse.layoutManager = LinearLayoutManager(requireContext())
        rvCourse.setHasFixedSize(true)
        rvCourse.adapter = academyAdapter
    }
}
