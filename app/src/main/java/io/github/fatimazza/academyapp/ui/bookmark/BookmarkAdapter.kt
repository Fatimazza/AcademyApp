package io.github.fatimazza.academyapp.ui.bookmark

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity

class BookmarkAdapter : RecyclerView.Adapter<BookmarkAdapter.BookmarkViewHolder>() {

    private var listCourse = arrayListOf<CourseEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_bookmark, parent, false)
        return BookmarkViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCourse.size
    }

    override fun onBindViewHolder(holder: BookmarkViewHolder, position: Int) {
        holder.bind(listCourse[position], position)
    }

    inner class BookmarkViewHolder(private val view:View): RecyclerView.ViewHolder(view) {

        fun bind(course: CourseEntity, position: Int) {

        }
    }
}
