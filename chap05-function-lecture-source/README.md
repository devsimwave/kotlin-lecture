# chap05-function-lecture-source

## 학습 내용

### 1. 함수의 기본 정의
- 반환값이 없는 함수: `fun printHello() { println("Hello") }`
  - `return` 생략 가능
- 반환값이 있는 함수: `fun getHello(): String { return "Hello" }`
  - 반환 타입을 `:` 뒤에 명시
- 표현식을 이용한 함수 정의: `fun sum(a: Int, b: Int): Int = a + b`
  - 중괄호와 `return` 키워드 생략 가능
  - 대입되는 값에 따라 타입 추론이 가능하면 리턴 타입 생략 가능
- 조건문을 이용한 함수 정의: `fun getBigger(a: Int, b: Int): Int = if(a > b) a else b`
- when 표현식을 이용한 함수 정의: `fun getGrade(score: Int): String = when(score) { ... }`

### 2. 기본값 인자 (Default Argument)
- 인자를 생략하고 함수를 호출할 때 사용할 기본값 설정 가능
- 모든 매개변수에 기본값 적용: `fun sumWithDefault(a: Int = 10, b: Int = 20): Int`
  - `sumWithDefault()`: a=10, b=20 사용
  - `sumWithDefault(20)`: a=20, b=20 사용
  - `sumWithDefault(20, 30)`: a=20, b=30 사용
  - `sumWithDefault(b = 30)`: a=10, b=30 사용 (명명인자 활용)
- 일부 매개변수에만 기본값 적용: `fun sumWithDefault2(a: Int, b: Int = 20): Int`
  - 기본값이 없는 인자는 반드시 전달해야 함

### 3. 가변인자 (vararg)
- 인자값의 개수가 변동될 수 있는 매개변수
- `vararg` 키워드 사용: `fun sumWithVargs(vararg nums: Int): Int`
- 호출 예시:
  - `sumWithVargs(1, 2, 3, 4, 5)`
  - `sumWithVargs(1, 2, 3)`
- 전개 연산자(`*`): 배열을 가변인자로 전달할 때 사용
  - `sumWithVargs(*numList.toIntArray())`
  - 전개 연산자는 원시 타입의 배열을 활용한다는 의미
- 일반 매개변수와 함께 사용 가능: `fun wumWithVargsWithBase(base: Int, vararg nums: Int): Int`

### 4. 명명인자 (Named Argument)
- 매개변수의 이름과 인자값을 함께 전달하는 방식
- 인자값의 순서와 타입을 기억할 필요 없음
- 사용 예시:
  - `sayHelloTo(times=2, to="유관순", from="이순신")`: 순서 무관하게 전달
  - `sayHelloTo("이순신", "유관순", 3)`: 순서대로 전달
  - `sayHelloTo("이순신", times=2, to="유관순")`: 혼합 사용
- 주의: 명명인자 사용 후에는 이후 인자도 명명인자로 전달해야 함

### 5. 로컬 함수 (Local Function)
- 함수 내부에 정의하는 함수
- 복잡한 작업을 분할하여 여러 함수로 나눌 때 사용
- 함수 외부에서는 접근 불가능
- 사용 예시:
  ```kotlin
  fun outerFunc(target: String): String {
      fun localFunc(str: String): String {
          return "Hello from local $str"
      }
      return localFunc(target)
  }
  ```

### 6. 람다식 (Lambda Expression)
- 익명 함수의 형태로 화살표 표기법(`->`) 사용
- 기본 구성: `var 변수명: 람다식의 선언 자료형 = { 매개변수 -> 처리 내용 }`
- 전체 모습: `var plus: (Int, Int) -> Int = { x: Int, y: Int -> x + y }`
- 선언 자료형 생략: `var plus = { x: Int, y: Int -> x + y }`
- 매개변수 자료형 생략: `var plus: (Int, Int) -> Int = { x, y -> x + y }`
- `Unit` 타입: 반환값이 없는 경우 (Java의 `void`와 유사)
  - `var printHello: () -> Unit = { println("hello") }`
- `it` 키워드: 매개변수가 하나일 때 매개변수 이름 대신 사용
  - `var sayHelloTo: (String) -> Unit = { println("say hello to $it") }`
