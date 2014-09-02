package com.free.assist.framework;



import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingExample {
	@AfterThrowing(pointcut="execution(* com.free.assist.framework..*.*(..))",throwing="ex")
	public void doRecoveryActions(Throwable ex) {
		System.out.print(ex.getMessage());
	}
}