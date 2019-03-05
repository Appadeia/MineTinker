package de.flo56958.MineTinker.SlimefunCompat;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class SlimefunCompatItems {
    // Category for Modifiers
    public static ItemStack MINETINKER_CATEGORY = new CustomItem(new MaterialData(Material.GOLDEN_PICKAXE), "&aMinetinker Modifiers");
    // Recipe type for bookshelf modifiers
    public static final RecipeType BOOKSHELF = new RecipeType(new CustomItem(Material.BOOKSHELF, "&eBookshelf", "", "&a&oRight click the item on a bookshelf. Costs XP."));

    public static ItemStack PLACEHOLDER = new CustomItem(new MaterialData(Material.NETHER_STAR), "&aPlaceholder Item", "If you're seeing this, someone forgot to replace this.");
}
