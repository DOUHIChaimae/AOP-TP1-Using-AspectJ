package ma.enset;

public aspect FirstAspect {

    pointcut pc1(): execution(* tests.Application.main(..));

    /*before(): pc1(){
        System.out.println("Before main from Aspect with AspectJ Syntax");
    }

    after(): pc1(){
        System.out.println("After from Aspect with AspectJ Syntax");
    }*/

    void around(): pc1(){
        System.out.println("Before main from FirstAspect with AspectJ Syntax");
        proceed();
        System.out.println("After from FirstAspect with AspectJ Syntax");
    }
}
