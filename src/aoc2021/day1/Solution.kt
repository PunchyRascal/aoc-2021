package aoc2021.day1

class Solution {

    companion object {

        fun task1() {
            var prev: Int? = null
            var cnt = 0
            Data.data.forEach {
                if (prev != null && it > prev!!) {
                    cnt++
                }

                prev = it
            }

            println("* Increased measurement count: $cnt")
        }

        data class Window(val points: MutableList<Int> = mutableListOf()) {
            val isComplete: Boolean
                get() = points.size == 3
            val sum: Int
                get() = points.sum()
        }

        fun task2() {
            var cnt = 0
            val wins = mutableListOf<Window>()

            Data.data.forEach { dataPoint ->
                wins.add(Window())
                wins.forEach {
                    if (!it.isComplete) {
                        it.points.add(dataPoint)
                    }
                }
                wins.filter { it.isComplete }.takeLast(2).apply {
                    if (size == 2 && last().sum > first().sum) {
                        cnt++
                    }
                }
            }
            println("* Increased measurement windows cnt: $cnt")
        }
    }
}

fun main() {
    Solution.task1()
    Solution.task2()
}




