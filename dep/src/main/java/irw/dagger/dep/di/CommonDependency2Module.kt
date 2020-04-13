package irw.dagger.dep.di

import dagger.Module
import dagger.Provides
import irw.dagger.dep.CommonDependency
import irw.dagger.dep.CommonDependencyImpl2

@Module
class CommonDependency2Module {

    @Provides
    fun providesDep(): CommonDependency = CommonDependencyImpl2()
}