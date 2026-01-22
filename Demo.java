// public class Demo {
//     int a;
//      int b;
//        void getData() {
//             a = 10;
//             b = 20;
//         }
//         void showData() {
//             System.out.println("a :"+a + " "+ "b: "+b);
//         }
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.getData();
//       obj.showData();
//     }
// }
class Demo{
String name;
int age ;
Double salary;
String cname;
 Demo(String name1, int age1, Double salary1, String cname1){
    name = name1;
    age = age1;
    salary = salary1;
    cname = cname1;
 }
 void display() {
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("salary :"+salary);
    System.out.println("Company Name:"+cname);
 }
    public static void main(String[] args) {
        Demo emp1 = new Demo("Daksh",20,454.45,"Google");
        emp1.display();
        
    }
}
