package net.mcreator.greekgods;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementsgreekgods.ModElement.Tag
public class MCreatorLighingSwordToolInHandTick extends Elementsgreekgods.ModElement {
	public MCreatorLighingSwordToolInHandTick(Elementsgreekgods instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorLighingSwordToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 3, (int) 1, (true), (true)));
	}
}
