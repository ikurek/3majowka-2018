package com.kapss.majowka2018.Agenda


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kapss.majowka2018.Model.EventUtils
import com.kapss.majowka2018.R
import kotlinx.android.synthetic.main.fragment_agenda.view.*


class AgendaFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_agenda, container, false)


        val pagerAdapter = AgendaViewPagerAdapter(fragmentManager!!, EventUtils.generateEventMap(context!!))
        view.viewpager_agenda.adapter = pagerAdapter


        view.tablayout_agenda.setupWithViewPager(view.viewpager_agenda)

        view.tablayout_agenda.getTabAt(0)!!.text = getString(R.string.tuesday)
        view.tablayout_agenda.getTabAt(1)!!.text = getString(R.string.wednesday)
        view.tablayout_agenda.getTabAt(2)!!.text = getString(R.string.friday)


        return view
    }


}
