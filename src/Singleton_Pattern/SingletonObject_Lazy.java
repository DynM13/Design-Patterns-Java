package Singleton_Pattern;

public class SingletonObject_Lazy {

    private static volatile SingletonObject_Lazy singletonObjectLazy;

    private SingletonObject_Lazy(){}

    public static SingletonObject_Lazy getLazyObj(){

        if(singletonObjectLazy ==null){

            synchronized (SingletonObject_Lazy.class){   //Syn because Lazy method is not thread safe sso now only 1 thread can access it at a time
                if(singletonObjectLazy==null){
                    singletonObjectLazy = new SingletonObject_Lazy();
                }
            }
        }
        return singletonObjectLazy;
    }
}
