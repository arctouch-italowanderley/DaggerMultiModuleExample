package irw.dagger.dicore

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import org.koin.core.module.Module

abstract class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            fragmentFactory()

            modules(modules)
        }

        registerActivityLifecycleCallbacks(FragmentFactoryActivityCallback())
    }

    protected abstract val modules: List<Module>
}