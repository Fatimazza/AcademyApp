package io.github.fatimazza.academyapp.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}
