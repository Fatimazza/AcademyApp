package io.github.fatimazza.academyapp.ui.reader.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.ModuleEntity

class ModuleListAdapter: RecyclerView.Adapter<ModuleListAdapter.ModuleListViewHolder>() {

    private var listModule = arrayListOf<ModuleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_module_custom, parent, false)
        return ModuleListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listModule.size
    }

    override fun onBindViewHolder(holder: ModuleListViewHolder, position: Int) {
        holder.bind(listModule[position])
    }

    inner class ModuleListViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        fun bind(module: ModuleEntity) {
            
        }
    }
}
