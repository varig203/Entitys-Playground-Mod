
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.entitysplaygroundmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.entitysplaygroundmod.EntitysPlaygroundModMod;

public class EntitysPlaygroundModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EntitysPlaygroundModMod.MODID);
	public static final RegistryObject<Item> WEEDPLANTSTAGE_0 = block(EntitysPlaygroundModModBlocks.WEEDPLANTSTAGE_0, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
