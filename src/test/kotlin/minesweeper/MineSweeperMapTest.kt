package minesweeper

import domain.MineCountNumber
import domain.MineSweeperMap
import domain.PositiveNumber
import domain.Symbol
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MineSweeperMapTest {
    @Test
    fun `높이와 너비가 가지는 영역에 지뢰를 랜덤하게 위치시킨다`() {
        // [give]
        val height = PositiveNumber(3)
        val width = PositiveNumber(7)
        val mineCount = MineCountNumber(PositiveNumber(10), height, width)
        val mineMapProperty = MineSweeperMap.Property(height, width, mineCount)

        // [when]
        val mineSweeperMap = MineSweeperMap(mineMapProperty)

        // [then]
        val actualMineCount = mineSweeperMap.value.map { row ->
            row.count { pos -> pos.symbol == Symbol.MINE }
        }.reduce { acc, i -> acc + i }

        actualMineCount shouldBe mineCount.value
    }
}
