package irw.dagger.feature2.di

import dagger.Module
import dagger.Provides
import irw.dagger.dep.CommonDependency
import irw.dagger.dep.CommonDependencyImpl1
import irw.dagger.dep.CommonDependencyImpl2
import irw.dagger.dep.DepType

@Module
class Feature2Module {

    @Provides
    fun providesDep2(depType: DepType): CommonDependency = when (depType) {
        DepType.DEP1 -> CommonDependencyImpl1()
        DepType.DEP2 -> CommonDependencyImpl2()
    }
}