import javax.swing.*;

public class Exercise06_1 {
    public static void main (String[] args){
        try {
            int val1 = Integer.parseInt(args[0]);
            int val2 = Integer.parseInt(args[1]);
            System.out.println( args[0] + "+" + args[1] + "=" + (val1 + val2) );
        }catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("引数が不正ですa");
        } catch(NumberFormatException ex) {
            System.out.println("引数が不正ですb");
        }
    }
}
