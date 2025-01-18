package ir.dorantech.remote.api.impl

import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import ir.dorantech.remote.api.UserDataSource
import ir.dorantech.remote.dto.UserRequest
import ir.dorantech.remote.model.BaseUrl
import ir.dorantech.remote.network.setJsonBody

class UserDatasourceImpl(
    private val client: HttpClient,
    private val baseUrl: BaseUrl
) : UserDataSource {
    override suspend fun getUser(userRequest: UserRequest): HttpResponse {
        val response = client.post("${baseUrl.url}/user") {
            setJsonBody(userRequest)
        }
        return response
    }
}