import java.util.*;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        // adding another list 
        LinkedList<Integer> l2=new LinkedList<>();

        // adding  5 element to the list l1
        l1.add(0,5);
        l1.add(1,6);
        l1.add(2,4);
        l1.add(3,7);
      

        // adding the elements to the list l2
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);


        // adding the elements of list l2 to list l1;
        l1.addAll(l2);
            l1.addFirst(1);
        l1.addLast(8);
        


        // function to check whether the elements is present in list or not
        System.out.println(l1.contains(6));

        // finding the index of specific elements 
       System.out.println( l1.indexOf(7));


        // printing the arraylist element by using loop
        System.out.println("The elements of List L1 are:");
        for(int i=0;i<l1.size();i++){

            System.out.print("\t"+l1.get(i));
        }
      System.out.println();
        
        // printing the arraylist element by using loop
          System.out.println("The elements of List L2 are:");
        for(int i=0;i<l2.size();i++){

            System.out.print("\t"+l2.get(i));
          



}

    }
    
}
