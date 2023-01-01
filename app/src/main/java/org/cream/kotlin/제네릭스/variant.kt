package org.cream.kotlin.제네릭스

/*
Note
 무공변 = 타입 파라미터에서 하위 타입 관계가 성립해도 제네릭 타입 사이에는 하위 타입 관계가 생기지 않는다는 것
 공변적 = 생산자 역활을 하는 타입은 모두 공변적
  - Pair, Triple, Iterable, Iterator등

TODO
 변성: 생산자와 소비자 구분
 */



/*
Note
 선언 지점 변성 = 타입 파라미터의 변성을 선언 자체에 지정하는 것

TODO
 선언 지점 변성
 */
interface List<out T> {
    val size: Int
    fun get(index: Int):T
}
class Writer<in T> {
    fun write(value: T){
        println(value)
    }
}

class ListByArray<T>(private vararg val items: T) : List<T> {
    override val size: Int get() = items.size
    override fun get(index: Int) = items[index]
}

fun <T> concat(list1: List<T>, list2: List<T>) = object : List<T> {
    override val size: Int
    get() = list1.size + list2.size

    override fun get(index: Int): T {
        return if (index < list1.size) {
            list1.get(index)
        } else {
            list2.get(index - list1.size)
        }
    }
}

/*
Note
 사용 지점 변성 = 타입 인자를 치환하는 것

TODO
 프로젝션을 사용한 사용 지점 변성
 */















