
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mp.slave_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mp.slave_mod.item.WhipToolItem;
import mp.slave_mod.item.WhipEndingItemItem;
import mp.slave_mod.item.SpearItem;
import mp.slave_mod.item.NigraniumnuggetItem;
import mp.slave_mod.item.NigraniumingotItem;
import mp.slave_mod.item.NigraniumcarrotItem;
import mp.slave_mod.item.NigraniumSwordItem;
import mp.slave_mod.item.NigraniumShovelItem;
import mp.slave_mod.item.NigraniumShearsItem;
import mp.slave_mod.item.NigraniumPickaxeItem;
import mp.slave_mod.item.NigraniumHoeItem;
import mp.slave_mod.item.NigraniumAxeItem;
import mp.slave_mod.item.NigraniumArmorItem;
import mp.slave_mod.item.KrajinaItem;
import mp.slave_mod.item.KKKarmorItem;
import mp.slave_mod.item.HarvestedCottonItem;
import mp.slave_mod.item.EmptyAmuletItem;
import mp.slave_mod.item.CottonseedsItem;
import mp.slave_mod.item.ChainpieceItem;
import mp.slave_mod.item.ChainItem;
import mp.slave_mod.item.CarrotLeftoverItem;
import mp.slave_mod.item.BavlnaItem;
import mp.slave_mod.item.AmuletItem;
import mp.slave_mod.SlaveModMod;

