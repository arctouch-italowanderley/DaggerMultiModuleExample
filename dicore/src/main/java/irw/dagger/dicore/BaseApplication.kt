package irw.dagger.dicore

import android.app.Application

abstract class BaseApplication<T: BaseAppComponent>: Application() {
    val appComponent: T by lazy { initializeComponent() }

    abstract fun initializeComponent(): T

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(appComponent.fragmentFactoryActivityCallback)
    }
}