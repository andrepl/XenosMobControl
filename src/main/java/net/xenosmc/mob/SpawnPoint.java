package net.xenosmc.mob;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class SpawnPoint {
    private String name;
    Location location;
    boolean enabled;
    EntityType entityType;
    double health;
    long respawnTimer;
    double damage;
    int minPlayers = 1;
    int spawnRadius = 30;
    private UUID entityId;
    private long lastDeathTime = 0;
    private ItemStack helmet = null;
    private ItemStack chestplate = null;
    private ItemStack leggings = null;
    private ItemStack boots = null;
    private ItemStack hand = null;
    private String customName = null;

    public SpawnPoint(String name) {
        this.name = name;
    }

    public SpawnPoint(String name, Location location, boolean enabled, EntityType entityType, double health, long respawnTimer, double damage, int minPlayers, int spawnRadius) {
        this.name = name;
        this.location = location;
        this.enabled = enabled;
        this.entityType = entityType;
        this.health = health;
        this.respawnTimer = respawnTimer;
        this.damage = damage;
        this.minPlayers = minPlayers;
        this.spawnRadius = spawnRadius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public long getRespawnTimer() {
        return respawnTimer;
    }

    public void setRespawnTimer(long respawnTimer) {
        this.respawnTimer = respawnTimer;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getSpawnRadius() {
        return spawnRadius;
    }

    public void setSpawnRadius(int spawnRadius) {
        this.spawnRadius = spawnRadius;
    }

    public boolean hasMob() {
        return this.entityId != null;
    }

    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public void setLastDeathTime(long lastDeathTime) {
        this.lastDeathTime = lastDeathTime;
    }

    public long getLastDeathTime() {
        return lastDeathTime;
    }

    public int getSpawnRadiusSquared() {
        return spawnRadius * spawnRadius;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public ItemStack getChestplate() {
        return chestplate;
    }

    public void setChestplate(ItemStack chestplate) {
        this.chestplate = chestplate;
    }

    public ItemStack getLeggings() {
        return leggings;
    }

    public void setLeggings(ItemStack leggings) {
        this.leggings = leggings;
    }

    public ItemStack getBoots() {
        return boots;
    }

    public void setBoots(ItemStack boots) {
        this.boots = boots;
    }

    public ItemStack getHand() {
        return hand;
    }

    public void setHand(ItemStack hand) {
        this.hand = hand;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }
}
