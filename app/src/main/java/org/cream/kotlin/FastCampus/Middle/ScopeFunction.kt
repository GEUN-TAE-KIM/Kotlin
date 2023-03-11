package org.cream.kotlin.FastCampus.Middle

fun main() {

    // let, run, apply, also, with

    // 1. let
    // 수신객체.let { it ->
    //
    // 마지막줄 // let
    // }
    val a = 3
    a.let { }
    val user = User("김근태", 10, true)

    val age = user.let {
        user.age
    }
    println(age)


    // 2. run
    // 수신객체.run { this ->
    //
    // }
    val kid = User("sd", 5, false)
    val kidAge = kid.run {
        this.age
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply { this ->
    //
    // }
    // return 값이 수신 객체
    val kidName = kid.apply {
        name
    }
    println(kidName)

    val female = User("qw", 25, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)


    // 4. also
    // 수신객체.also { it -> // local var
    //
    // } // return 수신객체 (자기 자신)
    val male = User("wq", 25, false, true)
    val maleValue = male.also {
        it.name
    }
    println(maleValue)
    println(maleValue.name)


    // 5. with
    // with(수신객체) { this
    //  ---
    //  마지막 줄
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
    println(result)


}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean,
    var hasGlasses: Boolean = true,
)
