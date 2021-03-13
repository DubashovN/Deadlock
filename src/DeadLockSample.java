public class DeadLockSample implements Runnable{
    private static class Resource{

    }
private final Resource scissors = new Resource();
private final Resource paper = new Resource();

    public void doSun(){
        synchronized (scissors){
            System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания солнышка!");
            synchronized (paper){
                System.out.println(Thread.currentThread().getName() + " взяла бумагу!");
                System.out.println(Thread.currentThread().getName() + " вырезаю солнышко!");

            }
        }
    }
    public void doCloud(){
        synchronized (scissors){
            System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания облака!");
            synchronized (paper){
                System.out.println(Thread.currentThread().getName() + " взяла бумагу!");
                System.out.println(Thread.currentThread().getName() + " вырезаю облако!");

            }
        }
    }
    @Override
    public void run() {
        doSun();
        doCloud();
    }


}
