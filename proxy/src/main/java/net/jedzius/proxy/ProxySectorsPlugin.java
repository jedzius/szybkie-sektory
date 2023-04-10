package net.jedzius.proxy;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import java.util.logging.Logger;

@Plugin(
        id = "szybkie-sektory-proxy",
        name = "jedzius",
        version = "1.0"
)
public class ProxySectorsPlugin {

    private final ProxyServer server;
    private final Logger logger;

    @Inject
    public ProxySectorsPlugin(ProxyServer server, Logger logger) {
        this.server = server;
        this.logger = logger;
    }

    @Subscribe
    public void onInitialize(ProxyInitializeEvent event) {
        this.logger.info("Proxy sectors has been enabled!");
    }

    @Subscribe
    public void onShutdown(ProxyShutdownEvent event) {
        this.logger.info("Proxy sectors has been disabled!");
    }
}
