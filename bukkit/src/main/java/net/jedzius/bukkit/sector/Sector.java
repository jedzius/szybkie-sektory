package net.jedzius.bukkit.sector;

public class Sector {
    private final int id;
    private final SectorWorld world;

    private int maxPlayers;

    private final double minX;
    private final double minZ;

    private final double maxX;
    private final double maxZ;


    public Sector(int id, SectorWorld world, int maxPlayers, double minX, double minZ, double maxX, double maxZ) {
        this.id = id;
        this.world = world;
        this.minX = minX;
        this.maxPlayers = maxPlayers;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxZ = maxZ;
    }

    public int getId() {
        return id;
    }

    public SectorWorld getWorld() {
        return world;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public double getMinX() {
        return minX;
    }

    public double getMinZ() {
        return minZ;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMaxZ() {
        return maxZ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private SectorWorld world;
        private int maxPlayers;
        private double minX;
        private double minZ;
        private double maxX;
        private double maxZ;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder world(SectorWorld sectorWorld) {
            this.world = sectorWorld;
            return this;
        }

        public Builder maxPlayers(int maxPlayers) {
            this.maxPlayers = maxPlayers;
            return this;
        }

        public Builder minX(int minX) {
            this.minX = minX;
            return this;
        }

        public Builder minZ(int minZ) {
            this.minZ = minZ;
            return this;
        }

        public Builder maxX(int maxX) {
            this.maxX = maxX;
            return this;
        }
        public Builder maxZ(int maxX) {
            this.maxX = maxX;
            return this;
        }

        public Sector build() {
            return new Sector(id, world, maxPlayers, minX, minZ, maxX,
                     maxZ);
        }
    }
}
