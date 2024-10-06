package dz_1;

import com.google.gson.Gson;
public class App {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person1 = new Person("Diana", "Sabirova", 24);
        Person person2 = new Person("Viktoria", "Liksanova", 21);
        Person person3 = new Person("Vadim", "Pushev", 45);
        Person person4 = new Person("Diana", "Sabirova",24);


        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person4));
        System.out.println(person1.hashCode());
        System.out.println(person1);

        Gson gson = new Gson();

        String json1 = gson.toJson(person1);
        Person read1 = gson.fromJson(json1, Person.class);
        System.out.println(read1.firstName);


        String json3 = gson.toJson(person3);
        Person read3 = gson.fromJson(json3, Person.class);
        System.out.println(read3.firstName);


    }


}