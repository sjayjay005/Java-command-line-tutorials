import java.util.Scanner;
public class forLoopPtomer {

    public static void main(String[] args){
        int count = 0;
        int stop = 101;
        System.out.println("Click any key until the 100% full");
        for( int i = 0; i < stop; ++i ){
            Scanner kb = new Scanner(System.in);
            String var = kb.nextLine();
            System.out.println("Loading ... "+ i +" %");
        }

    }
}
