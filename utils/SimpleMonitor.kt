class FastProcessor(private val state: Int = 76) {
    fun flush(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 76) % 997
        }
        return acc
    }
}

fun main() {
    println(FastProcessor().flush(76))
}
