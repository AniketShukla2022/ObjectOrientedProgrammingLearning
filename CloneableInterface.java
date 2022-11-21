class A implements Cloneable {
    int i;
    String s;
    
    public A(int i, String s) {
        this.i = i;
        this.s = s;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        A obj = new A(4, "Apple");
        A clonedObj = (A)obj.clone();
        System.out.println(clonedObj.i + " " + clonedObj.s);
    }
}

/*
output:
4 Apple
*/
