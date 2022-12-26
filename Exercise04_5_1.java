public class Exercise04_5_1 {
    public static void main (String[] args){
        if(args.length < 1){
            System.out.println("引数を設定してください");
        } else {
            //String s = args[0];
            System.out.println("文字列" + args[0]);
            System.out.println("文字数" + args[0].length());
            System.out.println("ｃの位置" + args[0].indexOf("c"));
            System.out.println("文字列はWelcomeか：" + args[0].equals("Welcome"));
        }
    }
}
