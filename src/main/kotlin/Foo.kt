class Foo(private val bar: Bar) {
    fun run(): String {
        return "Execution of bar with id ${bar.id} took ${bar.duration?.toString() ?: "an unknown time"}"
    }
}