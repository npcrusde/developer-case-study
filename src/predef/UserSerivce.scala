import predef.*
import java.time.LocalDateTime

trait UserService[F[_]] {
  def getUsers(): F[Seq[User]]

  def assignLicence(users: Set[UserId], benefit: Benefit): F[Unit]

  def scheduleLicence(
      users: Set[UserId],
      benefit: Benefit,
      at: LocalDateTime
  ): F[Unit]
}
