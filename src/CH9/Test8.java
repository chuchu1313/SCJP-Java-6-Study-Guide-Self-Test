package CH9;

public class Test8 {
    private StringBuilder contents = new StringBuilder(); //StringBuilder is not a thread-safe class

    public synchronized void log(String message) {
        contents.append(System.currentTimeMillis());
        contents.append(": ");
        contents.append(Thread.currentThread().getName());
        contents.append(message);
        contents.append("\n");
    }

    public synchronized String getContents() { //synchronized public method is safer.
        return contents.toString();
    }
}
