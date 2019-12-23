package io.github.fatimazza.academyapp.ui.reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.ui.reader.content.ModuleContentFragment

class CourseReaderActivity : AppCompatActivity(), CourseReaderCallback {

    companion object {
        const val EXTRA_COURSE_ID = "extra_course_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_reader)
    }

    override fun moveTo(position: Int, moduleId: String) {
        val fragment: Fragment = ModuleContentFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.frame_container, fragment, ModuleContentFragment.TAG)
            .addToBackStack(null)
            .commit()
    }
}
