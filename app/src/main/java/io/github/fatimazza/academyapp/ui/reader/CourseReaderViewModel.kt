package io.github.fatimazza.academyapp.ui.reader

import androidx.lifecycle.ViewModel
import io.github.fatimazza.academyapp.data.ModuleEntity
import io.github.fatimazza.academyapp.utils.DataDummy
import io.github.fatimazza.academyapp.data.ContentEntity


class CourseReaderViewModel : ViewModel() {

    var courseId: String = ""

    var moduleId: String = ""

    fun getModule(): List<ModuleEntity> {
        return DataDummy.generateDummyModules(courseId)
    }

    fun getSelectedModule(): ModuleEntity? {
        var module: ModuleEntity? = null
        for (i in 0 until getModule().size) {
            if (getModule()[i].moduleId.equals(moduleId)) {
                module = getModule()[i]
                module.contentEntity =
                    ContentEntity("<h3 class=\\\"fr-text-bordered\\\">" + module.title + "</h3><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>")
                break
            }
        }
        return module
    }

}
