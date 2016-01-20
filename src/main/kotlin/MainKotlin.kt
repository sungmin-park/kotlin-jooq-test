import org.jooq.DSLContext

object MainKotlin {
    lateinit var context: DSLContext

    @JvmStatic
    fun main(args: Array<String>) {
        context.select().from // <-- From here Intellij will not respond.
    }
}