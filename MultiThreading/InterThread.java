public class SharedResource {
   private int count = 0;
   private boolean flag = false;
   
   public synchronized void increment() {
      while (flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      count++;
      System.out.println("Incremented: " + count);
      flag = true;
      notify();
   }
   
   public synchronized void decrement() {
      while (!flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      count--;
      System.out.println("Decremented: " + count);
      flag = false;
      notify();
   }
}

public class WorkerThread implements Runnable {
   private SharedResource resource;
   
   public WorkerThread(SharedResource resource) {
      this.resource = resource;
   }
   
   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         resource.increment();
         resource.decrement();
      }
   }
}

public class InterThread {
   public static void main(String[] args) {
      SharedResource resource = new SharedResource();
      Thread t1 = new Thread(new WorkerThread(resource));
      Thread t2 = new Thread(new WorkerThread(resource));
      t1.start();
      t2.start();
   }
}
