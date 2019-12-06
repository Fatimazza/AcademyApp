package io.github.fatimazza.academyapp.ui.reader.content


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.ContentEntity
import kotlinx.android.synthetic.main.fragment_module_content.*

class ModuleContentFragment : Fragment() {

    private val webModuleContent: WebView
        get() = web_module_content

    private val pbModuleContent: ProgressBar
        get() = pb_module_content

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val entity =
            ContentEntity("<h3 class=\\\"fr-text-bordered\\\">Contoh Content</h3><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>")
        populateWebView(entity)
    }

    private fun populateWebView(content: ContentEntity) {
        webModuleContent.loadData(content.content,"text/html", "UTF-8")
    }
}
