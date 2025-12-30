package OOPS;

public class Demo {
    int a = 10;
    String b = "Ankush";

    void Show(){
        System.out.println(a + " " + b);
    }
}
class Test{
    public static void main(String[] args) {
        Demo r = new Demo();
        r.Show();
    }
}
