package com.tuusuario.mmo.models;

import java.util.UUID;

public class PlayerData {
    private UUID playerId;
    private String playerName;
    private Race race;
    private ClassType classType;
    private int level;
    private double experience;
    private double mana;
    private double maxMana;
    private float height;
    private float eyeHeight;

    public PlayerData(UUID playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.race = Race.HUMAN;
        this.classType = ClassType.WARRIOR;
        this.level = 1;
        this.experience = 0;
        this.maxMana = 100;
        this.mana = maxMana;
        updateHeightFromRace();
    }

    public void setRace(Race race) {
        this.race = race;
        updateHeightFromRace();
    }

    private void updateHeightFromRace() {
        this.height = race.getHeight();
        this.eyeHeight = race.getEyeHeight();
    }

    public UUID getPlayerId() { return playerId; }
    public String getPlayerName() { return playerName; }
    public Race getRace() { return race; }
    public ClassType getClassType() { return classType; }
    public void setClassType(ClassType classType) { this.classType = classType; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public double getExperience() { return experience; }
    public void setExperience(double experience) { this.experience = experience; }
    public double getMana() { return mana; }
    public void setMana(double mana) { this.mana = Math.min(mana, maxMana); }
    public double getMaxMana() { return maxMana; }
    public void setMaxMana(double maxMana) { this.maxMana = maxMana; }
    public float getHeight() { return height; }
    public float getEyeHeight() { return eyeHeight; }
}