public class Execise04_4 {
    public static  void main(String[] args){
        Employee04_4[] empArray;
        empArray = new Employee04_4[3];
        empArray[0] = new Sales04_4("100200","豊洲太郎",5);
        empArray[1] = new SE04_4("300100", "田中二郎","DB");
        empArray[2] = new Staff04_4("50060", "舟場","経理");

        for(int i = 0; i < 3; i++) {
            System.out.println("-------------------------------------------");
            empArray[i].printInfo();
        }
    }
}
