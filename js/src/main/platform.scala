package scopt

private[scopt] object OptionDef {
  val UNBOUNDED = Int.MaxValue
  val NL = System.getProperty("line.separator")
  val WW = "  "
  val TB = "        "
  val NLTB = NL + TB
  val NLNL = NL + NL
  val column1MaxLength = 25 + WW.length
  val defaultKeyName = "<key>"
  val defaultValueName = "<value>"
  val atomic = new java.util.concurrent.atomic.AtomicInteger
  def generateId: Int = atomic.incrementAndGet
  def makeSuccess[A]: Either[A, Unit] = Right(())
}
