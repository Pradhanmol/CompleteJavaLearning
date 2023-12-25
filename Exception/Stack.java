import java.lang.Exception;

//Implemenet stack exeception
class StackOverFlow extends Exception{
    public String toString(){
        return "Stack get over flow";
    } 
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack get under flow";
    } 
}


class StackImplementation{
    private int size;
    private int top = -1;
    private int[] s;

    public StackImplementation(int size){
        this.size = size;
        s = new int[size];
    }

    public void push(int x) throws StackOverFlow
    {
        if(top == size-1){
            throw new StackOverFlow();
        }
        top++;
        s[top] = x;
    }

    public void pop() throws StackUnderFlow
    {
        int x = -1;
        if(top == -1){
            throw new StackUnderFlow();
        }
        x = s[top];
        top--;
    }
    public void getStack(){
        for (int i : s) {
            System.out.println(i);
        }
    }
}




public class Stack {

    public static void main(String[] args) {
    StackImplementation s1 = new StackImplementation(5);
    try {
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);

    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    finally{
            s1.getStack();
    }     
    }
}
