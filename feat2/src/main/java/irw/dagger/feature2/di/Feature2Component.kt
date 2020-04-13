package irw.dagger.feature2.di

import dagger.Subcomponent
import irw.dagger.feature2.di.scope.Feature2Scope
import irw.dagger.feature2.ui.Feature2Fragment

@Feature2Scope
@Subcomponent()
interface Feature2Component {

    @Subcomponent.Factory
    interface Factory {
        fun create(): Feature2Component
    }

    val fragment: Feature2Fragment
}