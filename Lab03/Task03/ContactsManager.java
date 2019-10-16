import java.util.*;

public class ContactsManager{
    
    ArrayList<Contact> contactList = new ArrayList<>() ;
    
        public void addCotacts(Contact newContact){
            if (!(contactList.contains(newContact))){
        
            contactList.add(newContact) ;
    
            }
            else{
                System.out.println("Please use a diffrent contact, contact with the same name or phonenumbr already exists");
            }
        }
        
        public void searchContacts(String name){
           for(Contact c : contactList ){
                if(c.getName().equalsIgnoreCase(name)){
                    System.out.println(c.getName());
                    System.out.println(c.getPhoneNumber());
                }
           }
            
        }
        
        
        
        
       
        
        
}


