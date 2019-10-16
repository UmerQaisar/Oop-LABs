public class Main{
    public static void main(String[] argu){
        Author author1 = new Author();
        author1.Author("Attique" , "Att@gmail.com");
        author1.display();
        Author author2 = new Author();
        author2.Author("Waqar" , "wiki@gmail.com");
        author2.display();
        Author author3 = new Author();
        author1.Author("Attique" , "Att@gmail.com");
        author1.display();
        Author author4 = new Author();
        author2.Author("Waqar" , "wiki@gmail.com");
        author2.display();
        
        
        Book[] book = new Book[4];
        
        book[0] = new Book() ;
        book[0].setTitle("SameersJudgment");
        book[0].setAuthor(author1);
        book[0].setPrice(1500);
        book[0].setQuantity(200);
        
        book[1] = new Book() ;
        book[1].setTitle("Hasil");
        book[1].setAuthor(author2);
        book[1].setPrice(1500);
        book[1].setQuantity(200);
            
        book[2] = new Book() ;
        book[2].Book("La Hasil", author3 , 1200.0, 180) ;
        
        book[3] = new Book() ;
        book[3].Book("Alif", author4 , 1200.0, 180) ;

        for(int i=0 ; i<4 ; i++){
            book[i].display();
        }
        
        System.out.println("--------------------------------------");
        
        
        
        
        
        
    }
}