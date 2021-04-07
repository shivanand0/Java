/*
--> The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter.
--> If we don't know how many argument we will have to pass in the method, varargs is the better approach, we don't have to provide overloaded methods.
*/
public class varargs {
    
        static void add(int ...arr){ //parameters passed as an array
        System.out.println("Number of parameters passed: " + arr.length); 
        int sum = 0;

        for(int i: arr){
            sum += i;
        }
        System.out.println("Sum: "+ sum);
    }
    
    public static void main(String[] args) {
        // Calling the varargs method with different number 
        // of parameters 
        add(100,100,100,50,50);         // five parameter 
        add(1, 2, 3);                   // three parameters 
        add(2,2);                       // two parameters
        add();                          //zero parameters
    }
}
