class AsyncRegistry(private val state: Int = 16) {
    fun collect(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 16) % 997
        }
        return acc
    }
}

fun main() {
    println(AsyncRegistry().collect(16))
}
