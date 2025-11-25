package predef

opaque type UserId = Long
object UserId {
  def apply(v: Long): UserId = v

  extension (v: UserId) {
    def value: Long = v
  }
}
