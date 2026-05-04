package com.tuusuario.mmo.commands;

import com.tuusuario.mmo.managers.PlayerManager;
import com.tuusuario.mmo.models.ClassType;
import com.tuusuario.mmo.models.PlayerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkillsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c¡Este comando es solo para jugadores!");
            return true;
        }

        Player player = (Player) sender;
        PlayerData data = PlayerManager.getInstance().getPlayerData(player);
        ClassType classType = data.getClassType();

        player.sendMessage("");
        player.sendMessage("§6═══════════════════════════════════════════════════════");
        player.sendMessage("§6§lHABILIDADES - §e" + classType.getDisplayName());
        player.sendMessage("§6═══════════════════════════════════════════════════════");
        
        player.sendMessage("");
        player.sendMessage("§d§l✦ PASIVA: §d" + classType.getPassiveName());
        player.sendMessage("§d" + classType.getPassiveDescription());

        player.sendMessage("");
        player.sendMessage("§6✦ HABILIDADES (Presiona los números del 1-7)");
        player.sendMessage("§e1§r - Habilidad 1");
        player.sendMessage("§e2§r - Habilidad 2");
        player.sendMessage("§e3§r - Habilidad 3");
        player.sendMessage("§e4§r - Habilidad 4");
        player.sendMessage("§e5§r - Habilidad 5");
        player.sendMessage("§e6§r - Habilidad 6");
        player.sendMessage("§e7§r - Habilidad 7");

        player.sendMessage("");
        player.sendMessage("§6═══════════════════════════════════════════════════════");
        player.sendMessage("");

        return true;
    }
}