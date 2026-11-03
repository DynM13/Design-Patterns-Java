package Singleton_Pattern;

public class SingleObject_Eager {
    private static SingleObject_Eager instance= new SingleObject_Eager();   // Eager way of creating Singleton obj  || another is Lazy way in which we create obj using a method so when method is called then only the obj is created

    private SingleObject_Eager(){}   // IMP private constructor so that this class cannot be instantiated

    public static SingleObject_Eager getInstance(){  // Static because if non-static used then we need obj to call it
        return instance;
    }

    public void message(){
        System.out.println("Hello How are You");
    }
}
