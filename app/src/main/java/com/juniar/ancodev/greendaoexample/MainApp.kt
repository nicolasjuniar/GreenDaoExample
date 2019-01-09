package com.juniar.ancodev.greendaoexample

import android.app.Application
import com.juniar.ancodev.greendaoexample.entity.DaoMaster
import com.juniar.ancodev.greendaoexample.entity.DaoSession

class MainApp : Application() {

    lateinit var daoSession: DaoSession

    override fun onCreate() {
        super.onCreate()
        daoSession = DaoMaster(
            DaoMaster.DevOpenHelper(
                this@MainApp,
                "example_db.db"
            ).writableDb
        ).newSession()
    }
}