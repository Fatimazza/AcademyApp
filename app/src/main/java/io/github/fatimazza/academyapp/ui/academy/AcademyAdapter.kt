package io.github.fatimazza.academyapp.ui.academy

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import io.github.fatimazza.academyapp.R
import io.github.fatimazza.academyapp.data.CourseEntity
import io.github.fatimazza.academyapp.ui.academy.AcademyAdapter.AcademyViewHolder
import io.github.fatimazza.academyapp.ui.detail.DetailCourseActivity
import kotlinx.android.synthetic.main.item_list_academy.view.*

class AcademyAdapter(val activity: Activity): RecyclerView.Adapter<AcademyViewHolder>() {

    private var listCourse = arrayListOf<CourseEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AcademyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_academy, parent, false)
        return AcademyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCourse.size
    }

    override fun onBindViewHolder(holder: AcademyViewHolder, position: Int) {
        holder.bind(listCourse[position])
    }

    fun getData(): List<CourseEntity> = listCourse

    fun setData(courseItems: List<CourseEntity>) {
        listCourse.clear()
        listCourse.addAll(courseItems)
    }

    inner class AcademyViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        fun bind(course: CourseEntity) {
            with(view) {
                tv_course_title.text = course.title
                tv_course_description.text = course.description
                tv_course_date.text = String.format("Deadline %s", course.deadline)
                setOnClickListener {
                    val detailCourseIntent = Intent(activity, DetailCourseActivity::class.java)
                    detailCourseIntent.putExtra(DetailCourseActivity.EXTRA_COURSE, course.courseId)
                    activity.startActivity(detailCourseIntent)
                }

                Glide.with(this.context)
                    .load(course.imagePath)
                    .apply(RequestOptions()
                        .placeholder(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(iv_course_poster)
            }
        }
    }
}
