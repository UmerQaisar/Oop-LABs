public class Main{
    public static void main(String[] argu){
        Book[] book = new Book[4];
        
        book[0] = new Book() ;
        book[0].setTitle("SameersJudgment");
        book[0].setAuthor("Sameer");
        book[0].setPrice(1500);
        book[0].setQuantity(200);
        
        book[1] = new Book() ;
        book[1].setTitle("Hasil");
        book[1].setAuthor("UAhmad");
        book[1].setPrice(1500);
        book[1].setQuantity(200);
            
        book[2] = new Book() ;
        book[2].Book("La Hasil", "UAhmad" , 1200.0, 180) ;
        
        book[3] = new Book() ;
        book[3].Book("Alif", "UAhmad" , 1200.0, 180) ;

        for(int i=0 ; i<4 ; i++){
            book[i].display();
        }
        
        
        
        
    }
}