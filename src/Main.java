import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)  {
        Client fedor = new Client("fedor", 3526.4,"35608164252");
        Client stepan = new Client("stepan", 546.2, "39585467821");
       Client vasja = new Client("Vasja", 253.8, "3958476214");
        double difference = fedor.difference(stepan,vasja);
        System.out.println(difference);
        System.out.println("You just got some amount!");


    }
}



        //Car honda = new Car();
        //honda.move();



       // Transport car = new Transport();
       // car.setName("Honda");
       // System.out.println("The name of vehicle is " + car.getName());
       //car.setSeats(4);
       // System.out.println("Number of seats of this vehicle is " + car.getSeats());






       //Cat cat = new Cat();
      // cat.setName("stefan");
       //cat.setAge(11);

       // System.out.println(cat.getAge());
        //Wolf wolf = new Wolf();
        //wolf.action();
        //wolf.say();


       // Dog dog = new Dog();
       // dog.say();












