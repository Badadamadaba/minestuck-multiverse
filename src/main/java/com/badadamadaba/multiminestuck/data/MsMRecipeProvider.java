package com.badadamadaba.multiminestuck.data;

import com.badadamadaba.multiminestuck.block.MsMBlocks;
import com.badadamadaba.multiminestuck.item.MsMItems;
import com.mraof.minestuck.api.alchemy.GristTypes;
import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.mraof.minestuck.item.MSItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class MsMRecipeProvider extends RecipeProvider
{
    public MsMRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput)
    {
        //ITEMS
        CombinationRecipeBuilder.of(MsMItems.MOONSTONE)
                .input(Items.END_STONE).or().input(MSItems.RAW_CRUXITE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMItems.MOONSTONE)
                .grist(GristTypes.BUILD,5).grist(GristTypes.COBALT,4).grist(GristTypes.AMETHYST,3).grist(GristTypes.URANIUM,2)
                .build(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MsMItems.MOONSTONE_CHISEL)
                .pattern(" X")
                .pattern("# ")
                .define('X', MsMItems.MOONSTONE)
                .define('#', Items.STICK)
                .unlockedBy("has_moonstone", has(MsMItems.MOONSTONE))
                .save(recipeOutput);

        GristCostRecipeBuilder.of(MsMItems.ZILLYSTONE_SHARD)
                .grist(GristTypes.ZILLIUM, 1)
                .build(recipeOutput);

        //BLOCKS
        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_AMBER)
                .input(MSItems.AMBER_GUMMY_WORM).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_AMBER)
                .grist(GristTypes.AMBER, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_AMETHYST)
                .input(MSItems.AMETHYST_HARD_CANDY).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_AMETHYST)
                .grist(GristTypes.AMETHYST, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_ARTIFACT)
                .input(MSItems.ARTIFACT_WARHEAD).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_ARTIFACT)
                .grist(GristTypes.ARTIFACT, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_BUILD)
                .input(MSItems.BUILD_GUSHERS).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_BUILD)
                .grist(GristTypes.BUILD, 1000)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_CAULK)
                .input(MSItems.CAULK_PRETZEL).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_CAULK)
                .grist(GristTypes.CAULK, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_CHALK)
                .input(MSItems.CHALK_CANDY_CIGARETTE).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_CHALK)
                .grist(GristTypes.CHALK, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_COBALT)
                .input(MSItems.COBALT_GUM).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_COBALT)
                .grist(GristTypes.COBALT, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_DIAMOND)
                .input(MSItems.DIAMOND_MINT).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_DIAMOND)
                .grist(GristTypes.DIAMOND, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_GARNET)
                .input(MSItems.GARNET_TWIX).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_GARNET)
                .grist(GristTypes.GARNET, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_GOLD)
                .input(MSItems.GOLD_CANDY_RIBBON).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_GOLD)
                .grist(GristTypes.GOLD, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_IODINE)
                .input(MSItems.IODINE_LICORICE).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_IODINE)
                .grist(GristTypes.IODINE, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_MARBLE)
                .input(MSItems.MARBLE_JAWBREAKER).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_MARBLE)
                .grist(GristTypes.MARBLE, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_MERCURY)
                .input(MSItems.MERCURY_SIXLETS).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_MERCURY)
                .grist(GristTypes.MERCURY, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_QUARTZ)
                .input(MSItems.QUARTZ_JELLY_BEAN).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_QUARTZ)
                .grist(GristTypes.QUARTZ, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_RUBY)
                .input(MSItems.RUBY_LOLLIPOP).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_RUBY)
                .grist(GristTypes.RUBY, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_RUST)
                .input(MSItems.RUST_GUMMY_EYE).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_RUST)
                .grist(GristTypes.RUST, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_SHALE)
                .input(MSItems.SHALE_PEEP).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_SHALE)
                .grist(GristTypes.SHALE, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_SULFUR)
                .input(MSItems.SULFUR_CANDY_APPLE).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_SULFUR)
                .grist(GristTypes.SULFUR, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_TAR)
                .input(MSItems.TAR_LICORICE).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_TAR)
                .grist(GristTypes.TAR, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_URANIUM)
                .input(MSItems.URANIUM_GUMMY_BEAR).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_URANIUM)
                .grist(GristTypes.URANIUM, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_ZILLIUM)
                .input(MSItems.ZILLIUM_SKITTLES).and().input(Items.STONE)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.GRIST_BLOCK_ZILLIUM)
                .grist(GristTypes.ZILLIUM, 100)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.SBAHJ_BEDROCK)
                .input(MSItems.SBAHJ_POSTER).and().input(Blocks.BEDROCK)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.SBAHJ_BEDROCK)
                .grist(GristTypes.ARTIFACT, 1000)
                .build(recipeOutput);

        CombinationRecipeBuilder.of(MsMBlocks.ZILLYSTONE)
                .input(MsMBlocks.SBAHJ_BEDROCK).or().input(MSItems.ZILLIUM_SKITTLES)
                .build(recipeOutput);
        GristCostRecipeBuilder.of(MsMBlocks.ZILLYSTONE)
                .grist(GristTypes.ZILLIUM, 1).grist(GristTypes.BUILD, 100)
                .build(recipeOutput);
    }
}
