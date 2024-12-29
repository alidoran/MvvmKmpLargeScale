package ir.dorantech.repository

import io.ktor.client.call.*
import io.ktor.http.*
import ir.dorantech.domain.model.UserModel
import ir.dorantech.domain.repository.UserRepository
import ir.dorantech.domain.result.DataError
import ir.dorantech.domain.result.DataResult
import ir.dorantech.mapper.toDomain
import ir.dorantech.remote.api.UserService
import ir.dorantech.remote.dto.UserDto
import ir.dorantech.remote.dto.UserRequest

class UserRepositoryImpl(
    private val userService: UserService
) : UserRepository {
    override suspend fun getUser(userId: String): DataResult<UserModel> {
        val response = userService.getUser(UserRequest(userId))
        return when (response.status) {
            HttpStatusCode.OK -> {
                DataResult.Success(response.body<UserDto>().toDomain())
            }

            HttpStatusCode.Unauthorized -> {
                DataResult.Error(
                    DataError.Unauthorized(response.body<Throwable>())
                )
            }

            else -> {
                DataResult.Error(DataError.Unknown(response.body<Throwable>()))
            }
        }
    }
}