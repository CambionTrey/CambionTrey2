package net.mcreator.greekgods;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsgreekgods.ModElement.Tag
public class MCreatorGreekGoditem extends Elementsgreekgods.ModElement {
	public MCreatorGreekGoditem(Elementsgreekgods instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgreekgoditem") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorZeus.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
