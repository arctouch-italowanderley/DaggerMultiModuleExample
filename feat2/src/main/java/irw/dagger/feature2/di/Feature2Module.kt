package irw.dagger.feature2.di

import irw.dagger.feature2.deps.LocalDependency
import irw.dagger.feature2.deps.ScopedDependency
import irw.dagger.feature2.ui.Feature2Fragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val feature2Module = module {
    fragment { Feature2Fragment(get()) }

    scope<Feature2Fragment> {
        scoped { ScopedDependency() }
        factory { LocalDependency(get()) }
    }
}