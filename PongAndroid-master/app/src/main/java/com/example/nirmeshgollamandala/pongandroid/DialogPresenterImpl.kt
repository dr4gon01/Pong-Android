package com.example.nirmeshgollamandala.pongandroid

import android.app.Activity
import android.app.FragmentManager
import android.view.View

class DialogPresenter(var view: View, var activity: Activity) : DialogPresenterContract  {


    override fun onClickStart() {
        val fragManager : FragmentManager  = activity.fragmentManager
        val gameModeDialogFrag = GameModeDialogFragment()
        gameModeDialogFrag.show(fragManager, "gameModes")
    }
}