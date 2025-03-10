package mod.azure.hwg.client;

import mod.azure.hwg.util.registry.HWGItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModelProviderinit {

	public static void init() {
		ModelPredicateProviderRegistry.register(HWGItems.ROCKETLAUNCHER, new Identifier("broken"),
				(itemStack, clientWorld, livingEntity, seed) -> {
					return isUsable(itemStack) ? 0.0F : 1.0F;
				});
		ModelPredicateProviderRegistry.register(HWGItems.SNIPER, new Identifier("scoped"),
				(itemStack, clientWorld, livingEntity, seed) -> {
					if (livingEntity != null)
						return isScoped() ? 1.0F : 0.0F;
					return 0.0F;
				});
	}

	private static boolean isUsable(ItemStack stack) {
		return stack.getDamage() < stack.getMaxDamage() - 1;
	}

	private static boolean isScoped() {
		return ClientInit.scope.isPressed();
	}
}