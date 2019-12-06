package io.github.fatimazza.academyapp.ui.detail

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.ui.reader.CourseReaderActivity
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

    private var courseId = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)

        setupActionBar()
        getIntentExtras()
        setupAdapter()
        showListModule()
    }

    private fun getIntentExtras() {
        val extras = intent.extras
        extras?.let {
            courseId = it.getString(EXTRA_COURSE) ?: ""
        }
    }

    private fun setupActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupAdapter() {
        detailCourseAdapter = DetailCourseAdapter()

        if (courseId.isNotEmpty()) {
            detailCourseAdapter.setData(DataDummy.generateDummyModules(courseId))
            populateCourse(courseId)
        }
    }

    private fun showListModule() {
        rvListModule.layoutManager = LinearLayoutManager(this)
        rvListModule.setHasFixedSize(true)
        rvListModule.adapter = detailCourseAdapter
    }

    private fun populateCourse(courseId: String) {
        val courseEntity: CourseEntity = DataDummy.getCourse(courseId) as CourseEntity
        tvModuleTitle.text = ""
        tvModuleDeadline.text = ""
        tvModuleDesc.text = ""

        Glide.with(this)
            .load(courseEntity.imagePath)
            .apply(RequestOptions()
                .placeholder(R.drawable.ic_loading)
                .error(R.drawable.ic_error))
            .into(ivModulePoster)

        btnModuleStart.setOnClickListener {
            val courseReaderIntent = Intent(this, CourseReaderActivity::class.java)
            courseReaderIntent.putExtra(CourseReaderActivity.EXTRA_COURSE_ID, courseId)
            startActivity(courseReaderIntent)
        }
    }
}
