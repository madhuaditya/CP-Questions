import java.util.Scanner;

public class OOPs_Lab { // a program in c++ to take address as a charter as an array
    public static class  Employ{
        char[] name = new char[100];
        char[] add = new char[100];
        int age;
        float salary;
        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }



        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAdd() {
            StringBuilder sb =  new StringBuilder("");
            for (char ele :add){
                sb.append(ele);
            }
            return sb.toString();
        }


        public void setAdd(String add) {
            this.add = add.toCharArray() ;
        }




        public String getName() {
            StringBuilder sb =  new StringBuilder("");
            for (char ele : name ){
                sb.append(ele);
            }
            return sb.toString();
        }

        public void setName(String name) {
            this.name = name.toCharArray();
        }

    }

    public static void interEmployData(Employ emp1){
//        Employ emp1 = new Employ();
//        Employ emp1 = new Employ();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Employ Name: ");
        String name = sc.nextLine();
        emp1.setName(name);
        System.out.println("Please Enter Employ Address: ");

        String add = sc.nextLine();
        emp1.setAdd(add);
        System.out.println("Please Enter Employ age: ");

        int age = sc.nextInt();
        emp1.setAge(age);
        System.out.println("Please Enter Employ Salary: ");

        float sal = sc.nextFloat();
        emp1.setSalary(sal);
    }
    public static void displayEmployData( Employ emp){
        System.out.println("Please Enter Employ Name: "+ emp.getName());
        System.out.println("Please Enter Employ Address: " + emp.getAdd());
        System.out.println("Please Enter Employ age: "+ emp.age);
        System.out.println("Please Enter Employ Salary: "+emp.salary);
    }
    public static void main(String[] args) {
//      char [] lasbian = new char[10];
//      String str = "madhu";
//      lasbian = str.toCharArray();
//        for (char ele: lasbian
//             ) {
//            System.out.print(ele);
////            System.out.println();
//        }
      Employ emp1= new Employ();
      interEmployData(emp1);
      displayEmployData(emp1);

    }
}
