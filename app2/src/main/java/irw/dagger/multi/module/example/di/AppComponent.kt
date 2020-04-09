package irw.dagger.multi.module.example.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import irw.dagger.dep.di.CommonDependency2Module
import irw.dagger.feature2.di.Feature2Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SubcomponentsModule::class, CommonDependency2Module::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun feature2Component(): Feature2Component.Factory
}