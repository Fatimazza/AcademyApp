package io.github.fatimazza.academyapp.ui.detail

import io.github.fatimazza.academyapp.data.CourseEntity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailCourseViewModelTest {

    private lateinit var viewModel: DetailCourseViewModel

    private lateinit var dummyCourse: CourseEntity

    @Before
    fun setUp() {
        viewModel = DetailCourseViewModel()
        dummyCourse = CourseEntity(
            "a14",
            "Menjadi Android Developer Expert",
            "Dicoding sebagai satu-satunya Google Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini. Peserta akan belajar membangun aplikasi Android dengan materi Testing, Debugging, Application, Application UX, Fundamental Application Components, Persistent Data Storage, dan Enhanced System Integration.",
            "100 Hari",
            false,
            "https://www.dicoding.com/images/small/academy/menjadi_android_developer_expert_logo_070119140352.jpg"
        )
    }

    @Test
    fun getCourse() {
    }

    @Test
    fun getModules() {
        val moduleEntities = viewModel.getModules()
        // make sure Module data not null
        assertNotNull(moduleEntities)
        // make sure total of Module data is as expected
        assertEquals(7, moduleEntities.size)
    }
}
