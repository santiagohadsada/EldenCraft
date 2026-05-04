package com.tuusuario.mmo.shop;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopItem {
    private Material material;
    private int amount;
    private int price;
    private String displayName;

    public ShopItem(Material material, int amount, int price, String displayName) {
        this.material = material;
        this.amount = amount;
        this.price = price;
        this.displayName = displayName;
    }

    public ItemStack getItemStack() {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(displayName);
            meta.setLore(java.util.Arrays.asList("§6Precio: §e" + price + " monedas"));
            item.setItemMeta(meta);
        }
        return item;
    }

    public Material getMaterial() { return material; }
    public int getAmount() { return amount; }
    public int getPrice() { return price; }
    public String getDisplayName() { return displayName; }
}