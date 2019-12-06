package io.github.fatimazza.academyapp.ui.reader.content


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.webkit.WebView
import android.widget.ProgressBar
import io.github.fatimazza.academyapp.R

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

}
