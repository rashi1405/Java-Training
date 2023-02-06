// Custom exception

class MyCustomException extends Exception  
{  
    public MyCustomException(String str){
        super(str);
    }
}
    
public class Main 
{  
     public static void main(String args[])  
    {  
        try  
        {  
            throw new MyCustomException("In try block created user defined exception");  
        }  
        catch (MyCustomException ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(ex.getMessage());  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  
