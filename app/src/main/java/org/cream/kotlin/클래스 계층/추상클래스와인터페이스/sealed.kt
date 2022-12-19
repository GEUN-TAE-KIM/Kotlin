package org.cream.kotlin.클래스

/*
Note
 sealed 클래스는 자기 자신이 추상 클래스
 자신을 상속받는 여러 서브 클래스들을 가질 수 있음
 이를 사용하면 enum 클래스와 달리 상속을 지원하기 때문에, 상속을 활용한 풍부한 동작을 구현할 수 있음

TODO
 쉴드 클래스
 */
sealed class Result {
    class Success(val value: Any) : Result() {}
    class Error(val message: String) : Result() {}
}