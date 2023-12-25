public class Race {
    public static void main(String[] args) {
        Thread runner1 = new Thread(new Runner("Runner 1"));
        Thread runner2 = new Thread(new Runner("Runner 2"));

        runner1.start();
        runner2.start();
    }
}

class Runner implements Runnable {
    private String name;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // TODO: Implement the logic for the runner thread
        System.out.println("Hello Anmol");
    }
}

class Display(){
    public void Display() {
        System.out.println();
    }
}
