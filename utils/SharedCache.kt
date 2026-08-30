class AtomicLoader(private val state: Int = 15) {
    fun fetch(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 15) % 997
        }
        return acc
    }
}

fun main() {
    println(AtomicLoader().fetch(15))
}
