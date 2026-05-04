package com.tuusuario.mmo.commands;

import com.tuusuario.mmo.shop.ShopManager;
import com.tuusuario.mmo.shop.ShopItem;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ShopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c¡Este comando es solo para jugadores!");
            return true;
        }

        Player player = (Player) sender;
        
        Inventory shop = Bukkit.createInventory(null, 45, "§6§lTienda EldenCraft");
        
        int slot = 0;
        for (ShopItem item : ShopManager.getInstance().getShopItems()) {
            if (slot < 45) {
                shop.setItem(slot, item.getItemStack());
                slot++;
            }
        }
        
        player.openInventory(shop);
        return true;
    }
}