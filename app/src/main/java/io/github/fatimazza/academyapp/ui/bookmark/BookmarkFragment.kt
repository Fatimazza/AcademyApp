package io.github.fatimazza.academyapp.ui.bookmark


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity

class BookmarkFragment : Fragment(), BookmarkFragmentCallback {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onShareClick(course: CourseEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
