
//firstly we using cooncrete/different class which extends thread class an then both method run simultaneously 
// through thread here main & other class method run which one is capture in run method

class ThreadTestRunWithMain extends Thread{

    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + ": Hello");
            i++;
        }
    }

}

//Implement using Runnable interface
class ThreadTestRunWithRunnable implements Runnable{

    public void run() {
        int i =1;
        while(true){
            System.out.println(i+" : Pradhan");
            i++;
        }
    }
}
public class ThreadTest{
    public static void main(String[] args) {
        // ThreadTestRunWithMain t = new ThreadTestRunWithMain();
        // t.start();
        ThreadTestRunWithRunnable t1 = new ThreadTestRunWithRunnable();
        Thread th = new Thread(t1);
        th.start();
        int i = 1;
        while(true){
            System.out.println(i+": World Anmol");
            i++;
        }
        
    }
}