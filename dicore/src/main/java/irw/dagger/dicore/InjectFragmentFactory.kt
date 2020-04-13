package irw.dagger.dicore

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject
import javax.inject.Provider

class InjectFragmentFactory @Inject constructor(
    private val providers: Map<Class<*>, @JvmSuppressWildcards Provider<Fragment>>
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return providers[loadFragmentClass(classLoader, className)]?.get()
            ?: super.instantiate(classLoader, className)
    }
}