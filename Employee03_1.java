class Employee03_1 {
    String name;
    int age;
    void setName(String n){
        name = n;
    }
    void addAge(){
        age++;
    }
    String getInfo(){
        String employeeData = "shimei" + name + "nenrei" + age;
        return employeeData;
    }
}

