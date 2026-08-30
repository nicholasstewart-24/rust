class HybridParser(private val state: Int = 55) {
    fun load(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 55) % 997
        }
        return acc
    }
}

fun main() {
    println(HybridParser().load(55))
}
