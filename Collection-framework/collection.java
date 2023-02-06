import java.io.*;
import java.util.*;
  
class collection {
  
    public static void main(String[] args)
    {
        // Declaration

        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector<Integer>();
        Hashtable<Integer, String> ht = new Hashtable();
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Stack<String> stack = new Stack<String>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        HashSet<String> hs = new HashSet<String>();
  
        //element adding
  
        v.addElement(1);
        v.addElement(2);
  
        ht.put(1, "rashi");
        ht.put(2, "jaiswal");

        for (int i = 1; i <= 5; i++)
            al.add(i);

        for (int i = 1; i <= 6; i++)
            ll.add(i);
    
        stack.push("my");
        stack.push("new");
        stack.push("stack");

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        hs.add("MY");
        hs.add("HASH");
        hs.add("SET");

        //display

        System.out.println(arr[2]);

        System.out.println(v.elementAt(0));

        System.out.print(ht.get(1));
        System.out.println(ht.get(2));

        System.out.println(al);

        System.out.println(ll);

        Iterator<String> itr = stack.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println(pQueue.peek());
  
        Iterator<String> it = hs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

      
        //removal
      
        v.remove(1);
        al.remove(3);
        ll.remove(2);
        stack.pop();
        pQueue.poll();

      
        //after deletion 

        System.out.println(v);
        System.out.println(al);
        System.out.println(ll);

        itr = stack.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println(pQueue.peek());
       
    }
}
