package com.tuusuario.mmo.commands;

import com.tuusuario.mmo.managers.PlayerManager;
import com.tuusuario.mmo.models.PlayerData;
import com.tuusuario.mmo.models.Race;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RaceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c¡Este comando es solo para jugadores!");
            return true;
        }

        Player player = (Player) sender;
        PlayerData data = PlayerManager.getInstance().getPlayerData(player);

        if (args.length < 1) {
            player.sendMessage("§6Tu raza actual: §e" + data.getRace().getDisplayName());
            player.sendMessage("§6Usa: /race <nombre>");
            player.sendMessage("§6Razas disponibles:");
            for (Race race : Race.values()) {
                player.sendMessage("§e  - " + race.name().toLowerCase() + " (altura: " + race.getHeight() + ")");
            }
            return true;
        }

        try {
            Race newRace = Race.valueOf(args[0].toUpperCase());
            data.setRace(newRace);
            PlayerManager.getInstance().savePlayerData(data);
            player.sendMessage("§a¡Raza cambiada a: §e" + newRace.getDisplayName());
            player.sendMessage("§6Altura: " + newRace.getHeight() + " bloques");
            return true;
        } catch (IllegalArgumentException e) {
            player.sendMessage("§c¡Raza no encontrada!");
            return false;
        }
    }
}