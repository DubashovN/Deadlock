public class Main {
    public static void main(String[] args) {
        DeadLockSample deadLockSample = new DeadLockSample();
        Thread masha = new Thread(deadLockSample, "masha");
        Thread dasha = new Thread(deadLockSample, "dasha");
        masha.start();
        dasha.start();
    }
}
