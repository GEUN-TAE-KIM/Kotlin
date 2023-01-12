package org.cream.kotlin.day

/*
TODO
 람다
 */
fun main16() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map { number ->
        "\"$number\""
    }
    println(numbers)
    println(quotedNumbers)

    // 문자를 변환~
    val quotedNumbers2 = numbers.joinToString { number ->
        "\"$number\""
    }
    println(quotedNumbers2)

    val quoted = { number: Int -> "\"$number\"" }
    val quotedNumber3 = numbers.joinToString(transform = quoted)

    val quotedNumber4 = numbers.mapIndexed { _, number ->
        "$number"
    }
}


/*
TODO
 컬렉션
 */
fun main17() {

    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numbersList.filter { number ->
        number > 5
    })

    println(numbersList.filterIndexed { index, number ->
        index == 0
    })

    println(numbersList.filterNot { number ->
        number == 1
    })

}


/*
TODO
 고차함수
 */
fun main18() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val moreThenTwo: (Int) -> Boolean = {it > 2}
    println(numbers.any(moreThenTwo))

    repeat(times = 5) { index ->
        println("$index")
    }
}


/*
TODO
 리스트 들
 */
fun main19() {
    val first = listOf("a", "b", "c", "d", "e")
    val second = listOf(1, 2, 3, 4)
    println(first.zip(second))
    println(first.zip(0..10))

    val ids = listOf(10, 11, 12)
    val names = listOf("r", "d", "z")
    val result = ids.zip(names) { id, name ->
        Person1(id = id, name = name)
    }
    println(result)

    val map : Map<Int, List<Person1>> = result.groupBy(Person1::id)
    println(map)
}


data class Person1(
    val id: Int,
    val name: String
)


/*
TODO

 */
fun main() {


}










