class SingletonClass {
    private int x = 5;
    private static SingletonClass instance = null;
    
    private SingletonClass() {
        System.out.println("Private constructor is called\n");
    }
    
    public static SingletonClass getInstance() {
        if (instance == null) 
            instance = new SingletonClass();
        return instance;
    }
    
    public void showVariable() {
        System.out.println("value of x is: "+x);
        x+=5;
    }
    
}

class SingletonDemo {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        
        s1.showVariable();
        s2.showVariable();
        
        if (s1 == s2) {
            System.out.println("\nBoth objects are sharing same memory in heap");
        }
        else {
            System.out.println("\nBoth objects are sharing different same memory in heap");
        }
    }
}

/*
output:
Private constructor is called
value of x is: 5
value of x is: 10

Both objects are sharing same memory in heap
*/
