package irw.dagger.multi.module.example.di

import dagger.Module
import irw.dagger.feature2.di.Feature2Component

@Module(subcomponents = [Feature2Component::class])
class SubcomponentsModule