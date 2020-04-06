package irw.dagger.dep

class CommonDependencyImpl1 : CommonDependency {
    override fun commonMethod() = "Dependency Impl 1"
}

class CommonDependencyImpl2 : CommonDependency {
    override fun commonMethod() = "Dependency Impl 2"
}

interface CommonDependency {
    fun commonMethod(): String
}

enum class DepType {
    DEP1, DEP2
}