package io.github.fatimazza.academyapp.ui.academy

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class AcademyViewModelTest {

    private lateinit var viewModel: AcademyViewModel

    @Before
    fun setUp() {
        viewModel = AcademyViewModel()
    }

    @Test
    fun getCourse() {
        val courseEntities = viewModel.getCourse()
        // make sure Course data not null
        assertNotNull(courseEntities)
        // make sure total of Course data is as expected
        assertEquals(5, courseEntities.size)
    }
}
