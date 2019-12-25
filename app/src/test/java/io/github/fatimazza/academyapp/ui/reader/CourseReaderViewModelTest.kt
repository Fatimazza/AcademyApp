package io.github.fatimazza.academyapp.ui.reader

import io.github.fatimazza.academyapp.data.ContentEntity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CourseReaderViewModelTest {

    private lateinit var viewModel: CourseReaderViewModel

    private lateinit var dummyContentEntities: ContentEntity

    private lateinit var moduleId: String

    @Before
    fun setUp() {
        viewModel = CourseReaderViewModel()
        viewModel.courseId = "a14"
        moduleId = "a14m1"

        val title = viewModel.getModule()[0].title
        dummyContentEntities = ContentEntity("<h3 class=\\\"fr-text-bordered\\\">" + title + "</h3><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>")
    }

    @Test
    fun getModule() {
    }

    @Test
    fun getSelectedModule() {
    }
}
