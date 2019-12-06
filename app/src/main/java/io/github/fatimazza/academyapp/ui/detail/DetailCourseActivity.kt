package io.github.fatimazza.academyapp.ui.detail

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.utils.DataDummy

import kotlinx.android.synthetic.main.activity_detail_course.*
import kotlinx.android.synthetic.main.content_detail_course.*

class DetailCourseActivity : AppCompatActivity() {

    private val rvListModule: RecyclerView
        get() = rv_detail_list_module

    private val tvModuleTitle: TextView
        get() = tv_detail_title

    private val tvModuleDeadline: TextView
        get() = tv_detail_date

    private val tvModuleDesc: TextView
        get() = tv_detail_description

    private val ivModulePoster: ImageView
        get() = iv_detail_image_poster

    private val btnModuleStart: Button
        get() = btn_detail_start

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    private lateinit var detailCourseAdapter: DetailCourseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)

        setupActionBar()
        setupAdapter()
        showListModule()
    }

    private fun setupActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupAdapter() {
        detailCourseAdapter = DetailCourseAdapter()
        detailCourseAdapter.setData(DataDummy.generateDummyModules("1"))
    }

    private fun showListModule() {
        rvListModule.layoutManager = LinearLayoutManager(this)
        rvListModule.setHasFixedSize(true)
        rvListModule.adapter = detailCourseAdapter
    }
}
