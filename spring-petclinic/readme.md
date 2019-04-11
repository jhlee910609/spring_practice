# 스프링
> 전체적인 스프링 개념을 이해해본다.
---
# IoC(Inversion of Control)
> '역전의 제어'라고 부른다.
> '내가 사용할 의존성을 누군가 알아서 주겠지'라는 개념으로 이해
>
- 사용할 의존성의 타입(or 인터페이스)만 맞으면 어떤 것이든 상관없음
- 코드 테스트도 편함
- 특정 객체 반드시 주입하게 하여 필요한 객체 쉽게 사용 가능

```
class OwnerController {

	private OwnerRepository repo;
    
    // 생산자를 통해 객체 의존성 주입
    	public OnwerController(OwnerRepository repo){
    		this.repo = repo;
    	}
}
```
---

## IoC Container
> ApplicationContext (extends BeanFactory)
- 빈(bean)을 만들고 엮고, 제공해준다.
### 1. 빈 설정
- 이름 또는 ID
- 타입
- 스코프

---
## 빈(Bean)
> **IoC Container**가 관리하는 객체
### 1. 등록방법
##### 1.1. Component Scanning : IoC Controller 생성 시, 알아서 등록
	- @Component
	- @Service
	- @Controller
	- @Configuration
##### 1.2. 또는 직접 일일히 XML이나 자바 설정 파일에 등록
- 요즘은 자바로 Bean 등록하는 추세

---

#### 1.3. Bean 주입
- `@Autowired`사용 >> 선호
- `ApplicationContext`에서 직접 꺼내 사용

---

## 의존성 주입(Dependency Injection)
- 생성자
```
class OwnerController {

    private final OwnerRepository owners;
    
    public OwnerController(OwnerRepository clinicService) {
        this.owners = clinicService;
    }
}
```
- field
```
class OwnerController {
    @Autowired
    private OwnerRepository owners;
    
}
```
---
- setter

```
class OwnerController {

    private final OwnerRepository owners;
    
    @Autowired
    public void setOwners(OwnerRepository owners){
    	this.owners = owners;
    }
}
```
---
## AOP
> 흩어진 코드를 한 곳으로 모으자!

### AOP 구현 방법
- 컴파일 A.java --(AOP)--> A.class (AspectJ)
- 바이트코드 조작 A.java --> A.class --(AOP)--> 메모리(AspectJ)
- 프록시 패턴(스프링 AOP)
---





