
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.entitysplaygroundmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.entitysplaygroundmod.block.Weedplantstage0Block;
import net.mcreator.entitysplaygroundmod.EntitysPlaygroundModMod;

public class EntitysPlaygroundModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EntitysPlaygroundModMod.MODID);
	public static final RegistryObject<Block> WEEDPLANTSTAGE_0 = REGISTRY.register("weedplantstage_0", () -> new Weedplantstage0Block());
}
