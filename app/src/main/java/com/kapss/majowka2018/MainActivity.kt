package com.kapss.majowka2018

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.afollestad.materialdialogs.MaterialDialog
import com.kapss.majowka2018.Agenda.AgendaFragment
import com.kapss.majowka2018.Info.InfoFragment
import com.kapss.majowka2018.Search.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        // Set starting fragment
        swapFragment("AgendaFragment")
        nav_view.setCheckedItem(R.id.nav_agenda)
        supportActionBar!!.setTitle(R.string.agenda)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            showExitDialog()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_agenda -> {
                swapFragment("AgendaFragment")
            }
            R.id.nav_search -> {
                swapFragment("SearchFragment")
            }
            R.id.nav_info -> {
                swapFragment("InfoFragment")
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun swapFragment(tag: String) {

        when (tag) {
            "AgendaFragment" -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.content_main, AgendaFragment(), tag)
                        .commit()
                supportActionBar!!.setTitle(R.string.agenda)
            }
            "SearchFragment" -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.content_main, SearchFragment(), tag)
                        .commit()
                supportActionBar!!.setTitle(R.string.search)
            }
            "InfoFragment" -> {
                supportFragmentManager.beginTransaction()
                        .replace(R.id.content_main, InfoFragment(), tag)
                        .commit()
                supportActionBar!!.setTitle(R.string.informations)
            }
        }

    }

    private fun showExitDialog() {

        MaterialDialog.Builder(this)
                .title(getString(R.string.exit))
                .content(getString(R.string.exit_confirmation))
                .negativeText(getString(R.string.no))
                .onNegative { dialog, which -> dialog.dismiss() }
                .positiveText(getString(R.string.yes))
                .onPositive { dialog, which -> this.finishAffinity() }
                .show()
    }
}
