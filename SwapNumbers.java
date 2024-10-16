class NumberSwap {
    int num1;
    int num2;

    
    public NumberSwap(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public void swapByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Inside swapByValue method:");
        System.out.println("Number 1: " + a);
        System.out.println("Number 2: " + b);
    }

    
    public void swapByReference(NumberSwap ns) {
        int temp = ns.num1;
        ns.num1 = ns.num2;
        ns.num2 = temp;
    }

    
    public void display() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}

public class SwapNumbers {
    public static void main(String[] args) {
        
        NumberSwap ns = new NumberSwap(10, 20);
        
        System.out.println("Before swapping (original values):");
        ns.display();
        
        System.out.println("\nSwapping using call by value:");
        ns.swapByValue(ns.num1, ns.num2);  
        System.out.println("After swapByValue method call (original unchanged):");
        ns.display();  

        System.out.println("\nSwapping using call by reference:");
        ns.swapByReference(ns);
        System.out.println("After swapByReference method call (original changed):");
        ns.display();      }
}