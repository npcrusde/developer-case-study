package predef

import java.time.LocalDateTime

case class User(
    id: UserId,
    firstName: String,
    lastName: String,
    createdAt: LocalDateTime
)
