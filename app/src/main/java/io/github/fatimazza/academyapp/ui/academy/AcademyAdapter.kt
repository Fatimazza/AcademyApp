package io.github.fatimazza.academyapp.ui.academy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.ui.academy.AcademyAdapter.AcademyViewHolder

class AcademyAdapter(val listCourse: ArrayList<CourseEntity>): RecyclerView.Adapter<AcademyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AcademyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_academy, parent, false)
        return AcademyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCourse.size
    }

    override fun onBindViewHolder(holder: AcademyViewHolder, position: Int) {
        holder.bind(listCourse[position], position)
    }

    inner class AcademyViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        fun bind(course: CourseEntity, position: Int) {

        }
    }
}
