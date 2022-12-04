package org.cream.kotlin.특별한클래스.이넘클래스

/*
Note
 미리 정의된 상수들로 이뤄진 제한된 집합을 표현한 클래스

TODO
 이넘 클래스

me
 1.정수, 문자열 등과 비교 할 때 이넘을 사용하면 어떤 값이 가능한 범위안에 들어가 있는지를 검사할 필요가 없으며
   컴파일러는 이넘 타입의 변수가 이넘 클래스에 정의된 값중 하나를 사용한지 검사 해줌
 2.이넘 상수 본문에 정의된 내포된 클래스들은 반드시 내부 클래스여야함
 */
enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun WeekDay.isWorkDay() =
    this == WeekDay.SATURDAY || this == WeekDay.SUNDAY

fun main1() {
    println(WeekDay.MONDAY.isWorkDay())
    println(WeekDay.SATURDAY.isWorkDay())
}

/*
Note
 이넘 클래스에 when식을 사용하면 모든 이넘 상수를 다룬 경우에는 else 생략 가능

TODO
 빠뜨린 부분이 없는 when 식
 */
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun rotateClockWise(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

/*
Note
 이넘 클래스도 멤버 포함 가능 확장 함수나 프로퍼티도 붙일 수 있음
  상수 목록과 다른 부분을 구분하기 위해 상수목록을 세미클론으로 끝냄
TODO
 커스텀 멤버가 있는 이넘 정의
 */
enum class WeekDay1 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val lowerCaseName get() = name.lowercase()
    fun isWorkDay() = this == SATURDAY || this == SUNDAY
}

fun main2() {
    println(WeekDay1.MONDAY.isWorkDay())
    println(WeekDay1.WEDNESDAY.lowerCaseName)
}

// 생성자 추가
enum class RainbowColor(val isCold: Boolean) {
    RED(false), ORANGE(false), YELLOW(false),
    GREEN(true), BLUE(true), INDIGO(true), VIOLET(true);

    val isWarm get() = !isCold
}

fun main3() {
    println(RainbowColor.BLUE.isCold)
    println(RainbowColor.RED.isWarm)
}

/*
Note
 모든 이넘 값에는 ordinal과 name이라는 한 쌍의 프로퍼티가 들어 있음
 ordinal은 이넘 클래스 안에 정의된 이넘 값의 순서에 따른 인덱스
 name은 이넘 값의 이름

TODO
 이넘 클래스의 공통 멤버 사용

me
 valueOf() 메서드는 이넘 값의 이름을 문자열로 넘기면 그에 해당하는 이넘 값을 돌려주거나 예외를 던짐
 values() 메서드는 정의된 순서대로 모든 이넘 값이 들어있는 배열을 돌려줌
 ==
 제네릭 최상위 메서드인 enumValues()와 enumValueof()를 사용 할 수 있음
 */
enum class Direction1 {
    NORTH, SOUTH, WEST, EAST;
}

private val weekDays = WeekDay.values()

fun main4() {
    println(Direction1.WEST.name)
    println(Direction1.WEST.ordinal)

    println(Direction1.valueOf("NORTH"))

    val weekDays = enumValues<WeekDay1>()
    println(weekDays[2])
    println(enumValueOf<WeekDay1>("THURSDAY"))
}