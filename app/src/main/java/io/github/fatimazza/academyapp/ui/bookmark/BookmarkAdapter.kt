package io.github.fatimazza.academyapp.ui.bookmark

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity
import kotlinx.android.synthetic.main.item_list_bookmark.view.*

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

    fun getData(): List<CourseEntity> = listCourse

    fun setData(courseItems: List<CourseEntity>) {
        listCourse.clear()
        listCourse.addAll(courseItems)
    }

    inner class BookmarkViewHolder(private val view:View): RecyclerView.ViewHolder(view) {

        fun bind(course: CourseEntity, position: Int) {
            with(view) {
                tv_bookmark_title.text = course.title
                tv_bookmark_date.text = course.deadline
                tv_bookmark_description.text = course.description
                setOnClickListener {

                }
                iv_bookmark_share.setOnClickListener {

                }

                Glide.with(this.context)
                    .load(course.imagePath)
                    .apply(RequestOptions()
                        .placeholder(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(iv_bookmark_poster)
            }
        }
    }
}
