package irw.dagger.multi.module.example

import android.app.Application
import irw.dagger.multi.module.example.di.AppComponent
import irw.dagger.multi.module.example.di.DaggerAppComponent

open class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}