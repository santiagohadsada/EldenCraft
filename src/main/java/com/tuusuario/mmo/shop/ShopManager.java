package com.tuusuario.mmo.shop;

import org.bukkit.Material;
import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private static ShopManager instance;
    private List<ShopItem> shopItems;

    private ShopManager() {
        this.shopItems = new ArrayList<>();
        initializeShop();
    }

    public static ShopManager getInstance() {
        if (instance == null) {
            instance = new ShopManager();
        }
        return instance;
    }

    private void initializeShop() {
        // Armadura de Cuero (LIGHT)
        shopItems.add(new ShopItem(Material.LEATHER_HELMET, 1, 50, "§6Casco de Cuero"));
        shopItems.add(new ShopItem(Material.LEATHER_CHESTPLATE, 1, 100, "§6Peto de Cuero"));
        shopItems.add(new ShopItem(Material.LEATHER_LEGGINGS, 1, 75, "§6Pantalones de Cuero"));
        shopItems.add(new ShopItem(Material.LEATHER_BOOTS, 1, 50, "§6Botas de Cuero"));
        
        // Armadura de Hierro (MEDIUM)
        shopItems.add(new ShopItem(Material.IRON_HELMET, 1, 150, "§7Casco de Hierro"));
        shopItems.add(new ShopItem(Material.IRON_CHESTPLATE, 1, 300, "§7Peto de Hierro"));
        shopItems.add(new ShopItem(Material.IRON_LEGGINGS, 1, 225, "§7Pantalones de Hierro"));
        shopItems.add(new ShopItem(Material.IRON_BOOTS, 1, 150, "§7Botas de Hierro"));
        
        // Armadura de Diamante (HEAVY)
        shopItems.add(new ShopItem(Material.DIAMOND_HELMET, 1, 500, "§bCasco de Diamante"));
        shopItems.add(new ShopItem(Material.DIAMOND_CHESTPLATE, 1, 1000, "§bPeto de Diamante"));
        shopItems.add(new ShopItem(Material.DIAMOND_LEGGINGS, 1, 750, "§bPantalones de Diamante"));
        shopItems.add(new ShopItem(Material.DIAMOND_BOOTS, 1, 500, "§bBotas de Diamante"));
        
        // Armas
        shopItems.add(new ShopItem(Material.WOODEN_SWORD, 1, 30, "§8Espada de Madera"));
        shopItems.add(new ShopItem(Material.STONE_SWORD, 1, 75, "§7Espada de Piedra"));
        shopItems.add(new ShopItem(Material.IRON_SWORD, 1, 200, "§7Espada de Hierro"));
        shopItems.add(new ShopItem(Material.DIAMOND_SWORD, 1, 500, "§bEspada de Diamante"));
        
        // Items consumibles
        shopItems.add(new ShopItem(Material.APPLE, 1, 10, "§cManzana"));
        shopItems.add(new ShopItem(Material.GOLDEN_APPLE, 1, 100, "§6Manzana Dorada"));
        shopItems.add(new ShopItem(Material.POTION, 1, 50, "§dPoción de Curación"));
        shopItems.add(new ShopItem(Material.PAPER, 1, 50, "§9Pergamino de Maná"));
        
        // Bloques
        shopItems.add(new ShopItem(Material.OAK_LOG, 64, 20, "§8Tronco de Roble"));
        shopItems.add(new ShopItem(Material.COBBLESTONE, 64, 10, "§7Piedra"));
    }

    public List<ShopItem> getShopItems() {
        return shopItems;
    }

    public ShopItem getShopItem(Material material) {
        for (ShopItem item : shopItems) {
            if (item.getMaterial() == material) {
                return item;
            }
        }
        return null;
    }
}
