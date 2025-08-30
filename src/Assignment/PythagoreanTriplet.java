package Assignment;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        int x = a * a;
        int y = b * b;
        int z = c * c;

        if (x + y == z || x + z == y || y + z == x) {
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean Triplet.");
        }
        else {
            System.out.println(a + ", " + b + ", " + c + " do NOT form a Pythagorean Triplet.");
        }
    }
}
