package io.github.fatimazza.academyapp.ui.academy

import androidx.lifecycle.ViewModel
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourse(): List<CourseEntity> {
        return DataDummy.generateDummyCourses()
    }
    
}
