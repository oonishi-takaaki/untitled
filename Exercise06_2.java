public class Exercise06_2 {
    public static void main(String[] args) {
        try {
            int val1 =Integer.parseInt(args[0]);
            int val2 =Integer.parseInt(args[1]);
            System.out.println(val1 + "/" + val2 + "=" + divide(val1,val2));
            System.out.println(val1 + "%" + val2 + "=" + remainder(val1,val2));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("不正な引数ですa");
        } catch (NumberFormatException ex) {
            System.out.println("不正な引数ですb");
        } catch (ArithmeticException ex) {
            System.out.println("不正な引数ですc");
        }
    }

    public static int divide(int val1, int val2) throws ArithmeticException {
        return val1/val2;
    }
    public static int remainder(int val1, int val2) throws ArithmeticException {
        return val1%val2;
    }

}
