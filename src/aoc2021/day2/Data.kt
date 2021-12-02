package aoc2021.day2

data class Move(val direction: String, val magnitude: Int)

object Data {
    val data = listOf(
        Move("forward", 8),
        Move("down", 6),
        Move("down", 8),
        Move("forward", 7),
        Move("down", 5),
        Move("up", 2),
        Move("down", 3),
        Move("down", 7),
        Move("down", 8),
        Move("down", 8),
        Move("down", 8),
        Move("down", 2),
        Move("up", 1),
        Move("down", 3),
        Move("up", 2),
        Move("down", 4),
        Move("down", 2),
        Move("forward", 6),
        Move("forward", 4),
        Move("down", 3),
        Move("down", 2),
        Move("forward", 2),
        Move("forward", 1),
        Move("forward", 4),
        Move("forward", 5),
        Move("forward", 8),
        Move("down", 1),
        Move("down", 4),
        Move("up", 5),
        Move("up", 2),
        Move("forward", 3),
        Move("down", 9),
        Move("forward", 7),
        Move("forward", 9),
        Move("forward", 9),
        Move("forward", 8),
        Move("down", 1),
        Move("down", 2),
        Move("forward", 7),
        Move("down", 3),
        Move("forward", 6),
        Move("down", 4),
        Move("forward", 7),
        Move("down", 1),
        Move("up", 8),
        Move("forward", 3),
        Move("down", 1),
        Move("forward", 7),
        Move("up", 1),
        Move("forward", 8),
        Move("up", 6),
        Move("up", 2),
        Move("down", 6),
        Move("forward", 1),
        Move("up", 6),
        Move("forward", 5),
        Move("down", 9),
        Move("up", 5),
        Move("forward", 7),
        Move("forward", 9),
        Move("down", 9),
        Move("down", 3),
        Move("forward", 7),
        Move("forward", 8),
        Move("forward", 3),
        Move("forward", 9),
        Move("forward", 7),
        Move("down", 3),
        Move("down", 7),
        Move("down", 4),
        Move("forward", 2),
        Move("down", 7),
        Move("down", 3),
        Move("down", 5),
        Move("up", 1),
        Move("down", 9),
        Move("up", 4),
        Move("forward", 1),
        Move("up", 9),
        Move("down", 2),
        Move("forward", 8),
        Move("down", 8),
        Move("down", 6),
        Move("forward", 7),
        Move("down", 9),
        Move("down", 3),
        Move("forward", 8),
        Move("forward", 3),
        Move("down", 6),
        Move("down", 7),
        Move("down", 4),
        Move("forward", 3),
        Move("down", 3),
        Move("down", 9),
        Move("forward", 8),
        Move("forward", 9),
        Move("up", 5),
        Move("forward", 1),
        Move("down", 3),
        Move("down", 3),
        Move("down", 3),
        Move("down", 9),
        Move("down", 2),
        Move("down", 9),
        Move("forward", 5),
        Move("up", 3),
        Move("up", 5),
        Move("up", 7),
        Move("down", 2),
        Move("down", 7),
        Move("down", 9),
        Move("down", 5),
        Move("down", 4),
        Move("down", 8),
        Move("forward", 1),
        Move("up", 8),
        Move("up", 3),
        Move("forward", 1),
        Move("forward", 5),
        Move("forward", 3),
        Move("up", 7),
        Move("down", 9),
        Move("down", 9),
        Move("forward", 7),
        Move("down", 1),
        Move("forward", 1),
        Move("forward", 8),
        Move("forward", 6),
        Move("down", 1),
        Move("down", 7),
        Move("forward", 9),
        Move("up", 4),
        Move("forward", 8),
        Move("up", 6),
        Move("forward", 3),
        Move("down", 3),
        Move("down", 9),
        Move("forward", 5),
        Move("up", 3),
        Move("down", 7),
        Move("forward", 9),
        Move("forward", 2),
        Move("up", 1),
        Move("forward", 7),
        Move("up", 8),
        Move("forward", 7),
        Move("forward", 1),
        Move("up", 3),
        Move("up", 7),
        Move("down", 1),
        Move("forward", 5),
        Move("up", 8),
        Move("down", 2),
        Move("up", 2),
        Move("up", 3),
        Move("down", 5),
        Move("forward", 6),
        Move("up", 8),
        Move("down", 7),
        Move("up", 8),
        Move("up", 4),
        Move("down", 8),
        Move("forward", 9),
        Move("down", 8),
        Move("down", 2),
        Move("up", 7),
        Move("down", 5),
        Move("forward", 1),
        Move("up", 1),
        Move("down", 1),
        Move("forward", 1),
        Move("forward", 1),
        Move("forward", 3),
        Move("forward", 8),
        Move("down", 4),
        Move("down", 5),
        Move("forward", 9),
        Move("up", 6),
        Move("up", 7),
        Move("down", 8),
        Move("forward", 8),
        Move("down", 2),
        Move("forward", 6),
        Move("down", 3),
        Move("forward", 9),
        Move("forward", 5),
        Move("up", 7),
        Move("down", 2),
        Move("up", 6),
        Move("up", 6),
        Move("down", 9),
        Move("forward", 3),
        Move("up", 1),
        Move("up", 2),
        Move("forward", 9),
        Move("down", 1),
        Move("up", 3),
        Move("forward", 4),
        Move("forward", 9),
        Move("down", 3),
        Move("down", 4),
        Move("forward", 4),
        Move("up", 6),
        Move("up", 5),
        Move("forward", 2),
        Move("down", 5),
        Move("down", 1),
        Move("forward", 9),
        Move("down", 7),
        Move("up", 6),
        Move("up", 5),
        Move("forward", 4),
        Move("forward", 9),
        Move("down", 6),
        Move("forward", 1),
        Move("up", 6),
        Move("down", 1),
        Move("forward", 4),
        Move("up", 9),
        Move("down", 6),
        Move("forward", 5),
        Move("down", 2),
        Move("forward", 8),
        Move("forward", 9),
        Move("down", 7),
        Move("down", 4),
        Move("down", 1),
        Move("forward", 1),
        Move("down", 4),
        Move("down", 6),
        Move("forward", 5),
        Move("forward", 2),
        Move("forward", 8),
        Move("forward", 5),
        Move("down", 6),
        Move("up", 9),
        Move("forward", 2),
        Move("down", 1),
        Move("forward", 6),
        Move("forward", 6),
        Move("down", 5),
        Move("forward", 5),
        Move("down", 8),
        Move("forward", 3),
        Move("down", 5),
        Move("up", 1),
        Move("forward", 4),
        Move("down", 5),
        Move("down", 4),
        Move("forward", 4),
        Move("down", 3),
        Move("down", 5),
        Move("down", 7),
        Move("forward", 5),
        Move("forward", 2),
        Move("up", 2),
        Move("up", 4),
        Move("forward", 7),
        Move("down", 3),
        Move("down", 1),
        Move("down", 7),
        Move("up", 8),
        Move("forward", 6),
        Move("forward", 3),
        Move("forward", 7),
        Move("forward", 5),
        Move("up", 5),
        Move("down", 3),
        Move("down", 6),
        Move("forward", 7),
        Move("up", 9),
        Move("up", 5),
        Move("forward", 2),
        Move("down", 9),
        Move("forward", 8),
        Move("forward", 6),
        Move("forward", 5),
        Move("up", 5),
        Move("down", 9),
        Move("down", 8),
        Move("up", 2),
        Move("up", 4),
        Move("forward", 5),
        Move("forward", 2),
        Move("up", 4),
        Move("forward", 3),
        Move("down", 7),
        Move("forward", 8),
        Move("forward", 1),
        Move("forward", 9),
        Move("forward", 6),
        Move("up", 7),
        Move("up", 2),
        Move("forward", 1),
        Move("down", 5),
        Move("forward", 9),
        Move("down", 8),
        Move("down", 4),
        Move("down", 7),
        Move("up", 2),
        Move("down", 5),
        Move("forward", 7),
        Move("up", 3),
        Move("forward", 6),
        Move("down", 2),
        Move("forward", 8),
        Move("forward", 8),
        Move("up", 3),
        Move("forward", 6),
        Move("forward", 9),
        Move("forward", 8),
        Move("forward", 3),
        Move("up", 9),
        Move("forward", 9),
        Move("down", 6),
        Move("forward", 5),
        Move("forward", 8),
        Move("up", 1),
        Move("forward", 2),
        Move("forward", 6),
        Move("forward", 8),
        Move("up", 6),
        Move("down", 3),
        Move("down", 9),
        Move("down", 6),
        Move("up", 7),
        Move("forward", 6),
        Move("forward", 1),
        Move("forward", 1),
        Move("forward", 7),
        Move("down", 5),
        Move("down", 9),
        Move("down", 3),
        Move("up", 3),
        Move("forward", 3),
        Move("forward", 2),
        Move("down", 5),
        Move("up", 4),
        Move("forward", 1),
        Move("down", 9),
        Move("forward", 9),
        Move("forward", 1),
        Move("forward", 1),
        Move("down", 9),
        Move("down", 2),
        Move("forward", 4),
        Move("forward", 9),
        Move("down", 5),
        Move("up", 5),
        Move("down", 6),
        Move("forward", 8),
        Move("down", 4),
        Move("down", 1),
        Move("up", 5),
        Move("up", 3),
        Move("down", 2),
        Move("down", 3),
        Move("forward", 8),
        Move("forward", 5),
        Move("forward", 9),
        Move("down", 4),
        Move("up", 9),
        Move("down", 1),
        Move("forward", 2),
        Move("down", 8),
        Move("up", 2),
        Move("down", 8),
        Move("up", 6),
        Move("forward", 7),
        Move("down", 1),
        Move("up", 7),
        Move("down", 9),
        Move("forward", 9),
        Move("down", 9),
        Move("forward", 7),
        Move("forward", 4),
        Move("down", 5),
        Move("up", 3),
        Move("down", 3),
        Move("forward", 8),
        Move("down", 3),
        Move("down", 4),
        Move("down", 9),
        Move("forward", 4),
        Move("up", 4),
        Move("forward", 6),
        Move("down", 1),
        Move("forward", 5),
        Move("down", 2),
        Move("forward", 6),
        Move("down", 4),
        Move("down", 1),
        Move("forward", 3),
        Move("up", 3),
        Move("up", 3),
        Move("forward", 8),
        Move("forward", 6),
        Move("forward", 6),
        Move("down", 9),
        Move("forward", 5),
        Move("down", 9),
        Move("forward", 6),
        Move("forward", 3),
        Move("up", 4),
        Move("forward", 6),
        Move("down", 8),
        Move("up", 3),
        Move("down", 9),
        Move("down", 3),
        Move("forward", 6),
        Move("down", 4),
        Move("down", 8),
        Move("down", 6),
        Move("down", 5),
        Move("forward", 1),
        Move("down", 3),
        Move("forward", 9),
        Move("down", 9),
        Move("down", 3),
        Move("forward", 9),
        Move("down", 2),
        Move("forward", 3),
        Move("up", 6),
        Move("forward", 2),
        Move("forward", 1),
        Move("forward", 8),
        Move("down", 2),
        Move("down", 2),
        Move("down", 7),
        Move("up", 7),
        Move("forward", 3),
        Move("up", 2),
        Move("up", 6),
        Move("up", 6),
        Move("down", 2),
        Move("forward", 2),
        Move("forward", 2),
        Move("down", 6),
        Move("down", 2),
        Move("up", 6),
        Move("forward", 4),
        Move("down", 9),
        Move("up", 3),
        Move("down", 4),
        Move("forward", 7),
        Move("up", 6),
        Move("forward", 3),
        Move("forward", 1),
        Move("down", 1),
        Move("down", 8),
        Move("down", 8),
        Move("down", 1),
        Move("forward", 2),
        Move("down", 6),
        Move("down", 6),
        Move("forward", 2),
        Move("up", 6),
        Move("down", 2),
        Move("up", 4),
        Move("down", 1),
        Move("up", 8),
        Move("up", 5),
        Move("down", 4),
        Move("forward", 2),
        Move("forward", 2),
        Move("down", 2),
        Move("forward", 9),
        Move("down", 5),
        Move("down", 9),
        Move("forward", 6),
        Move("down", 9),
        Move("down", 5),
        Move("down", 7),
        Move("down", 3),
        Move("up", 9),
        Move("down", 6),
        Move("up", 6),
        Move("up", 8),
        Move("forward", 8),
        Move("forward", 8),
        Move("down", 3),
        Move("up", 9),
        Move("forward", 9),
        Move("forward", 8),
        Move("forward", 6),
        Move("down", 4),
        Move("down", 6),
        Move("up", 9),
        Move("down", 9),
        Move("down", 5),
        Move("up", 2),
        Move("up", 2),
        Move("forward", 2),
        Move("forward", 1),
        Move("down", 5),
        Move("down", 8),
        Move("up", 3),
        Move("forward", 2),
        Move("down", 1),
        Move("down", 9),
        Move("forward", 7),
        Move("forward", 5),
        Move("up", 3),
        Move("up", 6),
        Move("down", 5),
        Move("up", 1),
        Move("down", 2),
        Move("up", 7),
        Move("forward", 1),
        Move("down", 6),
        Move("up", 6),
        Move("up", 1),
        Move("up", 2),
        Move("forward", 2),
        Move("down", 4),
        Move("up", 1),
        Move("up", 3),
        Move("up", 9),
        Move("up", 7),
        Move("forward", 4),
        Move("down", 5),
        Move("down", 9),
        Move("down", 8),
        Move("forward", 1),
        Move("down", 4),
        Move("forward", 4),
        Move("forward", 8),
        Move("up", 4),
        Move("down", 8),
        Move("down", 1),
        Move("down", 9),
        Move("down", 5),
        Move("forward", 3),
        Move("forward", 8),
        Move("up", 2),
        Move("down", 6),
        Move("up", 6),
        Move("forward", 5),
        Move("down", 6),
        Move("down", 8),
        Move("forward", 6),
        Move("down", 6),
        Move("up", 5),
        Move("down", 2),
        Move("up", 5),
        Move("down", 7),
        Move("down", 9),
        Move("forward", 3),
        Move("down", 8),
        Move("forward", 1),
        Move("forward", 5),
        Move("forward", 2),
        Move("down", 4),
        Move("forward", 2),
        Move("forward", 7),
        Move("up", 7),
        Move("up", 3),
        Move("down", 2),
        Move("forward", 7),
        Move("up", 6),
        Move("forward", 6),
        Move("forward", 1),
        Move("down", 4),
        Move("down", 2),
        Move("down", 6),
        Move("down", 1),
        Move("forward", 1),
        Move("forward", 8),
        Move("down", 1),
        Move("up", 2),
        Move("down", 2),
        Move("down", 1),
        Move("down", 6),
        Move("forward", 7),
        Move("forward", 6),
        Move("forward", 5),
        Move("down", 1),
        Move("down", 8),
        Move("down", 1),
        Move("up", 5),
        Move("forward", 6),
        Move("forward", 5),
        Move("up", 5),
        Move("forward", 5),
        Move("up", 8),
        Move("down", 3),
        Move("forward", 1),
        Move("forward", 6),
        Move("up", 8),
        Move("up", 9),
        Move("down", 7),
        Move("down", 1),
        Move("forward", 2),
        Move("forward", 1),
        Move("forward", 9),
        Move("forward", 3),
        Move("forward", 7),
        Move("forward", 8),
        Move("down", 6),
        Move("up", 5),
        Move("down", 1),
        Move("forward", 1),
        Move("forward", 8),
        Move("down", 6),
        Move("forward", 7),
        Move("forward", 8),
        Move("down", 7),
        Move("down", 5),
        Move("down", 7),
        Move("up", 7),
        Move("down", 5),
        Move("forward", 5),
        Move("down", 4),
        Move("down", 7),
        Move("forward", 6),
        Move("forward", 5),
        Move("forward", 6),
        Move("forward", 7),
        Move("up", 9),
        Move("down", 2),
        Move("down", 2),
        Move("down", 4),
        Move("down", 8),
        Move("up", 3),
        Move("down", 7),
        Move("down", 5),
        Move("forward", 6),
        Move("down", 9),
        Move("down", 5),
        Move("down", 9),
        Move("down", 1),
        Move("forward", 6),
        Move("up", 7),
        Move("down", 2),
        Move("down", 2),
        Move("forward", 8),
        Move("forward", 1),
        Move("down", 3),
        Move("down", 4),
        Move("forward", 3),
        Move("forward", 4),
        Move("down", 1),
        Move("forward", 9),
        Move("up", 7),
        Move("forward", 8),
        Move("down", 9),
        Move("forward", 7),
        Move("forward", 6),
        Move("forward", 2),
        Move("down", 8),
        Move("up", 9),
        Move("down", 2),
        Move("forward", 8),
        Move("up", 7),
        Move("down", 5),
        Move("down", 9),
        Move("down", 3),
        Move("down", 6),
        Move("down", 4),
        Move("up", 2),
        Move("down", 3),
        Move("down", 1),
        Move("up", 1),
        Move("up", 6),
        Move("forward", 4),
        Move("down", 1),
        Move("forward", 1),
        Move("up", 4),
        Move("forward", 4),
        Move("forward", 3),
        Move("forward", 8),
        Move("forward", 9),
        Move("forward", 9),
        Move("down", 2),
        Move("down", 5),
        Move("up", 8),
        Move("up", 1),
        Move("down", 9),
        Move("forward", 5),
        Move("down", 1),
        Move("up", 5),
        Move("down", 4),
        Move("up", 3),
        Move("forward", 9),
        Move("up", 7),
        Move("forward", 9),
        Move("up", 1),
        Move("forward", 4),
        Move("forward", 8),
        Move("up", 6),
        Move("down", 6),
        Move("down", 8),
        Move("down", 8),
        Move("down", 9),
        Move("down", 2),
        Move("up", 7),
        Move("forward", 9),
        Move("up", 8),
        Move("down", 9),
        Move("up", 6),
        Move("forward", 4),
        Move("up", 7),
        Move("down", 6),
        Move("up", 7),
        Move("down", 4),
        Move("forward", 2),
        Move("forward", 9),
        Move("down", 6),
        Move("down", 8),
        Move("forward", 6),
        Move("forward", 3),
        Move("down", 3),
        Move("forward", 3),
        Move("forward", 7),
        Move("up", 2),
        Move("down", 8),
        Move("forward", 7),
        Move("down", 5),
        Move("down", 1),
        Move("down", 6),
        Move("down", 5),
        Move("down", 2),
        Move("up", 6),
        Move("forward", 7),
        Move("forward", 6),
        Move("down", 1),
        Move("down", 5),
        Move("forward", 7),
        Move("forward", 3),
        Move("down", 9),
        Move("down", 8),
        Move("forward", 5),
        Move("up", 7),
        Move("forward", 1),
        Move("up", 5),
        Move("down", 7),
        Move("forward", 8),
        Move("forward", 6),
        Move("forward", 2),
        Move("down", 1),
        Move("down", 9),
        Move("up", 1),
        Move("down", 2),
        Move("down", 2),
        Move("down", 7),
        Move("down", 4),
        Move("forward", 1),
        Move("down", 3),
        Move("down", 5),
        Move("up", 8),
        Move("forward", 7),
        Move("up", 5),
        Move("down", 8),
        Move("down", 6),
        Move("down", 3),
        Move("down", 3),
        Move("down", 9),
        Move("down", 7),
        Move("forward", 4),
        Move("up", 5),
        Move("forward", 3),
        Move("forward", 7),
        Move("down", 3),
        Move("up", 6),
        Move("forward", 4),
        Move("forward", 4),
        Move("down", 4),
        Move("down", 2),
        Move("up", 1),
        Move("forward", 8),
        Move("forward", 3),
        Move("up", 1),
        Move("forward", 1),
        Move("down", 9),
        Move("down", 6),
        Move("up", 1),
        Move("down", 4),
        Move("down", 8),
        Move("up", 9),
        Move("forward", 2),
        Move("down", 3),
        Move("forward", 8),
        Move("down", 6),
        Move("down", 5),
        Move("down", 4),
        Move("up", 5),
        Move("down", 9),
        Move("up", 3),
        Move("forward", 4),
        Move("down", 9),
        Move("down", 7),
        Move("forward", 6),
        Move("forward", 6),
        Move("forward", 8),
        Move("forward", 6),
        Move("down", 9),
        Move("down", 1),
        Move("forward", 3),
        Move("forward", 9),
        Move("forward", 4),
        Move("up", 8),
        Move("up", 5),
        Move("up", 2),
        Move("down", 9),
        Move("forward", 9),
        Move("forward", 3),
        Move("forward", 5),
        Move("up", 8),
        Move("down", 2),
        Move("down", 1),
        Move("forward", 9),
        Move("forward", 7),
        Move("down", 7),
        Move("forward", 1),
        Move("down", 5),
        Move("down", 8),
        Move("down", 4),
        Move("down", 7),
        Move("down", 1),
        Move("down", 4),
        Move("down", 7),
        Move("forward", 2),
        Move("down", 5),
        Move("forward", 1),
        Move("down", 4),
        Move("down", 5),
        Move("down", 2),
        Move("up", 5),
        Move("forward", 9),
        Move("down", 5),
        Move("forward", 1),
        Move("down", 7),
        Move("down", 4),
        Move("down", 7),
        Move("down", 6),
        Move("forward", 5),
        Move("down", 3),
        Move("down", 1),
        Move("up", 2),
        Move("forward", 2),
        Move("forward", 2),
        Move("forward", 1),
        Move("down", 1),
        Move("forward", 3),
        Move("forward", 5),
        Move("forward", 4),
        Move("down", 7),
        Move("forward", 7),
        Move("down", 1),
        Move("forward", 7),
        Move("forward", 5),
        Move("down", 8),
        Move("forward", 6),
        Move("forward", 6),
        Move("forward", 6),
        Move("forward", 7),
        Move("up", 9),
        Move("down", 4),
        Move("down", 1),
        Move("down", 8),
        Move("forward", 7),
        Move("up", 4),
        Move("forward", 4),
        Move("down", 6),
        Move("up", 1),
        Move("forward", 5),
        Move("forward", 2),
        Move("down", 1),
        Move("forward", 7),
        Move("forward", 6),
        Move("forward", 5),
        Move("forward", 2),
        Move("down", 5),
        Move("down", 6),
        Move("down", 9),
        Move("up", 4),
        Move("forward", 6),
        Move("forward", 2),
        Move("down", 5),
        Move("down", 3),
        Move("up", 4),
        Move("down", 6),
        Move("up", 8),
        Move("forward", 8),
        Move("up", 9),
        Move("forward", 6),
        Move("forward", 6),
        Move("up", 5),
        Move("down", 7),
        Move("forward", 9),
        Move("forward", 6),
        Move("down", 9),
        Move("down", 9),
        Move("up", 1),
        Move("forward", 7),
        Move("down", 6),
        Move("up", 4),
        Move("down", 8),
        Move("down", 3),
        Move("forward", 9),
        Move("forward", 5),
        Move("forward", 9),
        Move("down", 2),
        Move("forward", 3),
        Move("down", 1),
        Move("forward", 9),
        Move("up", 4),
        Move("up", 8),
        Move("forward", 6),
        Move("down", 1),
        Move("forward", 9),
        Move("forward", 4),
        Move("down", 5),
        Move("forward", 2),
        Move("up", 3),
        Move("forward", 5),
        Move("up", 8),
        Move("up", 7),
        Move("down", 8),
        Move("forward", 4),
        Move("down", 6),
        Move("forward", 7),
        Move("up", 2),
        Move("down", 2),
        Move("forward", 4),
        Move("down", 9),
        Move("down", 8),
        Move("forward", 2),
        Move("forward", 2),
        Move("down", 2),
        Move("down", 3),
        Move("forward", 3),
        Move("down", 1),
        Move("forward", 8),
        Move("down", 7),
        Move("up", 9),
        Move("down", 4),
        Move("down", 2),
        Move("down", 5),
        Move("up", 7),
        Move("down", 8),
        Move("down", 2),
        Move("down", 4),
        Move("down", 4),
        Move("down", 8),
        Move("forward", 7),
        Move("forward", 7),
        Move("down", 8),
        Move("up", 2),
        Move("up", 3),
        Move("forward", 8),
        Move("up", 1),
        Move("down", 7),
        Move("forward", 7),
        Move("down", 6),
        Move("down", 8),
        Move("up", 6),
        Move("forward", 5),
        Move("forward", 3),
        Move("down", 6),
        Move("forward", 9),
        Move("up", 4),
        Move("up", 7),
        Move("forward", 4),
        Move("down", 1),
        Move("down", 8),
        Move("down", 1),
        Move("forward", 9),
        Move("down", 3),
        Move("forward", 8),
        Move("forward", 6),
        Move("forward", 4),
        Move("down", 9),
        Move("forward", 3),
        Move("up", 5),
        Move("up", 8),
        Move("down", 9),
        Move("down", 5),
        Move("down", 1),
        Move("up", 8),
        Move("forward", 8),
        Move("up", 6),
        Move("forward", 2),
        Move("down", 8),
        Move("up", 4),
        Move("up", 7),
        Move("forward", 7),
        Move("forward", 5),
        Move("forward", 9),
        Move("forward", 2),
        Move("up", 4),
        Move("down", 9),
        Move("forward", 7),
        Move("down", 6),
        Move("down", 6),
        Move("forward", 7),
        Move("down", 5),
        Move("up", 6),
        Move("down", 9),
        Move("forward", 3),
    )
}