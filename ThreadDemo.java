public class ThreadDemo extends Thread {
    public void run() {
       // loop 5 times
       for (int i = 0; i < 5; i++) {
          // if it's the first time through the loop, yield
          if (i == 0) {
             Thread.yield();
          }
          // print out the name of the thread and the current loop iteration
          System.out.println(getName() + ": " + i);
          // pause for 100 milliseconds
          try {
             sleep(100);
          } catch (InterruptedException e) {
             e.printStackTrace();
          }
       }
    }
  
    public static void main(String[] args) {
       // create two threads
       ThreadDemo t1 = new ThreadDemo();
       ThreadDemo t2 = new ThreadDemo();
       // start the threads
       t1.start();
       t2.start();
  
       // wait for threads to finish
       try {
          t1.join();
          t2.join();
       } catch (InterruptedException e) {
          e.printStackTrace();
       }
    }
 }