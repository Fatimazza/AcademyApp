package io.github.fatimazza.academyapp.ui.bookmark

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Before
    fun setUp() {
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val bookmarkedCourseEntities = viewModel.getBookmarks()
        // make sure Bookmarked Course data not null
        assertNotNull(bookmarkedCourseEntities)
        // make sure total of Bookmarked Course data is as expected
        assertEquals(5, bookmarkedCourseEntities.size)
    }
}
