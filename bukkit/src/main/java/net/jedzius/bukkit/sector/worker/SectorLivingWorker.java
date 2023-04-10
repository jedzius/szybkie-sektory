package net.jedzius.bukkit.sector.worker;

import net.jedzius.shared.worker.Worker;

public class SectorLivingWorker extends Worker {

    @Override
    public void run() {
        // SEND PACKET TO SECTORS WITH CALLBACK TO CHECK IF SECTOR IS ALIVE
    }

    @Override
    public long getStartTime() {
        return 0;
    }

    @Override
    public void cancel() {

    }

    @Override
    public int getWorkId() {
        return 0;
    }
}
