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
	public static Item itemSapphire;
	public static Item itemSilver;
	public static Item itemPlatinum;
	public static Item itemLeadBar;
	public static Item itemZincIngot;
	public static Block blockAmethystOre;
	public static Block blockSilverOre;
	public static Block blockLeadOre;
	public static Block blockPlatinum;
	public static Block blockSapphireOre;
	public static Block blockZincOre;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		itemAmethyst = new ItemAmethyst().setUnlocalizedName("ItemAmethyst").setTextureName("toomuchores:amethyst_gem").setCreativeTab(tabTooMuchOresIngots);
		itemZincIngot = new ItemZincIngot().setUnlocalizedName("ItemZincIngot").setTextureName("toomuchores:zinc_ingot").setCreativeTab(tabTooMuchOresIngots);
		itemPlatinum = new ItemPlatinum().setUnlocalizedName("ItemPlatinum").setTextureName("toomuchores:platinum_ingot").setCreativeTab(tabTooMuchOresIngots);
		itemSilver = new ItemSilver().setUnlocalizedName("ItemSilver").setTextureName("toomuchores:silver_bar").setCreativeTab(tabTooMuchOresIngots);
		itemLeadBar = new ItemLeadBar().setUnlocalizedName("ItemLeadBar").setTextureName("toomuchores:lead_ingot").setCreativeTab(tabTooMuchOresIngots);
		itemSapphire = new ItemSapphire().setUnlocalizedName("ItemSapphire").setTextureName("toomuchores:sapphire_gemstone").setCreativeTab(tabTooMuchOresIngots);
		blockAmethystOre = new BlockAmethystOre(Material.rock).setBlockName("BlockAmethystOre").setBlockTextureName("toomuchores:amethyst_ore").setCreativeTab(tabTooMuchOres);
		blockSilverOre = new BlockSilverOre(Material.rock).setBlockName("BlockSilverOre").setBlockTextureName("toomuchores:sliver_ore").setCreativeTab(tabTooMuchOres);
		blockSapphireOre = new BlockSapphireOre(Material.rock).setBlockName("BlockSapphireOre").setBlockTextureName("toomuchores:sapphire_ore").setCreativeTab(tabTooMuchOres);
		blockLeadOre = new BlockLeadOre(Material.rock).setBlockName("BlockLeadOre").setBlockTextureName("toomuchores:lead_ore").setCreativeTab(tabTooMuchOres);
		blockPlatinum = new BlockPlatinum(Material.rock).setBlockName("BlockPlatinum").setBlockTextureName("toomuchores:platinum_ore").setCreativeTab(tabTooMuchOres);
		blockZincOre = new BlockZincOre(Material.rock).setBlockName("BlockZincOre").setBlockTextureName("toomuchores:zinc_ore").setCreativeTab(tabTooMuchOres);
		
		
		
		GameRegistry.registerItem(itemAmethyst, itemAmethyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemZincIngot, itemZincIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSapphire, itemSapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemPlatinum, itemPlatinum.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSilver, itemSilver.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemLeadBar, itemLeadBar.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAmethystOre, blockAmethystOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPlatinum, blockPlatinum.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSilverOre, blockSilverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLeadOre, blockLeadOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapphireOre, blockSapphireOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockZincOre, blockZincOre.getUnlocalizedName().substring(5));
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
