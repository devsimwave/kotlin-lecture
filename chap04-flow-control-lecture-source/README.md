# chap04-flow-control-lecture-source

## 학습 내용

### 1. if 조건문
- if문 기본 형태: 조건식이 `true`일 때 블록 실행
- 단일 조건: `if(조건식) { 실행문 }`
- if-else: `if(조건식) { } else { }`
- if-else if 체인: 다중 조건 처리
- 논리 연산자 활용: `&&`, `||` 등으로 복합 조건 작성
- `in` 연산자와 `until`: 범위 검사에 활용 (`score in 80 until 90`)
- 메소드 결과를 조건식에 사용 가능 (예: `greet.startsWith("Hello")`)

### 2. if 식
- Kotlin의 if는 표현식(expression)으로 사용 가능
- 변수에 조건문 결과를 직접 할당: `var bigger = if(num1 > num2) num1 else num2`
- 블록 형태로도 사용 가능: 마지막 표현식이 반환값
- if-else if 체인도 식으로 활용하여 변수에 할당 가능
- Java의 삼항 연산자(`?:`) 대신 if 식 사용

### 3. when 표현식
- Java의 switch문과 유사하지만 더 강력한 기능 제공
- 기본 형태: `when(값) { 조건 -> 실행문 }`
- 연산 처리 가능: 조건에 `1.inc()` 같은 연산 사용
- 블록 형태: 여러 문장 실행 시 `{ }` 사용
- 반환값: 변수에 when 표현식 결과 할당 가능
- 다중 조건: `,`로 여러 조건 나열 (예: `"A+", "a+", "A-"`)
- 타입 검사: `is` 연산자로 타입 일치 여부 확인
- 범위 검사: `in` 연산자와 범위 객체(`..`) 활용
- 조건 없는 when: `when { }` 형태로 Boolean 표현식 평가
- `else`: 모든 조건에 해당하지 않을 때 실행

### 4. while과 do-while 반복문
- while문: 조건이 `true`인 동안 반복 실행
  - `while(조건식) { 실행문 }`
  - 조건을 먼저 검사 후 실행
- do-while문: 최소 1회는 무조건 실행
  - `do { 실행문 } while(조건식)`
  - 실행 후 조건 검사

### 5. for 반복문과 범위
- 범위 연산자 `..`:
  - `1..10`: 1부터 10까지 (양 끝 포함)
  - `range.first`, `range.last`: 범위의 시작과 끝 값
- until: 마지막 값 제외
  - `1 until 10`: 1부터 9까지
  - 배열 인덱스 순회에 유용 (`0 until arr.size`)
- downTo: 역순 범위 생성
  - `10 downTo 1`: 10부터 1까지 감소
- reversed(): 범위 역순 정렬
  - `range.reversed()`: 기존 범위를 역순으로
- step: 증감 단위 지정
  - `1..10 step 2`: 1, 3, 5, 7, 9
  - `10.downTo(1).step(2)`: 메소드 체이닝 형태로도 사용 가능
- 문자 범위:
  - `'a'..'z'`: 알파벳 a부터 z까지
  - `'가'..'나'`: 한글 가부터 나까지
- 배열 인덱스 순회:
  - `0..(arr.size - 1)` 또는 `0 until arr.size`

### 6. 중첩 반복문
- 반복문 안에 다른 반복문 사용
- 구구단 출력: 2중 for문 활용 (`for(i in 2..9) { for(j in 1..9) { } }`)
- 별 모양 출력: 외부 루프 변수를 내부 루프 범위로 활용
- 각 반복문은 독립적인 범위와 변수 사용

### 7. 컬렉션 순회
- 배열: `for(i in arr) { }`
- 리스트: `for(item in list) { }`
- 맵: `for(pair in map) { }` (Pair 객체로 순회)
- 셋: `for(e in set) { }`
- 문자열: `for(c in str) { }` (각 문자 순회)
- `in` 연산자로 모든 순회 가능한 객체(Iterable) 순회

### 8. break와 continue
- break:
  - 반복문 즉시 종료
  - 무한 루프(`while(true)`) 탈출에 활용
  - 중첩 반복문에서는 가장 가까운 반복문만 탈출
  - 사용자 입력 처리 등에 활용 가능
- continue:
  - 현재 반복을 건너뛰고 다음 반복으로
  - 조건에 맞지 않는 경우 처리 생략 시 사용
  - 예: 짝수단만 출력 (`if(i % 2 != 0) continue`)