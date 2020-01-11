package com.kohutyan.gh_gitapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kohutyan.gh_gitapp.response.Item
import kotlinx.android.synthetic.main.search_row.view.*

class SearchAdapter(private val items: List<Item>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.search_row, parent, false)
        return ViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.name.text = items[position].toString()
        val item: Item = items[position]
        holder.bind(item)
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var repoName: TextView? = null
    private var repoScore: TextView? = null

    val name: TextView = view.repoName
    fun bind(item: Item) {
        repoName?.text = item.name
        repoScore?.text = item.score.toString()
    }
}