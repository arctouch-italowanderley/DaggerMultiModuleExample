package irw.dagger.feature2.deps

class ScopedDependency {
    companion object {
        var instanceCount = 0
    }

    private val instanceNumber = ++instanceCount

    fun scopedDepMethod() = "scoped method in instance $instanceNumber of $instanceCount"
}