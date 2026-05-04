package com.tuusuario.mmo;

import com.tuusuario.mmo.commands.ClassCommand;
import com.tuusuario.mmo.commands.RaceCommand;
import com.tuusuario.mmo.commands.SkillsCommand;
import com.tuusuario.mmo.commands.ShopCommand;
import com.tuusuario.mmo.listeners.ArmorRestrictionListener;
import com.tuusuario.mmo.recipes.CraftingRecipes;
import org.bukkit.plugin.java.JavaPlugin;

public class EldenCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("§a=== EldenCraft v2.3 INICIANDO ===");
        
        // Registrar comandos
        getCommand("class").setExecutor(new ClassCommand());
        getCommand("race").setExecutor(new RaceCommand());
        getCommand("skills").setExecutor(new SkillsCommand());
        getCommand("shop").setExecutor(new ShopCommand());
        
        // Registrar listeners
        getServer().getPluginManager().registerEvents(new ArmorRestrictionListener(), this);
        
        // Registrar recetas
        new CraftingRecipes(this);
        
        getLogger().info("§a=== EldenCraft cargado exitosamente ===");
    }

    @Override
    public void onDisable() {
        getLogger().info("§cEldenCraft deshabilitado");
    }
}