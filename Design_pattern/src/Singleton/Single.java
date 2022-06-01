package Singleton;

import java.util.Arrays;
import java.util.List;

public class Single {
    private  String [] hellos = {"Hello","Assalamo Alikoum","Bonjour"};
    private List<String> list = Arrays.asList(hellos);
    private static  Single singleInstance;

/*  we can implement the Singleton to have only one instance from this class by using private constructor in the public method bellow */
    public static Single getSingleInstance() {
        if (singleInstance ==null) {
            singleInstance= new Single();
        }
        return singleInstance;
    }

    private Single() {
        System.out.println("Object Created ");
        System.out.println(this.hashCode());
    }

  /* without Singleton
   public Single() {
        System.out.println("Object Created ");
        System.out.println(this.hashCode());
    }*/

    public void printer (){
        list.stream().forEach(s -> System.out.println(s));
    }
}
