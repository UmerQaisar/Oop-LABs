public class Book{
    String title = "" ;
    String author = "";
    double price = 00 ;
    int quantity = 00 ;
    
    public void Book(String title, String author, double price, int quantity){
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
    
    public void setAuthor(String athr){
        
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

    public String getAuthor(){
        return author ;
    }
    
    public double getPrice(){
        return price ;
    }
    
    public int getQuantity(){
        return quantity ;
    }
    
    public void display(){
        System.out.println("Title : " + this.title + "   Author : " + this.author + "   Price : " + this.price + "   Quantity : " + quantity );
    }
    

}