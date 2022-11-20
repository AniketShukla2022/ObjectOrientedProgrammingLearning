class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        System.out.println("output of line A a = new A() is: \n");
        A a = new A();
        
        System.out.println("output of line Class.forName('B') is: \n");
        System.out.println("Need to add ClassNotFoundException because of this\n");
        Class.forName("B");
        
        System.out.println("\noutput of line Class.forName('B').newInstance() is: \n");
        System.out.println("Need to add InstantiationException and IllegalAccessException because of this\n");
        Class.forName("B").newInstance();
    }
}

class A {
    static
    {
        System.out.println("In static block of A\n");
    }
    
    {
        System.out.println("In instance block of A\n");
    }
}

class B {
    static
    {
        System.out.println("In static block of B\n");
    }
    
    {
        System.out.println("In instance block of B\n");
    }
}


/*
Output:
output of line A a = new A() is: 

In static block of A
In instance block of A

output of line Class.forName('B') is: 

Need to add ClassNotFoundException because of this

In static block of B

output of line Class.forName('B').newInstance() is: 

Need to add InstantiationException and IllegalAccessException because of this

In instance block of B
*/
