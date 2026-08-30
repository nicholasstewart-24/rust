class SmartAdapter(private val state: Int = 51) {
    fun render(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 51) % 997
        }
        return result
    }
}

fun main() {
    println(SmartAdapter().render(51))
}
