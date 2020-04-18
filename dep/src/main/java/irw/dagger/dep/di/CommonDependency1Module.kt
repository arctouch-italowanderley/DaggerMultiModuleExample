package irw.dagger.dep.di

import irw.dagger.dep.CommonDependency
import irw.dagger.dep.CommonDependencyImpl1
import org.koin.dsl.module

val commonDependency1Module = module {
    factory {
        @Suppress("USELESS_CAST")
        CommonDependencyImpl1() as CommonDependency
    }
}