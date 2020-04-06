package irw.dagger.feature2.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import irw.dagger.dep.CommonDependency
import irw.dagger.feature2.R
import irw.dagger.feature2.di.Feature2ComponentProvider
import kotlinx.android.synthetic.main.fragment_feature2.textDep
import javax.inject.Inject

class Feature2Fragment : Fragment() {

    @Inject
    lateinit var dependency: CommonDependency

    override fun onAttach(context: Context) {
        val feature2Component = (context.applicationContext as Feature2ComponentProvider).provideFeature2Component()
        feature2Component.inject(this)

        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_feature2, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textDep.text = dependency.commonMethod()
    }
}