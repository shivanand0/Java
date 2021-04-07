public class varargs {
    
    public static void add(int ...arr){ //parameters passed as an array
        System.out.println("Number of arguments: " + arr.length); 
        int sum = 0;

        for(int i: arr){
            sum += i;
        }
        System.out.println("Sum: "+ sum);
    }
    
    public static void main(String[] args) {
        // Calling the varargs method with different number 
        // of parameters 
        add(100,100,100,50,50);         // one parameter 
        add(1, 2, 3);  // four parameters 
        add(2,2);            // no parameter 
    }
}
