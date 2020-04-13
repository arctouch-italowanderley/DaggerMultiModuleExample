package irw.dagger.multi.module.example.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import irw.dagger.dep.di.CommonDependency2Module
import irw.dagger.dicore.BaseAppComponent
import irw.dagger.feature2.di.Feature2BindsModule
import javax.inject.Singleton

@Singleton
@Component(modules = [SubcomponentsModule::class, CommonDependency2Module::class, Feature2BindsModule::class])
interface AppComponent : BaseAppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}