package io.github.fatimazza.academyapp.ui.bookmark


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat

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
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(requireActivity())
            .setType(mimeType)
            .setChooserTitle("Bagikan aplikasi ini sekarang")
            .setText(String.format("Segera daftar kelas %s di dicoding.com", course.title))
            .startChooser()
    }

}
