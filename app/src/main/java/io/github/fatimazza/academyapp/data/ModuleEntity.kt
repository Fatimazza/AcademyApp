package io.github.fatimazza.academyapp.data

data class ModuleEntity (
    var contentEntity: ContentEntity? = null,
    val moduleId: String = "",
    val courseId: String = "",
    val title: String = "",
    val position: Int = 0,
    val read: Boolean? = false
)
