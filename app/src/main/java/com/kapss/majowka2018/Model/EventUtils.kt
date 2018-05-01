package com.kapss.majowka2018.Model

import android.content.Context
import com.kapss.majowka2018.R

object EventUtils {

    fun generateEventMap(context: Context) : HashMap<Int, Array<Event>> {

        val events0 = arrayOf(
                Event("Bicie Gitarowego Rekordu Guinnessa 2018", context.getString(R.string.city_center), "10:00 - 16:00", context.getString(R.string.event), context.getString(R.string.tuesday)),
                Event("Otwarcie kas i punktów wymiany biletów na opaski", context.getString(R.string.centennial_hall), "15:30", context.getString(R.string.event), context.getString(R.string.tuesday)),
                Event("Otwarcie wejść na teren imprezy", context.getString(R.string.centennial_hall), "16:00", context.getString(R.string.event), context.getString(R.string.tuesday)),
                Event("Perfect", context.getString(R.string.pergola), "17:00", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("Sinfonity", context.getString(R.string.centennial_hall), "18:15", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("Hunter", context.getString(R.string.pergola), "19:00", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("Lao Che", context.getString(R.string.centennial_hall), "20:00", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("The Dead Daisies", context.getString(R.string.pergola), "21:00", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("Kreator", context.getString(R.string.centennial_hall), "22:30", context.getString(R.string.concert), context.getString(R.string.tuesday)),
                Event("Planowany koniec imprezy", context.getString(R.string.centennial_hall), "00:00", context.getString(R.string.event), context.getString(R.string.tuesday))
        )

        val events1 = arrayOf(
                Event("Otwarcie kas i punktów wymiany biletów na opaski", context.getString(R.string.centennial_hall), "13.00", context.getString(R.string.event), context.getString(R.string.wednesday)),
                Event("Wejście alpinistów z flagą Polski na Iglicę", context.getString(R.string.centennial_hall), "13:30", context.getString(R.string.event), context.getString(R.string.wednesday)),
                Event("Otwarcie wejść na teren imprezy", context.getString(R.string.centennial_hall), "14:00", context.getString(R.string.event), context.getString(R.string.wednesday)),
                Event("Jelonek", context.getString(R.string.pergola), "15:00", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Me And That Man", context.getString(R.string.centennial_hall), "15:30", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Coma", context.getString(R.string.pergola), "16:40", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Krzysztof Zalewski", context.getString(R.string.centennial_hall), "17:00", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Vader", context.getString(R.string.pergola), "18:15", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Miuosh", context.getString(R.string.centennial_hall), "18:30", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Pidżama Porno", context.getString(R.string.pergola), "19:45", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Ayo", context.getString(R.string.centennial_hall), "20:00", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Nocny Kochanek", context.getString(R.string.pergola), "21:30", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Bass Astral x Igo", context.getString(R.string.centennial_hall), "21:30", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Organek", context.getString(R.string.centennial_hall), "23:00", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Bokka", context.getString(R.string.centennial_hall), "00:30", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("OSTR", context.getString(R.string.centennial_hall), "01:45", context.getString(R.string.concert), context.getString(R.string.wednesday)),
                Event("Planowany koniec imprezy", context.getString(R.string.centennial_hall), "03:00", context.getString(R.string.event), context.getString(R.string.wednesday))
        )

        val events2 = arrayOf(
                Event("Otwarcie kas i punktów wymiany biletów na opaski", context.getString(R.string.centennial_hall), "13.00", context.getString(R.string.event), context.getString(R.string.friday)),
                Event("Otwarcie wejść na teren imprezy", context.getString(R.string.centennial_hall), "14:00", context.getString(R.string.event), context.getString(R.string.friday)),
                Event("Laureat Promo Festival", context.getString(R.string.pergola), "15:00", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Grubson", context.getString(R.string.pergola), "15:40", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Percival \"Wild Hunt Live\"", context.getString(R.string.centennial_hall), "16:00", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Happysad", context.getString(R.string.pergola), "17:20", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Ralph Kaminski", context.getString(R.string.centennial_hall), "17:45", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Dubioza", context.getString(R.string.pergola), "19:00", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Mikromusic", context.getString(R.string.centennial_hall), "19:15", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Kortez", context.getString(R.string.centennial_hall), "20:50", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Kult", context.getString(R.string.pergola), "21:00", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Waglewski/Fisz/Emade", context.getString(R.string.centennial_hall), "22:30", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("The Dumplings", context.getString(R.string.centennial_hall), "00:00", context.getString(R.string.concert), context.getString(R.string.friday)),
                Event("Planowany koniec imprezy", context.getString(R.string.centennial_hall), "01:30", context.getString(R.string.event), context.getString(R.string.friday))
        )

        val map = hashMapOf<Int, Array<Event>>()
        map[0] = events0
        map[1] = events1
        map[2] = events2

        return map
    }

    fun generateEventList(context: Context): Array<Event> {

        var array: Array<Event> = arrayOf()

        generateEventMap(context).forEach {
            array += it.value
        }

        array.sortBy { it.name }

        return array
    }

}