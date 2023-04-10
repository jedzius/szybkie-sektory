package net.jedzius.shared.worker;

public abstract class Worker implements Runnable {
    public abstract long getStartTime();
    public abstract void cancel();
    public abstract int getWorkId();
}
