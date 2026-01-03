# chap02-variable-lecture-source

## 학습 내용

### 1. 변수 선언
- 선언 형식: `val(var) 변수명 [: 타입] = 값`
- 선언 후 초기화: 타입 명시 필수 (`var 변수명: 타입`)
- 선언과 동시에 초기화: 타입 생략 가능 (타입 추론)

### 2. 원시 문자열과 문자열 템플릿
- 일반 문자열: 이스케이프 문자(`\n`, `\t`) 사용
- 원시 문자열(RawString): `"""`로 작성한 모습 그대로 출력
- 문자열 템플릿: `$변수명`으로 변수 값 바로 적용
- 표현식 사용: `${표현식}` 형태로 연산 및 메소드 호출 가능

### 3. 기본 타입의 최소/최대값
- 정수형: `Byte`, `Short`, `Int`, `Long`
- 실수형: `Float`, `Double`
- 문자형: `Char` (`.code`로 숫자 값 확인)
- 논리형: `Boolean`

### 4. 타입 변환
- Kotlin은 Java와 달리 자동 형변환 불가, 명시적 형변환 필요
- 변환 메소드: `toByte()`, `toShort()`, `toInt()`, `toLong()`, `toFloat()`, `toDouble()`, `toChar()`
- 문자열 변환: `toInt()`, `toDouble()` 등으로 문자열을 기본 타입으로 변환
- 기본 타입을 문자열로: `toString()` 사용
- Null-safe 변환: `toIntOrNull()` 등으로 변환 실패 시 null 반환

### 5. Any 타입
- 모든 타입의 값을 대입할 수 있는 최상위 타입
- 초기화 이후에도 어떤 종류의 값이든 대입 가능
- 배열에서 와일드카드처럼 사용 가능: `Array<Any>`

### 6. Nullable 타입
- Kotlin은 null-safety 기능 내장으로 NPE 방지
- 기본적으로 null 대입 불가
- Nullable 타입: 타입 뒤에 `?` 선언 (`Int?`, `String?`)
- Null 처리 방법:
  - `let` 함수: null이 아닌 경우에만 코드 블록 실행
  - 안전 호출 연산자(Safe-call Operator) `?.`: null이 아닐 때만 멤버 접근, null이면 null 반환
  - 엘비스 (Elvis) 연산자 `?:`: null일 경우 기본값 제공
  - Non-null 단언 연산자 `!!`: null이 아님을 보장 (권장하지 않음)
  - Null 반환 메소드: `toIntOrNull()` 등

### 7. 배열
- Java와 달리 `new` 연산자 사용 안 함
- 배열 생성: `Array<타입>(크기) {초기값}`
- 타입 추론 가능
- `arrayOf()` 함수로 배열 생성 (Wrapper 타입, null 허용)
- Primitive 타입 배열: `intArrayOf()`, `charArrayOf()` 등 (null 허용 안 됨)
- 배열 변환: `toIntArray()` 등으로 Wrapper 타입을 Primitive 타입으로 변환

### 8. 상수와 읽기 전용 변수
- `var`: variable (mutable - 변경 가능)
- `val`: value (immutable - 변경 불가능)
  - 참조값 변경 불가, 객체 내부 속성값은 변경 가능
  - 전역 및 지역 변수 모두 사용 가능
  - 다양한 데이터 타입 사용 가능
- `const val`: 상수 (Java의 static final과 유사)
  - 컴파일 시에 값이 결정
  - 기본 데이터 타입과 String만 가능
  - 전역 변수로만 선언 가능 (메소드나 클래스 밖)
  - Kotlin에는 static 키워드가 없음