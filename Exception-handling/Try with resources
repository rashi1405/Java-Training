import java.io.FileOutputStream;   

public class TryWithResources {  

public static void main(String args[]){ 

    try(FileOutputStream fileOutputStream =newFileOutputStream("/java7-new-features/src/abc.txt")){      
    
    String msg = "Welcome to javaTpoint!";   
    
    byte byteArray[] = msg.getBytes();
   
    fileOutputStream.write(byteArray);  
    
    System.out.println("Message written to file successfuly!");      
    
    }
    
    catch(Exception exception){
    
       System.out.println(exception);  
       
    }      
    
  }      
  
} 
