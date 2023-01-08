package org.cream.kotlin.day

/*
TODO
 class
 */
class Objects() {

    var personAge = 0

    fun a(age: Int) {
        personAge = age
    }
}

fun main7() {
    val objects = Objects()
    println(objects)

    val person1 = Objects()
    println(person1.a(13))
}

/*
TODO
 list
 */
fun a(list: List<Int>, number: Int): Int {
    var occurrences = 0
    for (e in list) {
        if (number == e) {
            occurrences++
        }
    }
    return occurrences
}


fun main8() {
    val list = listOf(1, 2, 3, 4, 5)
    val list2 = mutableListOf<Int>()

    println(list)
    println(list[0])
    println(list.first())
    println(list.last())
    println(list.take(3))

    println(a(list = list, 3))
    println("============================")

    println(list2)
    list2.addAll(listOf(1, 2, 3, 4, 5))
    println(list2)

    list2.add(6)
    println(list2)

    list2.removeAt(3)
    println(list2)

    list2.clear()
    println(list2)
}


/*
TODO
  set
 */
fun main9() {
    val set = setOf(1, 2, 3, 4, 5, 7, 6, 5, 5, 6, 5)
    val set1 = mutableSetOf(1, 2, 3, 4, 5, 7, 6, 5, 5, 6, 5)

    println(set.subtract(setOf(5, 9)))
    println(set1.intersect(setOf(5, 9)))
    println(set.union(setOf(5, 9)))

    println(set.toSet())
}


/*
TODO
  maps
 */
class Animal(
    val name: String,
    val age: Int,
)

fun main10() {
    val animals = mapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue",
    )

    println(animals["Monkey"])

    val keys = animals.keys
    val values = animals.values
    println(keys)
    println(values)

    // 맵으로 지정한 키와 값을 나타내는 것
    for (entry in animals) {
        println(entry.key)
        println(entry.value)
    }

    val monkey = Animal("Monkey", 3)
    val tiger = Animal("Tiger", 5)
    val whale = Animal("Whale", 4)
    val animalList = listOf(monkey, tiger, whale)

    val animalMap = animalList.associateBy({ it.name }, { it.age })
    println(animalMap)
}