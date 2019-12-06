package io.github.fatimazza.academyapp.ui.bookmark

import io.github.fatimazza.academyapp.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
