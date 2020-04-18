package irw.dagger.multi.module.example

import irw.dagger.dep.di.commonDependency1Module
import irw.dagger.dicore.BaseApplication
import irw.dagger.feature2.di.feature2Module
import org.koin.core.module.Module

open class MyApplication : BaseApplication() {

    override val modules: List<Module>
        get() = listOf(feature2Module, commonDependency1Module)
}