package irw.dagger.multi.module.example

import irw.dagger.dicore.BaseApplication
import irw.dagger.multi.module.example.di.AppComponent
import irw.dagger.multi.module.example.di.DaggerAppComponent

open class MyApplication : BaseApplication<AppComponent>() {

    override fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }
}