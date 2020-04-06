package irw.dagger.feature2.di

import dagger.BindsInstance
import dagger.Subcomponent
import irw.dagger.dep.DepType
import irw.dagger.feature2.di.scope.Feature2Scope
import irw.dagger.feature2.ui.Feature2Fragment

@Feature2Scope
@Subcomponent(modules = [Feature2Module::class])
interface Feature2Component {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance depType: DepType): Feature2Component
    }

    fun inject(fragment: Feature2Fragment)
}