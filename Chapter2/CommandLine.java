import java.util.Scanner;
public class CommandLine {

    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        String name = args[0];
        String surname = args[1];
        String age = args[2];

        System.out.println("Hello, your name is "+name+" "+surname+" you are:"+age+" of age");
        System.out.println("Please Press exit");
        String exit = keyboard.nextLine();
        boolean correct = false;
        while( correct = false ){
            if (exit != "exit" || exit != "Exit" || exit != "Exit") {
                System.out.println("Please type exit");
                correct = true;

            } else {
                System.out.println("Bye ...");
            }
        }
    }
}