package Sprint1;

public class Task_1 {
    public static void main(String[] args) {
 M1();
    }

    public static void M1(){
        // Prime Program
    System.out.println("Working");
  
    int n = 7 ;
    int count = 0 ;
    
    for (int i = 2;i<n;i++) {
    	
    	if(n%2==0) {
    		count = count + 1 ;
    	}
    }
    	if(count == 0) {
    		System.out.println("Prime");
    	}
    	else {
    		System.out.println("Not Prime");
    	}
    }





    }

