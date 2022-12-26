public class Exercise04_5 {
    public static void main (String[] args){
        if(args.length < 1){
            System.out.println("引数を設定してください");
        } else {
            String s = args[0];
            System.out.println("文字列" + s);
            System.out.println("文字数" + s.length());
            System.out.println("ｃの位置" + s.indexOf("c"));
            System.out.println("文字列はWelcomeか：" + s.equals("Welcome"));
        }
    }
}
