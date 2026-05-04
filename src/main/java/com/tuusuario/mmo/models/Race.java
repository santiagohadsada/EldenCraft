package com.tuusuario.mmo.models;

public enum Race {
    HUMAN("Humano", 1.8f, 0.6f, 10, 10, 10, 10, 10, 10),
    DWARF("Enano", 1.4f, 0.75f, 12, 14, 8, 10, 12, 8),
    ELF("Elfo", 1.9f, 0.55f, 8, 10, 14, 12, 10, 10),
    HOBBIT("Hobbit", 1.2f, 0.5f, 6, 12, 10, 8, 10, 8),
    ORC("Orco", 2.0f, 0.75f, 16, 14, 10, 8, 8, 6),
    GNOME("Gnomo", 1.0f, 0.45f, 8, 10, 12, 14, 10, 10),
    HALFLING("Mediano", 1.3f, 0.55f, 8, 11, 12, 10, 10, 11),
    TIEFLING("Tiefling", 1.85f, 0.6f, 9, 10, 10, 11, 9, 14),
    GOLIATH("Goliat", 2.3f, 0.9f, 15, 15, 8, 8, 10, 6),
    FORGED("Forjado", 2.0f, 0.8f, 12, 14, 8, 12, 10, 6),
    UNDEAD("No-muerto", 1.8f, 0.6f, 10, 12, 8, 10, 8, 5),
    AASIMAR("Aasimar", 1.9f, 0.6f, 10, 11, 10, 10, 12, 14);

    private final String displayName;
    private final float height;
    private final float eyeHeight;
    private final int strength;
    private final int constitution;
    private final int dexterity;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    Race(String displayName, float height, float eyeHeight, int strength, int constitution,
         int dexterity, int intelligence, int wisdom, int charisma) {
        this.displayName = displayName;
        this.height = height;
        this.eyeHeight = eyeHeight;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public String getDisplayName() { return displayName; }
    public float getHeight() { return height; }
    public float getEyeHeight() { return eyeHeight; }
    public int getStrength() { return strength; }
    public int getConstitution() { return constitution; }
    public int getDexterity() { return dexterity; }
    public int getIntelligence() { return intelligence; }
    public int getWisdom() { return wisdom; }
    public int getCharisma() { return charisma; }
}