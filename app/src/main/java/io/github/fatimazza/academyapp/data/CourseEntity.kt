package io.github.fatimazza.academyapp.data

data class CourseEntity (
    private val courseId: String = "",
    private val title: String = "",
    private val description: String = "",
    private val deadline: String = "",
    private val bookmarked: Boolean = false,
    private val imagePath: String = ""
)
