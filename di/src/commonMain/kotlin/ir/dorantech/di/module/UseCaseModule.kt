package ir.dorantech.di.module

import ir.dorantech.domain.usecase.UserByIdUseCase
import org.kodein.di.DI
import org.kodein.di.bindSingleton
import org.kodein.di.instance

val useCaseModule = DI.Module("useCaseModule") {
    bindSingleton<UserByIdUseCase> { UserByIdUseCase(instance()) }
}