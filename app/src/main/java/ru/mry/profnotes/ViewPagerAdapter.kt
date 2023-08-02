package ru.mry.profnotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(
    private val item: List<Courses>
    ) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    private var inflater: LayoutInflater? = null

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view_pager_courses,
                parent,
                false))
    }

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.tv_number_page).text = item[position].id.toString()
        holder.view.findViewById<TextView>(R.id.tv_course_title).text = item[position].title
        holder.view.findViewById<TextView>(R.id.tv_label_1).text = item[position].label_1
        holder.view.findViewById<TextView>(R.id.tv_label_2).text = item[position].label_2
        holder.view.findViewById<TextView>(R.id.tv_label_3).text = item[position].label_3
        holder.view.findViewById<TextView>(R.id.tv_label_4).text = item[position].label_4
        holder.view.findViewById<TextView>(R.id.tv_label_5).text = item[position].label_5
    }
}