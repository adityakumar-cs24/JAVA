import java.util.*;
class Itr{
    // Creating An Data Structure
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // Creating A Iterator
        // Iterator iterator = list.iterator();
        // while(ite)

        ListIterator ListIterator = list.listIterator();
        System.out.println("IteratorList forword Traversal: ->");

        while(ListIterator.hasNext()){
            System.out.print(ListIterator.next());
        }

        System.out.print("Iterator Backword Traversal:");
        while(ListIterator.hasPrevious()){
            System.out.print(ListIterator.previous() + " ");
        }
    }
}