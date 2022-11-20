package com.packagesmaster.thememanager.app

import android.app.Application
import com.packagesmaster.sharedutils.SharedUtils

class AppController: Application() {

    override fun onCreate() {
        super.onCreate()
        SharedUtils(this)
    }

}