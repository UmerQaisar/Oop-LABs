public class Book{
    String title = "" ;
    Author author ;
    double price = 00 ;
    int quantity = 00 ;
    
    public void Book(String title, Author author, double price, int quantity){
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    Book(){
    }
    
    public void setTitle(String title){
        this.title = title ;
    }
    
    public void setAuthor(Author athr){
        
        this.author = athr ;
    }
    
    public void setPrice(double prc){
        this.price = prc ;
    }
    
    public void setQuantity(int qntty){
        this.quantity = qntty ;
    }

    public String getTitle(){
        return title ;
    }

    public Author getAuthor(){
        return author ;
    }
    
    public double getPrice(){
        return price ;
    }
    
    public int getQuantity(){
        return quantity ;
    }
    
    public void display(){
        System.out.println("Title : " + this.title + "   Author Name : " + this.author.getName() + "   Author Email : " + this.author.getEmail()+ "   Price : " + this.price + "   Quantity : " + quantity );
    }
    

}