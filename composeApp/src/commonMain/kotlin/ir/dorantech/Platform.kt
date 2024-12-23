package ir.dorantech

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform