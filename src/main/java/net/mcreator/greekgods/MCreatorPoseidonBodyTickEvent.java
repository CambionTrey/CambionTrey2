package net.mcreator.greekgods;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgreekgods.ModElement.Tag
public class MCreatorPoseidonBodyTickEvent extends Elementsgreekgods.ModElement {
	public MCreatorPoseidonBodyTickEvent(Elementsgreekgods instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorPoseidonBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, (int) 60, (int) 1, (true), (true)));
	}
}
