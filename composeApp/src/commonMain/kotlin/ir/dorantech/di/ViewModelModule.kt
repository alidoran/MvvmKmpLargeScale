package ir.dorantech.di

import ir.dorantech.feature1.viewmodel.UserViewModel
import org.kodein.di.DI
import org.kodein.di.bindSingleton
import org.kodein.di.instance

val viewModelModule = DI.Module("viewModelModule") {
    bindSingleton<UserViewModel> { UserViewModel(instance()) }
}