package predef

import java.time.LocalDateTime

enum GetUsersFilter {
  case HAS_BENEFITS, HAS_OR_WILL_HAVE_BENEFITS, HAD_BENEFITS
}

trait BenefitService[
    F[_],
    AssignBenefitResult,
    UnassignBenefitResult,
    ScheduleResult
] {
  def getUsers(filter: GetUsersFilter): F[Seq[UserResponse]]

  def assignBenefit(
      users: Set[UserId],
      benefit: Benefit
  ): F[AssignBenefitResult]

  def unassignBenefit(
      users: Set[UserId],
      benefit: Benefit
  ): F[UnassignBenefitResult]

  def scheduleBenefitAssigning(
      users: Set[UserId],
      benefit: Benefit,
      at: LocalDateTime
  ): F[ScheduleResult]
}
