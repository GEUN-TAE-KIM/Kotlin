package org.cream.kotlin.제네릭스

/*
Note
 제네렉스 = 개발자가 알지 못하는 타입의 데이터를 조작하는 코드를 작성할 수 있게 해주는 타입 시스템

TODO
 제네릭 선언
*/
class TreeNode<T>(val data: T) {
    private val _children = arrayListOf<TreeNode<T>>()
    var parent: TreeNode<T>? = null

    private set

   // val children: List<TreeNode<T>> get() = _children

    fun addChild(data: T) = TreeNode(data).also {
        _children += it
        it.parent = this
    }

    override fun toString() =
        _children.joinToString(prefix = "$data {", postfix = "}")
}

fun main1() {
    val root = TreeNode("Hello").apply {
        addChild("World")
        addChild("!!!")
    }

    println(root)
}

/*
Note
 T: Number로 지정

TODO
 바운드와 제약
 */