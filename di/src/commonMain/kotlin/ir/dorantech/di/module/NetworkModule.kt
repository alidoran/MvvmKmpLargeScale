package ir.dorantech.di.module

import ir.dorantech.remote.api.UserService
import ir.dorantech.remote.api.impl.UserServiceImpl
import org.kodein.di.DI
import org.kodein.di.bindSingleton

val networkModule = DI.Module("networkModule") {
    bindSingleton<UserService> { UserServiceImpl() }
}