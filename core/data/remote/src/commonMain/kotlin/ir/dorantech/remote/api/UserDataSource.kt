package ir.dorantech.remote.api

import io.ktor.client.statement.HttpResponse
import ir.dorantech.remote.dto.UserRequest

interface UserDataSource {
    suspend fun getUser(userRequest: UserRequest): HttpResponse
}