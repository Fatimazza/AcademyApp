package io.github.fatimazza.academyapp.ui.detail

import androidx.lifecycle.ViewModel
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.data.ModuleEntity
import io.github.fatimazza.academyapp.utils.DataDummy


class DetailCourseViewModel : ViewModel() {

    var courseId: String = ""

    lateinit var courseEntity: CourseEntity

    fun getCourse(): CourseEntity {
        for (i in 0 until DataDummy.generateDummyCourses().size) {
            val courseEntity = DataDummy.generateDummyCourses()[i]
            if (courseEntity.courseId == courseId) {
                this.courseEntity = courseEntity
            }
        }
        return courseEntity
    }

    fun getModules(): List<ModuleEntity> {
        return DataDummy.generateDummyModules(courseId)
    }

}
