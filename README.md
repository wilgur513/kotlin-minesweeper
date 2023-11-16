# kotlin-minesweeper

## 기능 요구사항
지뢰 찾기를 변형한 프로그램을 구현한다.
- 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 지뢰는 눈에 잘 띄는 것으로 표기한다.
- 지뢰는 가급적 랜덤에 가깝게 배치한다.

## 실행 결과
```
높이를 입력하세요.
10

너비를 입력하세요.
10

지뢰는 몇 개인가요?
10

지뢰찾기 게임 시작
C C C * C C C * C C
C C * C * C C C C C
C C C C C C C C C C
C C C C C C C C C C
* C C C C C C C C C
C C C C C C * C C C
C C * C C C * C C C
C C C C C C * C C *
C C C C C C C C C C
C C C C C C C C C C
```

## 프로그래밍 요구사항
- 객체지향 생활 체조 원칙을 지키면서 프로그래밍한다.

객체지향 생활 체조 원칙
1. 한 메서드에 오직 한 단계의 들여쓰기만 한다.
2. else 예약어를 쓰지 않는다.
3. 모든 원시값과 문자열을 포장한다.
4. 한 줄에 점을 하나만 찍는다.
5. 줄여쓰지 않는다(축약 금지).
6. 모든 엔티티를 작게 유지한다.
7. 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
8. 일급 콜렉션을 쓴다.
9. 게터/세터/프로퍼티를 쓰지 않는다.

## 요구사항 분석
- [x] 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- [x] 높이의 값은 1 이상이어야 한다.
- [x] 너비의 값은 1 이상이어야 한다.
- [x] 높이와 너비를 가진 지뢰판을 생성한다.
- [x] 지뢰는 x, y 좌표를 가진다.
- [x] 지뢰찾기 게임은 지뢰판과 지뢰의 개수를 가진다.
- [x] 지뢰의 x, y 좌표는 높이와 너비의 범위 내에 있어야 한다.
- [x] 지뢰는 랜덤으로 배치한다.
- [x] 좌표가 주어졌을때, 해당 좌표에 지뢰가 있는지 확인할 수 있다.
- [x] 주어진 지뢰판과 지뢰의 개수를 가지고 지뢰를 배치한다.