package irw.dagger.dep

internal class CommonDependencyImpl1 : CommonDependency {
    override fun commonMethod() = "Dependency Impl 1"
}

internal class CommonDependencyImpl2 : CommonDependency {
    override fun commonMethod() = "Dependency Impl 2"
}

interface CommonDependency {
    fun commonMethod(): String
}