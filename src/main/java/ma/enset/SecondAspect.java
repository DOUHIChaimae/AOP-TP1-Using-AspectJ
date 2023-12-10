package ma.enset;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* ma.enset.tests.Application.main(..))")
    public void pc1() {
    }

    //@Before("pc1()")
    public void beforeMaine() {
        System.out.println("******************************");
        System.out.println("Before main from SecondAspect");
        System.out.println("******************************");
    }

    //@After("pc1()")
    public void afterMaine() {
        System.out.println("****************************");
        System.out.println("After main from SecondAspect");
        System.out.println("****************************");
    }

    @Around("pc1()")
    public void aroundMaine(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("******************************");
        System.out.println("Before main from SecondAspect");
        System.out.println("******************************");
        //Exécuter la méthode main
        proceedingJoinPoint.proceed();
        System.out.println("****************************");
        System.out.println("After main from SecondAspect");
        System.out.println("****************************");
    }


}
