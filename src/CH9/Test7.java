package CH9;

public class Test7 {
}
/*
A. The notifyAll() method must be called from a synchronized context // Correct
B. To call wait(), an object must own the lock on the thread // Wrong, already has the locker
C. The notify() method is defined in class java.lang.Thread // Wrong, java.lang.Object
D. When a thread is waiting as a result of wait(), it releases its lock // Correct
E. The notify() method causes a thread to immediately release its lock // Wrong, will release the lock until the thread finish the synchronized block
F. The difference between notify() and notifyAll() is that notifyAll() notifies all waiting threads, regardless of the object they're waiting on //Wrong!
Only notify the threads that waits for the object lock
 */