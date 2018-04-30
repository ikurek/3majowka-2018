package com.kapss.majowka2018.Agenda

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kapss.majowka2018.Model.Event
import com.kapss.majowka2018.R
import kotlinx.android.synthetic.main.event_row.view.*

class AgendaRecyclerViewAdapter(val listOfEvents: Array<Event>,
                                val showDay: Boolean,
                                val context: Context) : RecyclerView.Adapter<EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.event_row, parent, false)

        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfEvents.size
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {

        holder.bind(listOfEvents[position], showDay)
    }

}

class EventViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    fun bind(event: Event, showDay: Boolean) = with(itemView) {
        title_event_row.text = event.name
        if(showDay) {
            val date = "${event.day}, ${event.time}"
            time_event_row.text = date
        } else {
            time_event_row.text = event.time
        }
        location_event_row.text = event.location
        type_event_row.text = event.type
    }
}