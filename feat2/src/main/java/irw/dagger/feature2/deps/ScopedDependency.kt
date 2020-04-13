package irw.dagger.feature2.deps

import irw.dagger.feature2.di.scope.Feature2Scope
import javax.inject.Inject

@Feature2Scope
class ScopedDependency @Inject constructor() {
    companion object {
        var instanceCount = 0
    }

    private val instanceNumber = ++instanceCount

    fun scopedDepMethod() = "scoped method in instance $instanceNumber of $instanceCount"
}