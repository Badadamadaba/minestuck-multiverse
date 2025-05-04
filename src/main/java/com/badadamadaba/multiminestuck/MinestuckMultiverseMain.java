package com.badadamadaba.multiminestuck;

import com.badadamadaba.multiminestuck.block.HeroStoneBlocks;
import com.badadamadaba.multiminestuck.block.MsMBlocks;
import com.badadamadaba.multiminestuck.registries.MsMCreativeTabs;
import com.badadamadaba.multiminestuck.item.MsMItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MinestuckMultiverseMain.MODID)
public class MinestuckMultiverseMain
{
    public static final String MODID = "multiminestuck";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }


    public MinestuckMultiverseMain(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        MsMBlocks.REGISTRY.register(modEventBus);
        MsMItems.REGISTRY.register(modEventBus);
        MsMCreativeTabs.REGISTRY.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
