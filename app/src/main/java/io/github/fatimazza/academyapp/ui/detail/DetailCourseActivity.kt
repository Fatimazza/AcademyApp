package io.github.fatimazza.academyapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.fatimazza.academyapp.R

import kotlinx.android.synthetic.main.activity_detail_course.*

class DetailCourseActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)

        setupActionBar()
    }

    private fun setupActionBar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
