package com.tuusuario.mmo.models;

import org.bukkit.Material;

public enum ClassType {
    WARRIOR("Guerrero", "Sed de batalla", "A menor vida, mayor daño cuerpo a cuerpo", ArmorRestriction.HEAVY),
    MAGE("Mago", "Sabiduría arcana", "Reduce el coste de maná y regenera más", ArmorRestriction.LIGHT),
    RANGER("Explorador", "Instinto natural", "Aumenta velocidad y energía en bosques/junglas", ArmorRestriction.LIGHT),
    PALADIN("Paladín", "Juicio divino", "x2 daño a no-muertos y menos daño de ellos", ArmorRestriction.HEAVY),
    ROGUE("Ladrón", "Golpe crítico", "Ataques por la espalda con daño y crítico aumentados", ArmorRestriction.LIGHT),
    BARD("Bardo", "Armonía", "Habilidades de soporte duran más y tienen mayor alcance", ArmorRestriction.MEDIUM),
    BARBARIAN("Bárbaro", "Ira creciente", "En combate: aumenta daño y velocidad de ataque", ArmorRestriction.HEAVY),
    SORCERER("Hechicero", "Reacción Arcana", "Recibir daño acumula cargas; a 5 explota en área", ArmorRestriction.LIGHT),
    WARLOCK("Brujo", "Pacto oscuro", "Usa habilidades sin maná consumiendo vida", ArmorRestriction.LIGHT),
    MONK("Monje", "Camino del Puño", "Sin armas: daño aumentado y velocidad alta", ArmorRestriction.LIGHT),
    DRUID("Druida", "Afinidad natural", "Bonus según bioma: velocidad, resistencia y curación", ArmorRestriction.MEDIUM),
    CLERIC("Clérigo", "Fe absoluta", "Las curaciones son más fuertes con menor vida del objetivo", ArmorRestriction.MEDIUM),
    GUNSLINGER("Pistolero", "Recarga táctica", "Cada varios disparos: recarga instantánea y bonus daño", ArmorRestriction.MEDIUM);

    private final String displayName;
    private final String passiveName;
    private final String passiveDescription;
    private final ArmorRestriction armorRestriction;

    ClassType(String displayName, String passiveName, String passiveDescription, ArmorRestriction armorRestriction) {
        this.displayName = displayName;
        this.passiveName = passiveName;
        this.passiveDescription = passiveDescription;
        this.armorRestriction = armorRestriction;
    }

    public String getDisplayName() { return displayName; }
    public String getPassiveName() { return passiveName; }
    public String getPassiveDescription() { return passiveDescription; }
    public ArmorRestriction getArmorRestriction() { return armorRestriction; }

    public enum ArmorRestriction {
        LIGHT(new Material[]{Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS}),
        MEDIUM(new Material[]{Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS,
                              Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS}),
        HEAVY(new Material[]{Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS,
                             Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS,
                             Material.NETHERITE_HELMET, Material.NETHERITE_CHESTPLATE, Material.NETHERITE_LEGGINGS, Material.NETHERITE_BOOTS});

        private final Material[] allowedArmor;

        ArmorRestriction(Material[] allowedArmor) {
            this.allowedArmor = allowedArmor;
        }

        public boolean isAllowed(Material material) {
            for (Material armor : allowedArmor) {
                if (armor == material) return true;
            }
            return false;
        }
    }
}