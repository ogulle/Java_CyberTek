package day47_Abstraction;

abstract class A{
    public abstract void method1();
    public void method2(){}
}

public class Abstract_VS_NonAbstract2 extends A{ //to override the abstract method of A

    @Override
    public void method1(){}
}

abstract class B extends A{ //optional to override the abstract method of A
  //one abstract & one instance methods

  //public abstract void method1();
}

class C extends B{
    @Override
    public void method1() {

    }
}