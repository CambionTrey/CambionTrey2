package net.mcreator.greekgods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsgreekgods.ModElement.Tag
public class MCreatorZeusBodyTickEvent extends Elementsgreekgods.ModElement {
	public MCreatorZeusBodyTickEvent(Elementsgreekgods instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorZeusBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).capabilities.allowFlying = (true);
	}
}
