public class Demo {
    int a;
     int b;
       void getData() {
            a = 10;
            b = 20;
        }
        void showData() {
            System.out.println("a :"+a + " "+ "b: "+b);
        }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.getData();
      obj.showData();
    }
}