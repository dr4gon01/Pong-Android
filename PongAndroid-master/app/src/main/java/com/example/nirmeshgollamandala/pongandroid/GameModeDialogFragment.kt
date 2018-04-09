package com.example.nirmeshgollamandala.pongandroid

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.util.Log

class GameModeDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
         val builder  = AlertDialog.Builder(activity)
        builder.setTitle(R.string.pick_game_mode).setItems(R.array.game_mode_list, { _, i ->
            when(i){
                0 -> Log.i("some", "0")
                1 -> Log.i("some", "1")
                2 -> Log.i("some", "2")
            }
        })
        return builder.show()

    }


}