package com.badadamadaba.multiminestuck.item;

import com.badadamadaba.multiminestuck.MinestuckMultiverseMain;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MsMItems
{
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinestuckMultiverseMain.MODID);

    //Items
    public static final DeferredItem<Item> IRON_MEDALLION = REGISTRY.register("iron_medallion", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOONSTONE = REGISTRY.register("moonstone", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZILLYSTONE_SHARD = REGISTRY.register("zillystone_shard", () -> new Item(new Item.Properties()));

    //Tools
    public static final DeferredItem<Item> MOONSTONE_CHISEL = REGISTRY.register("moonstone_chisel", () -> new MsMMoonstoneChisel(new Item.Properties().durability(128)));
}
