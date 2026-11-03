package Singleton_Pattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {


        //Singleton pattern is used when we have to create 1 object in the whole project and
        // reuse it again n again

        SingleObject_Eager object1 = SingleObject_Eager.getInstance();
        object1.message();
        System.out.print(object1.hashCode());

        SingleObject_Eager object2= SingleObject_Eager.getInstance();
        object2.message();
        System.out.print(object2.hashCode());
    }
}
