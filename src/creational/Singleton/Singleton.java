package src.creational.Singleton;

public class Singleton {
    // the intent of this pattern is to ensure that a class has only one instance and provide a global point of access to it.   
    private static Singleton instance;
    private Singleton(){
        // private constructor to prevent instantiation from outside the class
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class Main{

    public static void main(String[] args){
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2); // true
    }
}

// Above we are doing lazy initialization, which means that the instance is created only when it is needed. 
// This can save resources if the instance is never used. However, this implementation is not thread-safe,
//  meaning that if multiple threads try to access the getInstance() method at the same time, 
// it could lead to multiple instances being created. 
// To make it thread-safe, we can use synchronization or other techniques.

// to use synchronized method
// public static synchronized Singleton getInstance(){
//     if (instance == null){
//         instance = new Singleton();
//     }
//     return instance;
// }

// However, using synchronized can lead to performance issues, as it will block other threads from accessing the method 
// while one thread is executing it.
// Another approach is to use double-checked locking, which reduces the overhead of synchronization by only 
// synchronizing the critical section of code that creates the instance.
// public static Singleton getInstance(){
//     if (instance == null){
//         synchronized(Singleton.class){
//             if (instance == null){
//                 instance = new Singleton();
//             }
//         }
//     }
//     return instance;
// }        


// Eager Loading

// Another approach is to use eager loading, where the instance is created at the time of class loading.
// This approach is thread-safe without requiring synchronization, but it may lead to resource wastage if the instance is never used.
// private static final Singleton instance = new Singleton();
// public static Singleton getInstance(){
//     return instance;
// }   