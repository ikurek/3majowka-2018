package com.kapss.majowka2018.Agenda

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.kapss.majowka2018.Model.Event

class AgendaViewPagerAdapter(fragmentManager : FragmentManager,
                             private val listOfEvents: HashMap<Int, Array<Event>>) : FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return AgendaTabFragment.newInstance(listOfEvents[position]!!)

    }

    override fun getCount(): Int {
        return listOfEvents.size
    }

}