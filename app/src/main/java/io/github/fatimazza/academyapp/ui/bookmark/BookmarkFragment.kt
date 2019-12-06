package io.github.fatimazza.academyapp.ui.bookmark


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.utils.DataDummy
import kotlinx.android.synthetic.main.fragment_bookmark.*

class BookmarkFragment : Fragment(), BookmarkFragmentCallback {

    private val rvBookmarkedCourse: RecyclerView
        get() = rv_bookmark_list

    lateinit var bookmarkAdapter: BookmarkAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setupAdapter()
        showListBookmarkedCourse()
    }

    private fun setupAdapter() {
        bookmarkAdapter = BookmarkAdapter(requireActivity(), this)
        bookmarkAdapter.setData(DataDummy.generateDummyCourses())
    }

    private fun showListBookmarkedCourse() {
        rvBookmarkedCourse.layoutManager = LinearLayoutManager(requireContext())
        rvBookmarkedCourse.setHasFixedSize(true)
        rvBookmarkedCourse.adapter = bookmarkAdapter
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
