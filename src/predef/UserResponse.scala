package predef

import java.time.LocalDateTime

case class UserResponse(
    id: UserId,
    firstName: String,
    lastName: String,
    createdAt: LocalDateTime,
    benefits: Set[Benefit]
)
