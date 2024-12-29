package ir.dorantech.remote.api.impl

import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import ir.dorantech.remote.api.UserService
import ir.dorantech.remote.dto.UserRequest
import ir.dorantech.remote.network.BASE_URL
import ir.dorantech.remote.network.httpClient
import ir.dorantech.remote.network.setJsonBody

class UserServiceImpl(
    private val client: HttpClient = httpClient
) : UserService {
    override suspend fun getUser(userRequest: UserRequest): HttpResponse {
        val response = client.post("$BASE_URL/user") {
            setJsonBody(userRequest)
        }
        client.close()
        return response
    }
}