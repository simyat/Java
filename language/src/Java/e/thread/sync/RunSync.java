package Java.e.thread.sync;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();

        runSync.runCommonCalculate();
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate(); // calc instance
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();

        // thread1 = new ModifyAmountThread(calc, false);
        // thread2 = new ModifyAmountThread(calc, false);

        // thread1.start();
        // thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
