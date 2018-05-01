package com.kapss.majowka2018.Agenda


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kapss.majowka2018.Model.Event
import com.kapss.majowka2018.R
import kotlinx.android.synthetic.main.fragment_agenda_tab.view.*


class AgendaTabFragment : Fragment() {

    lateinit var listOfEvents: Array<Event>

    companion object {
        fun newInstance(listOfEvents: Array<Event>): Fragment {
            val fragment = AgendaTabFragment()
            fragment.listOfEvents = listOfEvents
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_agenda_tab, container, false)
    }

    override fun onStart() {
        super.onStart()

        if (listOfEvents.isNotEmpty()) {
            bindRecyclerView(view!!)
        }
    }


    private fun bindRecyclerView(view : View) {
        view.recyclerview_agenda_tab.layoutManager = LinearLayoutManager(context)

        view.recyclerview_agenda_tab.addItemDecoration(DividerItemDecoration(view.recyclerview_agenda_tab.context, LinearLayoutManager.VERTICAL))

        view.recyclerview_agenda_tab.adapter = AgendaRecyclerViewAdapter(listOfEvents, false, context!!)
    }


}
