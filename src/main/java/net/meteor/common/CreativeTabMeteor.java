package net.meteor.common;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabMeteor extends CreativeTabs {

	public CreativeTabMeteor(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getIconItemStack()
    {
        return new ItemStack(MeteorBlocks.blockMeteor, 1, 1);
    }
	
	@SideOnly(Side.CLIENT)
	@Override
    public void displayAllReleventItems(List par1List) {
		super.displayAllReleventItems(par1List);
		par1List.add(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(MeteorsMod.ColdTouch, MeteorsMod.ColdTouch.getMaxLevel())));
		par1List.add(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(MeteorsMod.Magnetization, MeteorsMod.Magnetization.getMaxLevel())));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return MeteorItems.itemMeteorChips;
	}

}
