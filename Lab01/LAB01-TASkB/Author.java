public class Author{
    String name;
    String email;
    
    public void Author(String name, String email){
        this.name = name ;
        this.email = email ;
    }
    
    Author(){
    }
    
    public void setName(String name){
        this.name = name ;
    }
    
    public void setEmail(String Email){
        this.email = Email ;
    }
    
    public String getName(){
        return this.name ;
    }
    
    public String getEmial(){
        return this.email ;
    }
    
    public boolean updateEmail(String newEmail){
        this.email = newEmail ;
        return true ;
    }
    
    public void display(){
        System.out.println("Name : " + this.name + "   Email : " + this.email ) ;
    }
















}