package ir.dorantech.local.database

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import ir.dorantech.model.PlatformContext

actual fun databaseDriverFactory(platformContext: PlatformContext): SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
