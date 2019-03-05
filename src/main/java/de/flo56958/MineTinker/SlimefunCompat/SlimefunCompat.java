package de.flo56958.MineTinker.SlimefunCompat;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SlimefunCompat {
    public static void setupSfRecipes() {
        Category modCategory = new Category(SlimefunCompatItems.MINETINKER_CATEGORY);
        // Auto-Smelt
        new SlimefunItem(modCategory,
            SlimefunCompatItems.PLACEHOLDER,
        "AUTO_SMELT",
            RecipeType.SHAPED_RECIPE,
            new ItemStack[]
            {
                    new ItemStack(Material.FURNACE), new ItemStack(Material.FURNACE), new ItemStack(Material.FURNACE),
                    new ItemStack(Material.FURNACE), new ItemStack(Material.BLAZE_ROD), new ItemStack(Material.FURNACE),
                    new ItemStack(Material.FURNACE), new ItemStack(Material.FURNACE), new ItemStack(Material.FURNACE)
            }
        ).register();
    }
}
