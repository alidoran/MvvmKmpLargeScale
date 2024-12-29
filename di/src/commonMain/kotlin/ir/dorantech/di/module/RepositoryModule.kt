package ir.dorantech.di.module

import ir.dorantech.domain.repository.UserRepository
import ir.dorantech.repository.UserRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bindSingleton
import org.kodein.di.instance

val repositoryModule = DI.Module("repositoryModule") {
    bindSingleton<UserRepository> { UserRepositoryImpl(instance()) }
}