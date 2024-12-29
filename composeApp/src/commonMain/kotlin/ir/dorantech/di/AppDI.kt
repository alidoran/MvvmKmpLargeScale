package ir.dorantech.di

import ir.dorantech.di.module.networkModule
import ir.dorantech.di.module.repositoryModule
import ir.dorantech.di.module.useCaseModule
import org.kodein.di.DI

val appDI = DI {
    import(networkModule)
    import(repositoryModule)
    import(useCaseModule)
    import(viewModelModule)
}