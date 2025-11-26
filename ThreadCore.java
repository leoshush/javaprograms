package forassignment;

public class ThreadCore {
    public static void main(String[] args) throws InterruptedException{
    SalaryFetcher task1 = new SalaryFetcher(1,10);
    SalaryFetcher task2 = new SalaryFetcher(11,20);

    Thread t1 = new Thread(task1,"Thread-1");
    Thread t2 = new Thread(task2,"Thread-2");
    t1.start();
    t1.start();


    t1.join();
    t2.join();

    double finalSum = task1.getResult() + task2.getResult();

    System.out.println("Final Total Salary = " + finalSum);
}
}