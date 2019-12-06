package io.github.fatimazza.academyapp.ui.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.ModuleEntity

class DetailCourseAdapter: RecyclerView.Adapter<DetailCourseAdapter.DetailCourseViewHolder>() {

    private var listModule = arrayListOf<ModuleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailCourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_module, parent, false)
        return DetailCourseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listModule.size
    }

    override fun onBindViewHolder(holder: DetailCourseViewHolder, position: Int) {
        holder.bind(listModule[position], position)
    }

    inner class DetailCourseViewHolder(private val view: View)
        : RecyclerView.ViewHolder(view) {

        fun bind(module: ModuleEntity, position: Int) {
            
        }
    }
}
