# 17일차 (2024-05-29)

## Java

### 가비지 컬렉션(Garbage Collection, GC)

---

> STW (Stop The World) GC를 수행하기 위해 JVM이 프로그램 실행을 멈추는 현상을 의미.
GC가 작동하는 동안 GC 관련 Thread를 제외한 모든 Thread는 멈추게 되어 서비스 이용에 차질이 생길
수 있다. 따라서 이 시간을 최소화 시키는 것이 쟁점이다.

### JVM

---
