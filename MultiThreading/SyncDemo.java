
//This class has shared by the both of class whose extends thread
class MyData{
    public void display(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

}



//Thread1 class which has crtical section of code 
//i.e use common class object it means one class functionality use 
// by the two or more thread because of that the ambugity issue is happend

class MyThread1 extends Thread{
    MyData d; // taking refernce variable of shared class
    MyThread1(MyData d){ //intializing constructor with refernce of shared object
        this.d = d;
    }
    public void run() {
        d.display("HELLO World");
    }
    
    
}

//Thread2 class which has crtical section of code i.e use common class object it means one class functionality use 
// by the two or more thread because of that the ambugity issue is happend
class MyThread2 extends Thread{
    MyData d;
    MyThread2(MyData d){
        this.d = d;
    }
    public void run() {
        d.display("ANMOL pradhan");
        
    }

}


public class SyncDemo {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 m1 = new MyThread1(d);
        MyThread2 m2 = new MyThread2(d);
        m1.start();
        m2.start();
    }
    
}
