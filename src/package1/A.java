package package1;

public class A {
    
    public static void main(String[] args) {
        
        int x[] = new int[3];
        
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        
        m(x);
        System.out.println(x);
        
    }
    
    public static void m(int x[]){
        
        System.out.println(x[0] + x[1] + x[2]);
        
    }
    
}

//------------------------------------------------------------------------------


