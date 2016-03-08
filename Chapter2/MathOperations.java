import java.util.Scanner;
public class MathOperations {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int girls, boys, people;
        girls = 6;
        boys = 3;
        people = girls + boys;
        System.out.println(people);


        //Try this one
        int girls1, boys1, people1;
        girls1 = 11;
        boys1 = 3;
        people1 = girls1 / boys1;
        System.out.println(people1);

        // Do you see thea 11/3 is 3, why, its because of the java devide it is returning a type (int)
        //To solve this do this

        double girls2, boys2, people2;
        girls2 = 11;
        boys2 = 3;
        people2 = girls2 / boys2;
        System.out.println(people2);

        //The last one is called modulus % and returns the remainder

        double girls3, boys3, people3;
        girls3 = 11;
        boys3 = 3;
        people3 = girls3 % boys3;
        System.out.println(people3);
      //  So whatever is left over is 2. hence the modulus is 2
    }
}