public class SlaveModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SlaveModMod.MODID);
	public static final RegistryObject<Item> SLAVE_SPAWN_EGG = REGISTRY.register("slave_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.SLAVE, -9283052, -13949916, new Item.Properties()));
	public static final RegistryObject<Item> KRAJINA = REGISTRY.register("krajina", () -> new KrajinaItem());
	public static final RegistryObject<Item> RANGED_SLAVE_SPAWN_EGG = REGISTRY.register("ranged_slave_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.RANGED_SLAVE, -11250604, -13949916, new Item.Properties()));
	public static final RegistryObject<Item> SLAVE_BOSS_SPAWN_EGG = REGISTRY.register("slave_boss_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.SLAVE_BOSS, -13491692, -598156, new Item.Properties()));
	public static final RegistryObject<Item> SLAVE_ANIMAL_SPAWN_EGG = REGISTRY.register("slave_animal_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.SLAVE_ANIMAL, -14467048, -13949916, new Item.Properties()));
	public static final RegistryObject<Item> NEHORICI_DREVO_OAK = block(SlaveModModBlocks.NEHORICI_DREVO_OAK);
	public static final RegistryObject<Item> KK_KACTIVATING_B_LOCK = block(SlaveModModBlocks.KK_KACTIVATING_B_LOCK);
	public static final RegistryObject<Item> COTTONSEEDS = REGISTRY.register("cottonseeds", () -> new CottonseedsItem());
	public static final RegistryObject<Item> BAVLNA = REGISTRY.register("bavlna", () -> new BavlnaItem());
	public static final RegistryObject<Item> KK_KARMOR_HELMET = REGISTRY.register("kk_karmor_helmet", () -> new KKKarmorItem.Helmet());
	public static final RegistryObject<Item> KK_KARMOR_CHESTPLATE = REGISTRY.register("kk_karmor_chestplate", () -> new KKKarmorItem.Chestplate());
	public static final RegistryObject<Item> KK_KARMOR_LEGGINGS = REGISTRY.register("kk_karmor_leggings", () -> new KKKarmorItem.Leggings());
	public static final RegistryObject<Item> KK_KARMOR_BOOTS = REGISTRY.register("kk_karmor_boots", () -> new KKKarmorItem.Boots());
	public static final RegistryObject<Item> COTTONSTAGE_0 = block(SlaveModModBlocks.COTTONSTAGE_0);
	public static final RegistryObject<Item> HARVESTED_COTTON = REGISTRY.register("harvested_cotton", () -> new HarvestedCottonItem());
	public static final RegistryObject<Item> COTTONSTAGE_1 = block(SlaveModModBlocks.COTTONSTAGE_1);
	public static final RegistryObject<Item> COTTONSTAGE_2 = block(SlaveModModBlocks.COTTONSTAGE_2);
	public static final RegistryObject<Item> COTTONSTAGE_7 = block(SlaveModModBlocks.COTTONSTAGE_7);
	public static final RegistryObject<Item> COTTONSTAGE_5 = block(SlaveModModBlocks.COTTONSTAGE_5);
	public static final RegistryObject<Item> COTTONSTAGE_6 = block(SlaveModModBlocks.COTTONSTAGE_6);
	public static final RegistryObject<Item> COTTONSTAGE_3 = block(SlaveModModBlocks.COTTONSTAGE_3);
	public static final RegistryObject<Item> COTTONSTAGE_4 = block(SlaveModModBlocks.COTTONSTAGE_4);
	public static final RegistryObject<Item> WODENCROSSBASEBLOCK = block(SlaveModModBlocks.WODENCROSSBASEBLOCK);
	public static final RegistryObject<Item> OTROK_SPAWN_EGG = REGISTRY.register("otrok_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.OTROK, -6204094, -13762303, new Item.Properties()));
	public static final RegistryObject<Item> NIGRANIUMNUGGET = REGISTRY.register("nigraniumnugget", () -> new NigraniumnuggetItem());
	public static final RegistryObject<Item> NIGRANIUM = block(SlaveModModBlocks.NIGRANIUM);
	public static final RegistryObject<Item> NIGRANIUMINGOT = REGISTRY.register("nigraniumingot", () -> new NigraniumingotItem());
	public static final RegistryObject<Item> CHAINPIECE = REGISTRY.register("chainpiece", () -> new ChainpieceItem());
	public static final RegistryObject<Item> CHAIN = REGISTRY.register("chain", () -> new ChainItem());
	public static final RegistryObject<Item> NIGRANIUM_AXE = REGISTRY.register("nigranium_axe", () -> new NigraniumAxeItem());
	public static final RegistryObject<Item> NIGRANIUM_HOE = REGISTRY.register("nigranium_hoe", () -> new NigraniumHoeItem());
	public static final RegistryObject<Item> NIGRANIUM_SWORD = REGISTRY.register("nigranium_sword", () -> new NigraniumSwordItem());
	public static final RegistryObject<Item> NIGRANIUM_PICKAXE = REGISTRY.register("nigranium_pickaxe", () -> new NigraniumPickaxeItem());
	public static final RegistryObject<Item> NIGRANIUM_SHOVEL = REGISTRY.register("nigranium_shovel", () -> new NigraniumShovelItem());
	public static final RegistryObject<Item> NIGRANIUM_SHEARS = REGISTRY.register("nigranium_shears", () -> new NigraniumShearsItem());
	public static final RegistryObject<Item> JOZEF_SPAWN_EGG = REGISTRY.register("jozef_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.JOZEF, -10835, -15592942, new Item.Properties()));
	public static final RegistryObject<Item> NIGRANIUM_ARMOR_HELMET = REGISTRY.register("nigranium_armor_helmet", () -> new NigraniumArmorItem.Helmet());
	public static final RegistryObject<Item> NIGRANIUM_ARMOR_CHESTPLATE = REGISTRY.register("nigranium_armor_chestplate", () -> new NigraniumArmorItem.Chestplate());
	public static final RegistryObject<Item> NIGRANIUM_ARMOR_LEGGINGS = REGISTRY.register("nigranium_armor_leggings", () -> new NigraniumArmorItem.Leggings());
	public static final RegistryObject<Item> NIGRANIUM_ARMOR_BOOTS = REGISTRY.register("nigranium_armor_boots", () -> new NigraniumArmorItem.Boots());
	public static final RegistryObject<Item> WHIP_TOOL = REGISTRY.register("whip_tool", () -> new WhipToolItem());
	public static final RegistryObject<Item> ENSLAVED_GLOWSTONE = block(SlaveModModBlocks.ENSLAVED_GLOWSTONE);
	public static final RegistryObject<Item> WHIP_ENDING_ITEM = REGISTRY.register("whip_ending_item", () -> new WhipEndingItemItem());
	public static final RegistryObject<Item> CARROT_LEFTOVER = REGISTRY.register("carrot_leftover", () -> new CarrotLeftoverItem());
	public static final RegistryObject<Item> AMULET = REGISTRY.register("amulet", () -> new AmuletItem());
	public static final RegistryObject<Item> EMPTY_AMULET = REGISTRY.register("empty_amulet", () -> new EmptyAmuletItem());
	public static final RegistryObject<Item> NIGRANIUM_GOLEM_SPAWN_EGG = REGISTRY.register("nigranium_golem_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.NIGRANIUM_GOLEM, -13684945, -11908534, new Item.Properties()));
	public static final RegistryObject<Item> NIGRANIUM_BLOCK = block(SlaveModModBlocks.NIGRANIUM_BLOCK);
	public static final RegistryObject<Item> ENSLAVER_SPAWN_EGG = REGISTRY.register("enslaver_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.ENSLAVER, -6750208, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> IRONBARFOR_NOPLESES = block(SlaveModModBlocks.IRONBARFOR_NOPLESES);
	public static final RegistryObject<Item> UNDESTRUCTABLESPRUCEPLANK = block(SlaveModModBlocks.UNDESTRUCTABLESPRUCEPLANK);
	public static final RegistryObject<Item> UNDESTRUCTABLESLAB = block(SlaveModModBlocks.UNDESTRUCTABLESLAB);
	public static final RegistryObject<Item> WHEEL = block(SlaveModModBlocks.WHEEL);
	public static final RegistryObject<Item> ENCAGED_OTROK_SPAWN_EGG = REGISTRY.register("encaged_otrok_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.ENCAGED_OTROK, -13421773, -16737895, new Item.Properties()));
	public static final RegistryObject<Item> ENCAGED_OTROK_2_SPAWN_EGG = REGISTRY.register("encaged_otrok_2_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.ENCAGED_OTROK_2, -13421773, -6750055, new Item.Properties()));
	public static final RegistryObject<Item> NEGROMANCER_SPAWN_EGG = REGISTRY.register("negromancer_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.NEGROMANCER, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> NEGRO_MINION_SPAWN_EGG = REGISTRY.register("negro_minion_spawn_egg", () -> new ForgeSpawnEggItem(SlaveModModEntities.NEGRO_MINION, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> SPEAR = REGISTRY.register("spear", () -> new SpearItem());
	public static final RegistryObject<Item> NIGRANIUMCARROT = REGISTRY.register("nigraniumcarrot", () -> new NigraniumcarrotItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
