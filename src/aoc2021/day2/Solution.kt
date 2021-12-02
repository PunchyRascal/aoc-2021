package aoc2021.day2

object Solution {

    fun task1() {
        var horizontalPosition = 0
        var depth = 0

        Data.data.forEach {
            val depthChange = when (it.direction) {
                "up" -> -it.magnitude
                "down" -> it.magnitude
                else -> 0
            }
            val horizontalChange = when (it.direction) {
                "forward" -> it.magnitude
                else -> 0
            }

            horizontalPosition += horizontalChange
            depth += depthChange
        }

        println("* Horizontal position: $horizontalPosition, depth: $depth, product: ${horizontalPosition * depth}")
    }

    fun task2() {
        var horizontalPosition = 0
        var depth = 0
        var aim = 0

        Data.data.forEach {
            val depthChange = when (it.direction) {
                "forward" -> aim * it.magnitude
                else -> 0
            }
            val horizontalChange = when (it.direction) {
                "forward" -> it.magnitude
                else -> 0
            }
            val aimChange = when (it.direction) {
                "up" -> -it.magnitude
                "down" -> it.magnitude
                else -> 0
            }

            horizontalPosition += horizontalChange
            depth += depthChange
            aim += aimChange
        }

        println("* Horizontal position: $horizontalPosition, depth: $depth, product: ${horizontalPosition * depth}")
    }

}

fun main() {
    Solution.task1()
    Solution.task2()
}