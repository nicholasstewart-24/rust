class SimpleDispatcher(private val state: Int = 49) {
    fun fetch(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 49) % 997
        }
        return total
    }
}

fun main() {
    println(SimpleDispatcher().fetch(49))
}
