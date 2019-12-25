package io.github.fatimazza.academyapp.ui.reader.content


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.ContentEntity
import io.github.fatimazza.academyapp.data.ModuleEntity
import io.github.fatimazza.academyapp.ui.reader.CourseReaderViewModel
import kotlinx.android.synthetic.main.fragment_module_content.*

class ModuleContentFragment : Fragment() {

    companion object {
        val TAG = ModuleContentFragment::class.java.simpleName
    }

    private val webModuleContent: WebView
        get() = web_module_content

    private val pbModuleContent: ProgressBar
        get() = pb_module_content

    private lateinit var viewModel: CourseReaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initViewModel()
        // we can access this directly, without setting courseId & moduleId because:
        // courseId already set in Course Reader Activity
        // moduleId already set in Module List Fragment
        // using Shared View Model from requireActivity() instead of new VM (using this)
        val moduleEntity = viewModel.getSelectedModule()
        populateWebView(moduleEntity)
    }

    private fun initViewModel() {
        viewModel = ViewModelProviders.of(requireActivity()).get(CourseReaderViewModel::class.java)
    }

    private fun populateWebView(content: ModuleEntity?) {
        webModuleContent.loadData(content?.contentEntity?.content,"text/html", "UTF-8")
    }
}
