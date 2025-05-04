package com.badadamadaba.multiminestuck.block;

import com.badadamadaba.multiminestuck.MinestuckMultiverseMain;
import com.badadamadaba.multiminestuck.item.MsMItems;
import com.mraof.minestuck.block.ItemBlockPair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;

public class MsMBlocks
{
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MinestuckMultiverseMain.MODID);

    public static final DeferredBlock<Block> SBAHJ_BEDROCK = registerBlock("sbahj_bedrock", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> ZILLYSTONE = registerBlock("zillystone", () -> new Block(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> HERO_STONE_BLOOD = registerBlock("hero_stone_blood", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_BLOOD = registerBlock("hero_stone_slab_blood", () -> new SlabBlock(ofFullCopy(HERO_STONE_BLOOD.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_BLOOD = registerBlock("hero_stone_wall_blood", () -> new WallBlock(ofFullCopy(HERO_STONE_BLOOD.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_BLOOD = registerBlock("hero_stone_stair_blood", () -> new StairBlock(HERO_STONE_BLOOD.get().defaultBlockState(), ofFullCopy(HERO_STONE_BLOOD.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_BLOOD = registerBlock("chiseled_hero_stone_blood", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_BREATH = registerBlock("hero_stone_breath", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_BREATH = registerBlock("hero_stone_slab_breath", () -> new SlabBlock(ofFullCopy(HERO_STONE_BREATH.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_BREATH = registerBlock("hero_stone_wall_breath", () -> new WallBlock(ofFullCopy(HERO_STONE_BREATH.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_BREATH = registerBlock("hero_stone_stair_breath", () -> new StairBlock(HERO_STONE_BREATH.get().defaultBlockState(), ofFullCopy(HERO_STONE_BREATH.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_BREATH = registerBlock("chiseled_hero_stone_breath", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_DOOM = registerBlock("hero_stone_doom", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_DOOM = registerBlock("hero_stone_slab_doom", () -> new SlabBlock(ofFullCopy(HERO_STONE_DOOM.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_DOOM = registerBlock("hero_stone_wall_doom", () -> new WallBlock(ofFullCopy(HERO_STONE_DOOM.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_DOOM = registerBlock("hero_stone_stair_doom", () -> new StairBlock(HERO_STONE_DOOM.get().defaultBlockState(), ofFullCopy(HERO_STONE_DOOM.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_DOOM = registerBlock("chiseled_hero_stone_doom", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_LIFE= registerBlock("hero_stone_life", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_LIFE = registerBlock("hero_stone_slab_life", () -> new SlabBlock(ofFullCopy(HERO_STONE_LIFE.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_LIFE = registerBlock("hero_stone_wall_life", () -> new WallBlock(ofFullCopy(HERO_STONE_LIFE.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_LIFE = registerBlock("hero_stone_stair_life", () -> new StairBlock(HERO_STONE_LIFE.get().defaultBlockState(), ofFullCopy(HERO_STONE_LIFE.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_LIFE = registerBlock("chiseled_hero_stone_life", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_HEART = registerBlock("hero_stone_heart", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_HEART = registerBlock("hero_stone_slab_heart", () -> new SlabBlock(ofFullCopy(HERO_STONE_HEART.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_HEART = registerBlock("hero_stone_wall_heart", () -> new WallBlock(ofFullCopy(HERO_STONE_HEART.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_HEART = registerBlock("hero_stone_stair_heart", () -> new StairBlock(HERO_STONE_HEART.get().defaultBlockState(), ofFullCopy(HERO_STONE_HEART.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_HEART = registerBlock("chiseled_hero_stone_heart", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_MIND = registerBlock("hero_stone_mind", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_MIND = registerBlock("hero_stone_slab_mind", () -> new SlabBlock(ofFullCopy(HERO_STONE_MIND.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_MIND = registerBlock("hero_stone_wall_mind", () -> new WallBlock(ofFullCopy(HERO_STONE_MIND.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_MIND = registerBlock("hero_stone_stair_mind", () -> new StairBlock(HERO_STONE_MIND.get().defaultBlockState(), ofFullCopy(HERO_STONE_MIND.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_MIND = registerBlock("chiseled_hero_stone_mind", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_HOPE = registerBlock("hero_stone_hope", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_HOPE = registerBlock("hero_stone_slab_hope", () -> new SlabBlock(ofFullCopy(HERO_STONE_HOPE.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_HOPE = registerBlock("hero_stone_wall_hope", () -> new WallBlock(ofFullCopy(HERO_STONE_HOPE.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_HOPE = registerBlock("hero_stone_stair_hope", () -> new StairBlock(HERO_STONE_HOPE.get().defaultBlockState(), ofFullCopy(HERO_STONE_HOPE.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_HOPE = registerBlock("chiseled_hero_stone_hope", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_RAGE = registerBlock("hero_stone_rage", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_RAGE = registerBlock("hero_stone_slab_rage", () -> new SlabBlock(ofFullCopy(HERO_STONE_RAGE.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_RAGE = registerBlock("hero_stone_wall_rage", () -> new WallBlock(ofFullCopy(HERO_STONE_RAGE.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_RAGE = registerBlock("hero_stone_stair_rage", () -> new StairBlock(HERO_STONE_RAGE.get().defaultBlockState(), ofFullCopy(HERO_STONE_RAGE.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_RAGE = registerBlock("chiseled_hero_stone_rage", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_LIGHT = registerBlock("hero_stone_light", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_LIGHT = registerBlock("hero_stone_slab_light", () -> new SlabBlock(ofFullCopy(HERO_STONE_LIGHT.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_LIGHT = registerBlock("hero_stone_wall_light", () -> new WallBlock(ofFullCopy(HERO_STONE_LIGHT.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_LIGHT = registerBlock("hero_stone_stair_light", () -> new StairBlock(HERO_STONE_LIGHT.get().defaultBlockState(), ofFullCopy(HERO_STONE_LIGHT.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_LIGHT = registerBlock("chiseled_hero_stone_light", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_VOID = registerBlock("hero_stone_void", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_VOID = registerBlock("hero_stone_slab_void", () -> new SlabBlock(ofFullCopy(HERO_STONE_VOID.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_VOID = registerBlock("hero_stone_wall_void", () -> new WallBlock(ofFullCopy(HERO_STONE_VOID.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_VOID = registerBlock("hero_stone_stair_void", () -> new StairBlock(HERO_STONE_VOID.get().defaultBlockState(), ofFullCopy(HERO_STONE_VOID.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_VOID = registerBlock("chiseled_hero_stone_void", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_TIME = registerBlock("hero_stone_time", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_TIME = registerBlock("hero_stone_slab_time", () -> new SlabBlock(ofFullCopy(HERO_STONE_TIME.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_TIME = registerBlock("hero_stone_wall_time", () -> new WallBlock(ofFullCopy(HERO_STONE_TIME.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_TIME = registerBlock("hero_stone_stair_time", () -> new StairBlock(HERO_STONE_TIME.get().defaultBlockState(), ofFullCopy(HERO_STONE_TIME.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_TIME = registerBlock("chiseled_hero_stone_time", () -> new Block(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> HERO_STONE_SPACE = registerBlock("hero_stone_space", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<SlabBlock> HERO_STONE_SLAB_SPACE = registerBlock("hero_stone_slab_space", () -> new SlabBlock(ofFullCopy(HERO_STONE_SPACE.get())));
    public static final DeferredBlock<WallBlock> HERO_STONE_WALL_SPACE = registerBlock("hero_stone_wall_space", () -> new WallBlock(ofFullCopy(HERO_STONE_SPACE.get())));
    public static final DeferredBlock<StairBlock> HERO_STONE_STAIRS_SPACE = registerBlock("hero_stone_stair_space", () -> new StairBlock(HERO_STONE_SPACE.get().defaultBlockState(), ofFullCopy(HERO_STONE_SPACE.get())));
    public static final DeferredBlock<Block> CHISELED_HERO_STONE_SPACE = registerBlock("chiseled_hero_stone_space", () -> new Block(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> GRIST_BLOCK_AMBER = registerBlock("grist_block_amber", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_AMETHYST = registerBlock("grist_block_amethyst", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_ARTIFACT = registerBlock("grist_block_artifact", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_BUILD = registerBlock("grist_block_build", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_CAULK = registerBlock("grist_block_caulk", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_CHALK = registerBlock("grist_block_chalk", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_COBALT = registerBlock("grist_block_cobalt", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_DIAMOND = registerBlock("grist_block_diamond", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_GARNET = registerBlock("grist_block_garnet", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_GOLD = registerBlock("grist_block_gold", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_IODINE = registerBlock("grist_block_iodine", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_MARBLE = registerBlock("grist_block_marble", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_MERCURY = registerBlock("grist_block_mercury", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_QUARTZ = registerBlock("grist_block_quartz", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_RUBY = registerBlock("grist_block_ruby", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_RUST = registerBlock("grist_block_rust", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_SHALE = registerBlock("grist_block_shale", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_SULFUR = registerBlock("grist_block_sulfur", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_TAR = registerBlock("grist_block_tar", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_URANIUM = registerBlock("grist_block_uranium", () -> new Block(BlockBehaviour.Properties.of()));
    public static final DeferredBlock<Block> GRIST_BLOCK_ZILLIUM = registerBlock("grist_block_zillium", () -> new Block(BlockBehaviour.Properties.of()));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = REGISTRY.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
    {
        MsMItems.REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        REGISTRY.register(eventBus);
    }
}
