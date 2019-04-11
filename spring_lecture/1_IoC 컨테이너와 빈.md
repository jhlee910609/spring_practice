# IoC 컨테이너와 빈(Bean)
---
## 제어의 역전(Inversion of Control)
- `의존성 주입(Dependency Injection)`이라고도 하며, 어떤 객체가 사용하는 의존 객체를 직접 만들어 사용하는게 아니라, **주입 받아 사용하는 방법**을 말함.
---
## IoC Container
- BeanFactory
- 애플리케이션 컴포넌트의 중앙 저장소
- **빈 설정 소스**로부터 빈 정의를 읽어 들이고, 빈을 구성하고 제공함

---
## Bean
> 스프링 IoC 컨테이너가 관리하는 객체

### 1. 장점
- 의존성 관리
- 스코프
	- 싱글톤 : 하나 (아무런 `Annotation`을 붙히지 않았다면...)
	- 프로토타입 : 매번 다른 객체
- 라이프사이클 인터페이스


### 2. 단점


---
### [ApplicationContext](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html)
- `BeanFactory` 상속 받아 있음
- 
