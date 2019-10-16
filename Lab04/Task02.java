import java.util.* ;

public class Task02{
    public static void main(String argu[]) {
        
        // Task 01 
        
        String arr[] = new String[]{"A","B","C","D","E","F"} ;
        ArrayList<String> ts1 = new ArrayList<>() ;

        for(int i=0 ; i<arr.length ; i++){
            ts1.add(arr[i]) ;
        }

        for (String c : ts1) {
            System.out.println(c);
            
        } 
        // Task 02
        
        ArrayList<String> ts2 = new ArrayList<>() ;
        ts2.add("A") ;
        ts2.add("B") ;
        ts2.add("C") ;
        ts2.add("D") ;
        ts2.add("E") ;

        String arr2[] = new String[5] ;
        for (int i=0 ; i<arr2.length ; i++) {
            arr2[i] = ts2.get(i) ;   
        }
        for(int i=0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }
        

        // Task 03
        
        ArrayList<String> ts3 = new ArrayList<>() ;
        ts3.add("A") ;
        ts3.add("B") ;
        ts3.add("C") ;
        ts3.add("D") ;
        ts3.add("E") ;

        //A
        ts3.remove(1) ;
        System.out.println(ts3);
        //B
        Collections.reverse(ts3) ;
        System.out.println(ts3); 
        //C
        Collections.shuffle(ts3);
        System.out.println(ts3);
        //D
        ts3.set(0, "F") ;
        System.out.println(ts3);
        //E
        List<String> rolist = Collections.unmodifiableList(ts3) ;
        System.out.println(rolist);
        

        // Task 04
        
        List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));
        

        // Task 05
        
        List<String> ts5 = Arrays.asList("1 2 3 4 5 6 1 3 4".split(" "));
        System.out.println(list);
        System.out.println("max: " + Collections.max(ts5));
        System.out.println("min: " + Collections.min(ts5));
        

        // Task 06

        ArrayList<Integer> ts4 = new ArrayList<>() ;
        ts4.add(1) ;
        ts4.add(2) ;
        ts4.add(3) ;
        ts4.add(4) ;
        ts4.add(5) ;
        ts4.add(6) ;
        System.out.println("max: " + Collections.max(ts4));
        System.out.println("min: " + Collections.min(ts4));

    }
}