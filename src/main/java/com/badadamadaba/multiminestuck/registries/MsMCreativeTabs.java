package com.badadamadaba.multiminestuck.registries;

import com.badadamadaba.multiminestuck.block.MsMBlocks;
import com.badadamadaba.multiminestuck.item.MsMItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.badadamadaba.multiminestuck.MinestuckMultiverseMain.MODID;

public class MsMCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GENERAL = REGISTRY.register("multiminestuck", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.multiminestuck"))
            .icon(() -> new ItemStack(MsMItems.ZILLYSTONE_SHARD.get()))
            .displayItems((parameters, output) -> {
                output.accept(MsMItems.IRON_MEDALLION);
                output.accept(MsMItems.ZILLYSTONE_SHARD);
                output.accept(MsMItems.MOONSTONE);
                output.accept(MsMItems.MOONSTONE_CHISEL);

                output.accept(MsMBlocks.SBAHJ_BEDROCK);
                output.accept(MsMBlocks.ZILLYSTONE);

                output.accept(MsMBlocks.HERO_STONE_BLOOD);
                output.accept(MsMBlocks.HERO_STONE_SLAB_BLOOD);
                output.accept(MsMBlocks.HERO_STONE_WALL_BLOOD);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_BLOOD);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_BLOOD);
                output.accept(MsMBlocks.HERO_STONE_BREATH);
                output.accept(MsMBlocks.HERO_STONE_SLAB_BREATH);
                output.accept(MsMBlocks.HERO_STONE_WALL_BREATH);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_BREATH);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_BREATH);
                output.accept(MsMBlocks.HERO_STONE_DOOM);
                output.accept(MsMBlocks.HERO_STONE_SLAB_DOOM);
                output.accept(MsMBlocks.HERO_STONE_WALL_DOOM);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_DOOM);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_DOOM);
                output.accept(MsMBlocks.HERO_STONE_LIFE);
                output.accept(MsMBlocks.HERO_STONE_SLAB_LIFE);
                output.accept(MsMBlocks.HERO_STONE_WALL_LIFE);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_LIFE);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_LIFE);
                output.accept(MsMBlocks.HERO_STONE_HEART);
                output.accept(MsMBlocks.HERO_STONE_SLAB_HEART);
                output.accept(MsMBlocks.HERO_STONE_WALL_HEART);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_HEART);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_HEART);
                output.accept(MsMBlocks.HERO_STONE_MIND);
                output.accept(MsMBlocks.HERO_STONE_SLAB_MIND);
                output.accept(MsMBlocks.HERO_STONE_WALL_MIND);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_MIND);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_MIND);
                output.accept(MsMBlocks.HERO_STONE_HOPE);
                output.accept(MsMBlocks.HERO_STONE_SLAB_HOPE);
                output.accept(MsMBlocks.HERO_STONE_WALL_HOPE);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_HOPE);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_HOPE);
                output.accept(MsMBlocks.HERO_STONE_RAGE);
                output.accept(MsMBlocks.HERO_STONE_SLAB_RAGE);
                output.accept(MsMBlocks.HERO_STONE_WALL_RAGE);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_RAGE);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_RAGE);
                output.accept(MsMBlocks.HERO_STONE_VOID);
                output.accept(MsMBlocks.HERO_STONE_SLAB_VOID);
                output.accept(MsMBlocks.HERO_STONE_WALL_VOID);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_VOID);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_VOID);
                output.accept(MsMBlocks.HERO_STONE_LIGHT);
                output.accept(MsMBlocks.HERO_STONE_SLAB_LIGHT);
                output.accept(MsMBlocks.HERO_STONE_WALL_LIGHT);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_LIGHT);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_LIGHT);
                output.accept(MsMBlocks.HERO_STONE_TIME);
                output.accept(MsMBlocks.HERO_STONE_SLAB_TIME);
                output.accept(MsMBlocks.HERO_STONE_WALL_TIME);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_TIME);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_TIME);
                output.accept(MsMBlocks.HERO_STONE_SPACE);
                output.accept(MsMBlocks.HERO_STONE_SLAB_SPACE);
                output.accept(MsMBlocks.HERO_STONE_WALL_SPACE);
                output.accept(MsMBlocks.HERO_STONE_STAIRS_SPACE);
                output.accept(MsMBlocks.CHISELED_HERO_STONE_SPACE);

                output.accept(MsMBlocks.GRIST_BLOCK_AMBER);
                output.accept(MsMBlocks.GRIST_BLOCK_AMETHYST);
                output.accept(MsMBlocks.GRIST_BLOCK_ARTIFACT);
                output.accept(MsMBlocks.GRIST_BLOCK_BUILD);
                output.accept(MsMBlocks.GRIST_BLOCK_CAULK);
                output.accept(MsMBlocks.GRIST_BLOCK_CHALK);
                output.accept(MsMBlocks.GRIST_BLOCK_COBALT);
                output.accept(MsMBlocks.GRIST_BLOCK_DIAMOND);
                output.accept(MsMBlocks.GRIST_BLOCK_GARNET);
                output.accept(MsMBlocks.GRIST_BLOCK_GOLD);
                output.accept(MsMBlocks.GRIST_BLOCK_IODINE);
                output.accept(MsMBlocks.GRIST_BLOCK_MARBLE);
                output.accept(MsMBlocks.GRIST_BLOCK_MERCURY);
                output.accept(MsMBlocks.GRIST_BLOCK_QUARTZ);
                output.accept(MsMBlocks.GRIST_BLOCK_RUBY);
                output.accept(MsMBlocks.GRIST_BLOCK_RUST);
                output.accept(MsMBlocks.GRIST_BLOCK_SHALE);
                output.accept(MsMBlocks.GRIST_BLOCK_SULFUR);
                output.accept(MsMBlocks.GRIST_BLOCK_TAR);
                output.accept(MsMBlocks.GRIST_BLOCK_URANIUM);
                output.accept(MsMBlocks.GRIST_BLOCK_ZILLIUM);
            })
            .build()
    );
}
