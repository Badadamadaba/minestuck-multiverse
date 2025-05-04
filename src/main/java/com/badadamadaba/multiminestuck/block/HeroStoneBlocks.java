package com.badadamadaba.multiminestuck.block;

import com.mraof.minestuck.block.ItemBlockPair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy;

public final class HeroStoneBlocks
{
    public static void init(){}

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_BLOOD = ItemBlockPair.register("hero_stone_blood", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_BLOOD = ItemBlockPair.register("hero_stone_slab_blood", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_BLOOD = ItemBlockPair.register("hero_stone_wall_blood", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_BLOOD = ItemBlockPair.register("hero_stone_stair_blood", () -> new StairBlock(HERO_STONE_BLOOD.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_BLOOD.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_BLOOD = ItemBlockPair.register("chiseled_hero_stone_blood", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_BREATH = ItemBlockPair.register("hero_stone_breath", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_BREATH = ItemBlockPair.register("hero_stone_slab_breath", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_BREATH = ItemBlockPair.register("hero_stone_wall_breath", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_BREATH = ItemBlockPair.register("hero_stone_stair_breath", () -> new StairBlock(HERO_STONE_BREATH.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_BREATH.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_BREATH = ItemBlockPair.register("chiseled_hero_stone_breath", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_DOOM = ItemBlockPair.register("hero_stone_doom", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_DOOM = ItemBlockPair.register("hero_stone_slab_doom", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_DOOM = ItemBlockPair.register("hero_stone_wall_doom", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_DOOM = ItemBlockPair.register("hero_stone_stair_doom", () -> new StairBlock(HERO_STONE_DOOM.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_DOOM.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_DOOM = ItemBlockPair.register("chiseled_hero_stone_doom", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_LIFE= ItemBlockPair.register("hero_stone_life", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_LIFE = ItemBlockPair.register("hero_stone_slab_life", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_LIFE = ItemBlockPair.register("hero_stone_wall_life", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_LIFE = ItemBlockPair.register("hero_stone_stair_life", () -> new StairBlock(HERO_STONE_LIFE.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_LIFE.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_LIFE = ItemBlockPair.register("chiseled_hero_stone_life", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_HEART = ItemBlockPair.register("hero_stone_heart", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_HEART = ItemBlockPair.register("hero_stone_slab_heart", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_HEART = ItemBlockPair.register("hero_stone_wall_heart", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_HEART = ItemBlockPair.register("hero_stone_stair_heart", () -> new StairBlock(HERO_STONE_HEART.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_HEART.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_HEART = ItemBlockPair.register("chiseled_hero_stone_heart", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_MIND = ItemBlockPair.register("hero_stone_mind", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_MIND = ItemBlockPair.register("hero_stone_slab_mind", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_MIND = ItemBlockPair.register("hero_stone_wall_mind", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_MIND = ItemBlockPair.register("hero_stone_stair_mind", () -> new StairBlock(HERO_STONE_MIND.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_MIND.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_MIND = ItemBlockPair.register("chiseled_hero_stone_mind", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_HOPE = ItemBlockPair.register("hero_stone_hope", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_HOPE = ItemBlockPair.register("hero_stone_slab_hope", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_HOPE = ItemBlockPair.register("hero_stone_wall_hope", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_HOPE = ItemBlockPair.register("hero_stone_stair_hope", () -> new StairBlock(HERO_STONE_HOPE.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_HOPE.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_HOPE = ItemBlockPair.register("chiseled_hero_stone_hope", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_RAGE = ItemBlockPair.register("hero_stone_rage", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_RAGE = ItemBlockPair.register("hero_stone_slab_rage", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_RAGE = ItemBlockPair.register("hero_stone_wall_rage", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_RAGE = ItemBlockPair.register("hero_stone_stair_rage", () -> new StairBlock(HERO_STONE_RAGE.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_RAGE.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_RAGE = ItemBlockPair.register("chiseled_hero_stone_rage", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_LIGHT = ItemBlockPair.register("hero_stone_light", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_LIGHT = ItemBlockPair.register("hero_stone_slab_light", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_LIGHT = ItemBlockPair.register("hero_stone_wall_light", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_LIGHT = ItemBlockPair.register("hero_stone_stair_light", () -> new StairBlock(HERO_STONE_LIGHT.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_LIGHT.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_LIGHT = ItemBlockPair.register("chiseled_hero_stone_light", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_VOID = ItemBlockPair.register("hero_stone_void", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_VOID = ItemBlockPair.register("hero_stone_slab_void", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_VOID = ItemBlockPair.register("hero_stone_wall_void", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_VOID = ItemBlockPair.register("hero_stone_stair_void", () -> new StairBlock(HERO_STONE_VOID.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_VOID.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_VOID = ItemBlockPair.register("chiseled_hero_stone_void", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_TIME = ItemBlockPair.register("hero_stone_time", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_TIME = ItemBlockPair.register("hero_stone_slab_time", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_TIME = ItemBlockPair.register("hero_stone_wall_time", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_TIME = ItemBlockPair.register("hero_stone_stair_time", () -> new StairBlock(HERO_STONE_TIME.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_TIME.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_TIME = ItemBlockPair.register("chiseled_hero_stone_time", () -> new Block(BlockBehaviour.Properties.of()));

    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SPACE = ItemBlockPair.register("hero_stone_space", () -> new Block(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_SLAB_SPACE = ItemBlockPair.register("hero_stone_slab_space", () -> new SlabBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_WALL_SPACE = ItemBlockPair.register("hero_stone_wall_space", () -> new WallBlock(BlockBehaviour.Properties.of()));
    public static final ItemBlockPair<Block, BlockItem> HERO_STONE_STAIRS_SPACE = ItemBlockPair.register("hero_stone_stair_space", () -> new StairBlock(HERO_STONE_SPACE.asBlock().defaultBlockState(), ofFullCopy(HERO_STONE_SPACE.asBlock())));
    public static final ItemBlockPair<Block, BlockItem> CHISELED_HERO_STONE_SPACE = ItemBlockPair.register("chiseled_hero_stone_space", () -> new Block(BlockBehaviour.Properties.of()));

}
