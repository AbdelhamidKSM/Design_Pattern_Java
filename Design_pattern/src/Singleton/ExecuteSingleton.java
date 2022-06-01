package Singleton;

public class ExecuteSingleton {
    public static void main(String[] args) {
        /* case without Singleton*/
       /* Single single = new Single();
        Single single2 = new Single();
        single.printer();
        System.out.println("*************************4");
        single2.printer();*/
        /* case with Singleton*/
        Single single1 = Single.getSingleInstance();
        single1.printer();
        System.out.println("***********************************************8");
        Single single2 = Single.getSingleInstance();
        single2.printer();
    }
}
