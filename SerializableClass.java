import java.io.*;
class Main implements Serializable {
    int i = 10;
    int j = 20;
    transient int k = 30;
    public static void main(String[] args) {
        Main input = new Main();
        
        //serialization
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
        
        //de-serialization
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Main output = (Main)ois.readObject();
        
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        //output of k will be default i.e. 0 because it is transient type
        System.out.println("k = " + output.k);
    }
}

/*
Output:
i = 10
j = 20
k = 0
*/

