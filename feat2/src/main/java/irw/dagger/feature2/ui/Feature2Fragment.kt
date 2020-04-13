package irw.dagger.feature2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import irw.dagger.dep.CommonDependency
import irw.dagger.feature2.R
import irw.dagger.feature2.deps.LocalDependency
import irw.dagger.feature2.deps.ScopedDependency
import kotlinx.android.synthetic.main.fragment_feature2.*
import javax.inject.Inject

class Feature2Fragment @Inject constructor(
    private val dependency: CommonDependency,
    private val scopedDep: ScopedDependency,
    private val localDependency: LocalDependency
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_feature2, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        @SuppressLint("SetTextI18n")
        textDep.text = dependency.commonMethod() + "\n" +
                scopedDep.scopedDepMethod() + "\n" +
                localDependency.localDepMethod()
    }
}