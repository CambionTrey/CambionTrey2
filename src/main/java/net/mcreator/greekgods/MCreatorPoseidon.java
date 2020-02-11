package net.mcreator.greekgods;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsgreekgods.ModElement.Tag
public class MCreatorPoseidon extends Elementsgreekgods.ModElement {
	@GameRegistry.ObjectHolder("greekgods:poseidonhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("greekgods:poseidonbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("greekgods:poseidonlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("greekgods:poseidonboots")
	public static final Item boots = null;

	public MCreatorPoseidon(Elementsgreekgods instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("POSEIDON", "greekgods:poseidon_", 25, new int[]{4, 10, 12, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("poseidonhelmet")
				.setRegistryName("poseidonhelmet").setCreativeTab(MCreatorGreekGoditem.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					MCreatorPoseidonBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("poseidonbody").setRegistryName("poseidonbody").setCreativeTab(MCreatorGreekGoditem.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("poseidonlegs").setRegistryName("poseidonlegs")
				.setCreativeTab(MCreatorGreekGoditem.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("poseidonboots")
				.setRegistryName("poseidonboots").setCreativeTab(MCreatorGreekGoditem.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("greekgods:poseidonhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("greekgods:poseidonbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("greekgods:poseidonlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("greekgods:poseidonboots", "inventory"));
	}
}
