package com.kapss.majowka2018.Search


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kapss.majowka2018.Agenda.AgendaRecyclerViewAdapter
import com.kapss.majowka2018.Model.Event
import com.kapss.majowka2018.Model.EventUtils

import com.kapss.majowka2018.R
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.view.*


class SearchFragment : Fragment() {

    lateinit var listOfEvents: Array<Event>
    lateinit var filteredListOfEvents: Array<Event>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_search, container, false)

        // Get events to local variable
        listOfEvents = EventUtils.generateEventList(context!!)

        bindRecyclerView(view)
        bindSearchBar(view)

        return view
    }


    private fun bindRecyclerView(view : View) {
        view.recyclerview_search_fragment.layoutManager = LinearLayoutManager(context)

        view.recyclerview_search_fragment.addItemDecoration(DividerItemDecoration(view.recyclerview_search_fragment.context, LinearLayoutManager.VERTICAL))

        view.recyclerview_search_fragment.adapter = AgendaRecyclerViewAdapter(listOfEvents, true, context!!)

    }

    private fun bindSearchBar(view: View) {
        view.searchbar_search_fragment.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Set full list if search bar is empty
                // Else set filtered one
                if (s.isNullOrBlank()) {

                    view.recyclerview_search_fragment.adapter = AgendaRecyclerViewAdapter(listOfEvents, true, context!!)

                } else {

                    filteredListOfEvents = listOfEvents.filter {
                        it.name.contains(s!!, true) ||
                        it.type.contains(s!!, true) ||
                        it.location.contains(s!!, true) ||
                        it.time.contains(s!!, true) ||
                        it.day.contains(s!!, true)
                    }.toTypedArray()

                    view.recyclerview_search_fragment.adapter = AgendaRecyclerViewAdapter(filteredListOfEvents, true, context!!)
                }
            }
        })
    }
}
