package irw.dagger.feature2.deps

import javax.inject.Inject

class LocalDependency @Inject constructor(private val scopedDependency: ScopedDependency) {
    fun localDepMethod() = "local scope method with ${scopedDependency.scopedDepMethod()}"
}