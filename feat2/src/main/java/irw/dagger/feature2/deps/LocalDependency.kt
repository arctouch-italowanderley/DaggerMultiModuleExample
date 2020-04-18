package irw.dagger.feature2.deps

class LocalDependency constructor(private val scopedDependency: ScopedDependency) {
    fun localDepMethod() = "local scope method with ${scopedDependency.scopedDepMethod()}"
}