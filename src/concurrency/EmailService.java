package src.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailService{
    // the EmailService is used to send email
    // Instead of managing thread individually, it's best to use a framework or thread pool
    // Here we use Executors Framework
    // It has 4 main components, the Interface Executors which has only one method (execute) that
    // just executes and has no capability to get response from that execution. (so ideal for Runnable tasks)
    // Then we have a ExecutorService Interface that extends this Executor Interface and has more methods 
    // like submit (which also gets the response), shutdown and shutdownNow and so on. (ideal for Callable tasks)
    // Then we have a ThreadPoolExecutor which is concrete implementation of the ExecutorService Interface
    // and finally Executors which is a utility class that provides factory methods to create 
    // predefined types of executor services.

    // we just want one instance of this executor 
    private static final ExecutorService executor =  Executors.newFixedThreadPool(5);


    public void sendEmail(int recipient){
        // here we have some email logic
        Runnable emailtask = () ->{
            // we use lambda to create a runnable task where we implement run method
            System.out.println("Sending Email to " +recipient);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        };
        executor.execute(emailtask);

    };

    public static void main(String[] args) {
        EmailService emailService= new EmailService();
        for (int i=0; i<25; i++){
           emailService.sendEmail(i);
        }
        EmailService.executor.shutdown();
    }
}