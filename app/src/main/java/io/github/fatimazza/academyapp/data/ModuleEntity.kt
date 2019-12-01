package io.github.fatimazza.academyapp.data

data class ModuleEntity (
    val contentEntity: ContentEntity? = null,
    private val mModuleId: String = "",
    private val mCourseId: String = "",
    private val mTitle: String = "",
    private val mPosition: Int = 0,
    private val mRead: Boolean? = false
)
