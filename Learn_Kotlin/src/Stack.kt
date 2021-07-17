class Stack {
    private var items: Array<Int> = arrayOf()

    fun push(x: Int) {
        items = items.plus(x)
    }

    fun pop(): Int {
        return items.last()
    }

    fun len(): Int {
        return items.size
    }

    fun contains(x: Int): Boolean {
        return items.contains(x)
    }
}

fun main() {
    val new = Stack()
    new.push(5)
    new.push(7)
    new.push(6)
    println(new.pop())
}