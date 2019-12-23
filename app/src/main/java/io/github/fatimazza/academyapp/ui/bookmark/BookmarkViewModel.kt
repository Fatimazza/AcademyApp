package io.github.fatimazza.academyapp.ui.bookmark

import androidx.lifecycle.ViewModel
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> {
        return DataDummy.generateDummyCourses()
    }

}
