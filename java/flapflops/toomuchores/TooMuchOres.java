package flapflops.toomuchores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "toomuchores", name = "Too Much Ores", version = "1.0.0")
public class TooMuchOres {
	
	public static Item itemAmethyst;
	public static Item itemSilver;
	public static Item itemLeadBar;
	public static Block blockAmethystOre;
	public static Block blockSilverOre;
	public static Block blockLeadOre;
	public static Block blockAmethyst;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		itemAmethyst = new ItemAmethyst().setUnlocalizedName("ItemAmethyst").setTextureName("toomuchores:amethyst_gem").setCreativeTab(tabTooMuchOresIngots);
		itemSilver = new ItemSilver().setUnlocalizedName("ItemSilver").setTextureName("toomuchores:silver_bar").setCreativeTab(tabTooMuchOresIngots);
		itemLeadBar = new ItemLeadBar().setUnlocalizedName("ItemLeadBar").setTextureName("toomuchores:lead_ingot").setCreativeTab(tabTooMuchOresIngots);
		blockAmethystOre = new BlockAmethystOre(Material.rock).setBlockName("BlockAmethystOre").setBlockTextureName("toomuchores:amethyst_ore").setCreativeTab(tabTooMuchOres);
		blockSilverOre = new BlockSilverOre(Material.rock).setBlockName("BlockSilverOre").setBlockTextureName("toomuchores:sliver_ore").setCreativeTab(tabTooMuchOres);
		blockLeadOre = new BlockLeadOre(Material.rock).setBlockName("BlockLeadOre").setBlockTextureName("toomuchores:lead_ore").setCreativeTab(tabTooMuchOres);
		blockAmethyst = new BlockAmethyst(Material.rock).setBlockName("BlockAmethyst").setBlockTextureName("toomuchores:amethyst_block").setCreativeTab(tabTooMuchOres);
		
		
		
		GameRegistry.registerItem(itemAmethyst, itemAmethyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSilver, itemSilver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLeadBar, itemLeadBar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAmethystOre, blockAmethystOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSilverOre, blockSilverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeadOre, blockLeadOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAmethyst, blockAmethyst.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabTooMuchOres = new CreativeTabs("tabTooMuchOres") {
		@Override
		public Item getTabIconItem(){
			return new ItemStack(blockAmethystOre).getItem();
		}
	};
	
	public static CreativeTabs tabTooMuchOresIngots = new CreativeTabs("tabTooMuchOresIngots") {
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemAmethyst).getItem();
		}
	};
}
