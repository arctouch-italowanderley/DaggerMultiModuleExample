package irw.dagger.dep.di

import irw.dagger.dep.CommonDependency
import irw.dagger.dep.CommonDependencyImpl2
import org.koin.dsl.module

val commonDependency2Module = module {
    factory {
        @Suppress("USELESS_CAST")
        CommonDependencyImpl2() as CommonDependency
    }
}