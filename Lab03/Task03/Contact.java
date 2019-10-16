public class Contact{
    public String name ;
    public String phoneNumber ;
    
    public void Contact(String name, String phoneNumber){
            this.name = name ;
            this.phoneNumber = phoneNumber ;
        }
        
    public void setName(String name){
        this.name = name ;

    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber ;      
    
    }
    
    public String getName(){
        return name ;
    }
    
    public String getPhoneNumber(){
        return phoneNumber ;
    }

}