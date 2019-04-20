package timaxa007.easy_easy_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import timaxa007.easy_easy_mod.block.BlockOreOverworld;
import timaxa007.easy_easy_mod.item.ItemChunkOreOverworld;

@Mod(modid = EasyEasyMod.MODID, name = EasyEasyMod.NAME, version = EasyEasyMod.VERSION)
public class EasyEasyMod {

	public static final String
	MODID = "easy_easy_mod",
	NAME = "Easy Easy Mod",
	VERSION = "1.1";

	@Mod.Instance(MODID)
	public static EasyEasyMod instance;

	@SidedProxy(modId = MODID,
			serverSide = "timaxa007.easy_easy_mod.ProxyCommon",
			clientSide = "timaxa007.easy_easy_mod.client.ProxyClient")
	public static ProxyCommon proxy;

	public static final CreativeTabs tabEasyEasyMod = new CreativeTabs("tab_easy_easy_mod") {
		@Override public Item getTabIconItem() {
			return item_chunk_ore_overworld;
		}
	};

	public static Block block_ore_overworld;

	public static Item item_chunk_ore_overworld;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		block_ore_overworld = new BlockOreOverworld();
		GameRegistry.registerBlock(block_ore_overworld, "block_ore_overworld");

		item_chunk_ore_overworld = new ItemChunkOreOverworld()
				.setUnlocalizedName(MODID + ".ore_overworld").setTextureName(MODID + ":chunk_ore_overworld")
				.setCreativeTab(tabEasyEasyMod);
		GameRegistry.registerItem(item_chunk_ore_overworld, "item_chunk_ore_overworld");

		GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);

		proxy.preInit(event);
	}

}
