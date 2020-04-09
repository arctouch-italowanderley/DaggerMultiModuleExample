package irw.dagger.dep.di

import dagger.Module
import dagger.Provides
import irw.dagger.dep.CommonDependency
import irw.dagger.dep.CommonDependencyImpl1

@Module
class CommonDependency1Module {

    @Provides
    fun providesDep(): CommonDependency = CommonDependencyImpl1()
}