package lambdaexpressions;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface FuncInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    public void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 