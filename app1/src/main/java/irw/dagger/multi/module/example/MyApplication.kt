package irw.dagger.multi.module.example

import android.app.Application
import irw.dagger.dep.DepType
import irw.dagger.feature2.di.Feature2Component
import irw.dagger.feature2.di.Feature2ComponentProvider
import irw.dagger.multi.module.example.di.AppComponent
import irw.dagger.multi.module.example.di.DaggerAppComponent

open class MyApplication : Application(), Feature2ComponentProvider {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }

    override fun provideFeature2Component(): Feature2Component =
        appComponent.feature2Component().create(DepType.DEP1)
}