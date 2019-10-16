import java.util.* ;

public class Main{
    public static void main(String[] argu) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A") ;
        al.add("B") ;
        al.add("C") ;
        al.add("D") ;
        al.add("E") ;
        al.add("F") ;
        al.add("G") ;
        al.add("H") ;
        //We have list iterator because hasprevious method only exists in it.
        //Iterator it = al.iterator();
        ListIterator<String> it = al.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("List After replacing Strings");

        al.set(0, "A+") ;
        al.set(1, "B+") ;
        al.set(2, "C+") ;
        al.set(3, "D+") ;
        al.set(4, "E+") ;
        al.set(5, "F+") ;
        al.set(6, "G+") ;
        al.set(7, "H+") ;

//         it = al.iterator();
        it = al.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("List in Reverse order");

        ListIterator<String> lit = al.listIterator() ;
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }



        
    }
}
