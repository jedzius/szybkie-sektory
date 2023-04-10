package net.jedzius.bukkit.sector.registry;

import net.jedzius.bukkit.BukkitSectorsPlugin;
import net.jedzius.bukkit.sector.worker.SectorLivingWorker;

import java.util.concurrent.*;

public class SectorsRegistry {

    private final BukkitSectorsPlugin plugin;
    private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public SectorsRegistry(BukkitSectorsPlugin plugin) {
        this.plugin = plugin;
    }

    public void start() {
        long startTime = System.currentTimeMillis();
        this.load();
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(new SectorLivingWorker(), 0, 1, TimeUnit.MINUTES);

        this.plugin.logger.info("Sectors has been enabled in " + (System.currentTimeMillis() - startTime) + "!");
    }

    private void load() {
        // LOAD FROM CONFIG
    }
}
