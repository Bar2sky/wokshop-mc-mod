package com.cmoiwesh.arrowmod;

public class arrowmod {
    public static void setItemName (Item item, String name) {
        item.setRegistryName (arrowmod.MODID, name).setUnlocalizedName(arrowmod.MODID
                + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.Add(item);
    }
}

