package com.tuusuario.mmo.commands;

import com.tuusuario.mmo.managers.PlayerManager;
import com.tuusuario.mmo.models.ClassType;
import com.tuusuario.mmo.models.PlayerData;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClassCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c¡Este comando es solo para jugadores!");
            return true;
        }

        Player player = (Player) sender;
        PlayerData data = PlayerManager.getInstance().getPlayerData(player);

        if (args.length < 1) {
            player.sendMessage("§6Tu clase actual: §e" + data.getClassType().getDisplayName());
            player.sendMessage("§6Usa: /class <nombre>");
            player.sendMessage("§6Clases disponibles:");
            for (ClassType ct : ClassType.values()) {
                player.sendMessage("§e  - " + ct.name().toLowerCase());
            }
            return true;
        }

        try {
            ClassType newClass = ClassType.valueOf(args[0].toUpperCase());
            data.setClassType(newClass);
            PlayerManager.getInstance().savePlayerData(data);
            player.sendMessage("§a¡Clase cambiada a: §e" + newClass.getDisplayName());
            player.sendMessage("§d✦ PASIVA: " + newClass.getPassiveName());
            player.sendMessage("§d" + newClass.getPassiveDescription());
            return true;
        } catch (IllegalArgumentException e) {
            player.sendMessage("§c¡Clase no encontrada!");
            return false;
        }
    }
}