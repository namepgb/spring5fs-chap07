[![JIHO's GitHub stats](https://github-readme-stats.vercel.app/api?username=namepgb&include_all_commits=true&theme=nord&hide_border=true&count_private=true)](https://github.com/namepgb/github-readme-stats)

## Preview
`초보 웹 개발자를 위한 스프링 5 프로그래밍 입문` 서적에서 안내된 예제 프로젝트를 생성하고 `Spring`을 학습합니다.
> 
> 이 프로젝트의 개발 환경
>
> <img src="https://img.shields.io/badge/IntelliJ IDEA:2020.3 Ultimate Edition-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
> <img src="https://img.shields.io/badge/OpenJDK:12-437291?style=for-the-badge&logo=openjdk&logoColor=white">
> <img src="https://img.shields.io/badge/Spring:5.0.2.RELEASE-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
> <img src="https://img.shields.io/badge/Gradle:7.3-02303A?style=for-the-badge&logo=gradle&logoColor=white">

> 이 프로젝트에서는 다음 내용을 포함합니다.
> * Chapter 7 AOP 프로그래밍
>   * 프록시와 AOP
>     * AOP
>     * Advice 종류 
>   * 스프링 AOP 구현
>     * @Aspect, @Pointcut, @Around를 이용한 AOP 구현
>     * ProceedingJoinPoint의 메소드
>   * 프록시 생성 방식
>     * execution 명시자 표현식
>     * Advice 적용 순서
>     * @Around의 Pointcut 설정과 @Pointcut 재사용 

## sp5-chap07/src/main/java/chap07_a
> * `프록시`와 `AOP`의 개념을 이해하고 코드를 작성해 테스트합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 07. AOP 프로그래밍(Aspect Oriented Programming)](https://namepgb.tistory.com/258)

## sp5-chap06/src/main/java/chap07_b
> * `스프링의 AOP`를 구현하고 테스트합니다.
> * `@Aspect`와 `@Pointcut` 그리고 `@Around` 어노테이션 사용법을 학습합니다.
> * `@EnableAspectJAutoProxy` 어노테이션으로 스프링의 AOP를 활성화합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 07. AOP 프로그래밍(Aspect Oriented Programming)](https://namepgb.tistory.com/258)

## sp5-chap06/src/main/java/chap07_c
> * `스프링의 프록시 객체` 생성 방식을 학습합니다.
> * `Execution 명시자` 표현식을 학습합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 07. AOP 프로그래밍(Aspect Oriented Programming)](https://namepgb.tistory.com/258)

## sp5-chap06/src/main/java/chap07_d
> * 하나의 `Pointcut`에서 여러 개의 `Advice`를 등록합니다.
> * `Advice`의 적용 순서를 제어하기 위해 `@Order`를 사용합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 07. AOP 프로그래밍(Aspect Oriented Programming)](https://namepgb.tistory.com/258)
