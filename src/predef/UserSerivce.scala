import predef.*
import java.time.LocalDateTime

// TODO: this types are to be adjusted depends on the implementation
type assignBenefitResult = Unit
type ScheduleBenefitAssigningResult = Unit

enum GetUsersFilter {
  case HAS_BENEFITS, HAS_OR_WILL_HAVE_BENEFITS, HAD_BENEFITS
}

trait UserService[F[_]] {
  def getUsers(filter: GetUsersFilter): F[Seq[User]]

  def assignBenefit(
      users: Set[UserId],
      benefit: Benefit
  ): F[assignBenefitResult]

  def scheduleBenefitAssigning(
      users: Set[UserId],
      benefit: Benefit,
      at: LocalDateTime
  ): F[ScheduleBenefitAssigningResult]
}
