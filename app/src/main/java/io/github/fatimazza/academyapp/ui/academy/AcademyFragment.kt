package io.github.fatimazza.academyapp.ui.academy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import io.github.fatimazza.academyapp.R
import kotlinx.android.synthetic.main.fragment_academy.*

class AcademyFragment : Fragment() {

    private val rvCourse: RecyclerView
        get() = rv_academy_list

    private lateinit var academyAdapter: AcademyAdapter

    private lateinit var academyViewModel: AcademyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academy, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initViewModel()
        setupAdapter()
        showListCourse()
    }

    private fun initViewModel() {
        academyViewModel = ViewModelProviders.of(this).get(AcademyViewModel::class.java)
    }

    private fun setupAdapter() {
        academyAdapter = AcademyAdapter(requireActivity())
        academyAdapter.setData(academyViewModel.getCourse())
    }

    private fun showListCourse() {
        rvCourse.layoutManager = LinearLayoutManager(requireContext())
        rvCourse.setHasFixedSize(true)
        rvCourse.adapter = academyAdapter
    }
}
