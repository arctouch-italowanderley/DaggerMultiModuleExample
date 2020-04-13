package irw.dagger.feature2.di

import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import irw.dagger.feature2.ui.Feature2Fragment

@Module
object Feature2BindsModule {

    @Provides
    @IntoMap
    @ClassKey(Feature2Fragment::class)
    @JvmStatic
    fun bindFeature2Fragment(comp: Feature2Component.Factory): Fragment {
        return comp.create().fragment
    }
}