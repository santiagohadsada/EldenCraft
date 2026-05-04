package com.tuusuario.mmo.listeners;

import com.tuusuario.mmo.managers.PlayerManager;
import com.tuusuario.mmo.models.ClassType;
import com.tuusuario.mmo.models.PlayerData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ArmorRestrictionListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player)) return;

        Player player = (Player) event.getWhoClicked();
        PlayerData data = PlayerManager.getInstance().getPlayerData(player);
        
        ItemStack cursor = event.getCursor();
        if (cursor == null || cursor.getType().isAir()) return;

        if (isArmor(cursor)) {
            ClassType.ArmorRestriction restriction = data.getClassType().getArmorRestriction();
            if (!restriction.isAllowed(cursor.getType())) {
                event.setCancelled(true);
                player.sendMessage("§c¡Tu clase " + data.getClassType().getDisplayName() + 
                        " no puede usar ese tipo de armadura!");
            }
        }
    }

    private boolean isArmor(ItemStack item) {
        String name = item.getType().name();
        return name.endsWith("_HELMET") || name.endsWith("_CHESTPLATE") || 
               name.endsWith("_LEGGINGS") || name.endsWith("_BOOTS");
    }
}