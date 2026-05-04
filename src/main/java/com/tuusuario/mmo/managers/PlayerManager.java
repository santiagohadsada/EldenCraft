package com.tuusuario.mmo.managers;

import com.tuusuario.mmo.models.PlayerData;
import org.bukkit.entity.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerManager {
    private static PlayerManager instance;
    private Map<UUID, PlayerData> playersData;

    private PlayerManager() {
        this.playersData = new HashMap<>();
    }

    public static PlayerManager getInstance() {
        if (instance == null) {
            instance = new PlayerManager();
        }
        return instance;
    }

    public PlayerData getPlayerData(Player player) {
        return playersData.computeIfAbsent(player.getUniqueId(),
                uuid -> new PlayerData(uuid, player.getName()));
    }

    public PlayerData getPlayerData(UUID uuid) {
        return playersData.get(uuid);
    }

    public void savePlayerData(PlayerData data) {
        playersData.put(data.getPlayerId(), data);
    }

    public void removePlayerData(UUID uuid) {
        playersData.remove(uuid);
    }
}