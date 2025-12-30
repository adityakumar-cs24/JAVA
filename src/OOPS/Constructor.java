package OOPS;

public class Constructor {
    int a; String name;
//    Constructor(){ // default constructor
//        a = 10; name = "Aditya";
//    }
    int x,y;
    Constructor(int a, int b){ // paramaterized
        x = a; y = b;
    }
    Constructor(int a, String b){
        System.out.println(a + " " + b);
    }
    void show(){
        System.out.println(x + " " + y);
    }

//    void show(){
//        System.out.println(a + " " + name);
//    }
}
class object{
    public static void main(String[] args) {
//        Constructor ref = new Constructor();
        Constructor ref = new Constructor(100, "Aditya");
        ref.show();
    }
}