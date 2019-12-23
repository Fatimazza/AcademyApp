package io.github.fatimazza.academyapp.ui.reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.fatimazza.academyapp.R

class CourseReaderActivity : AppCompatActivity(), CourseReaderCallback {

    companion object {
        const val EXTRA_COURSE_ID = "extra_course_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_reader)
    }

    override fun moveTo(position: Int, moduleId: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
