class AsyncEngine(private val state: Int = 84) {
    fun decode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 84) % 997
        }
        return count
    }
}

fun main() {
    println(AsyncEngine().decode(84))
}
