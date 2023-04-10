package net.jedzius.bukkit.sector;

import net.jedzius.bukkit.BukkitSectorsPlugin;
import net.jedzius.bukkit.sector.registry.SectorsRegistry;
import net.jedzius.shared.service.AbstractService;

public class SectorsService extends AbstractService<Integer, Sector> {

    @Override
    public void enableRegistry() {
        new SectorsRegistry(BukkitSectorsPlugin.getPlugin(BukkitSectorsPlugin.class))
                .start();
    }
}