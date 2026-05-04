package com.tuusuario.mmo.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftingRecipes {
    private JavaPlugin plugin;

    public CraftingRecipes(JavaPlugin plugin) {
        this.plugin = plugin;
        registerRecipes();
    }

    private void registerRecipes() {
        // Espada de Madera
        ShapedRecipe woodenSwordRecipe = new ShapedRecipe(
                new NamespacedKey(plugin, "wooden_sword"),
                new ItemStack(Material.WOODEN_SWORD, 1)
        );
        
        woodenSwordRecipe.shape(
                "  W",
                "  W",
                "  S"
        );
        
        woodenSwordRecipe.setIngredient('W', Material.OAK_PLANKS);
        woodenSwordRecipe.setIngredient('S', Material.STICK);
        
        Bukkit.addRecipe(woodenSwordRecipe);
        plugin.getLogger().info("Receta de Espada de Madera registrada");

        // Poción de Curación
        ShapedRecipe healingPotionRecipe = new ShapedRecipe(
                new NamespacedKey(plugin, "healing_potion"),
                new ItemStack(Material.POTION, 1)
        );
        
        healingPotionRecipe.shape(
                " A ",
                "ABA",
                " A "
        );
        
        healingPotionRecipe.setIngredient('A', Material.APPLE);
        healingPotionRecipe.setIngredient('B', Material.GLASS_BOTTLE);
        
        Bukkit.addRecipe(healingPotionRecipe);
        plugin.getLogger().info("Receta de Poción de Curación registrada");
    }
}
