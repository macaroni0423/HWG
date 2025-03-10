package mod.azure.hwg.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import mod.azure.hwg.item.weapons.HWGGunBase;
import mod.azure.hwg.item.weapons.HWGGunLoadedBase;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@Mixin(PlayerEntityRenderer.class)
public class WeaponRenderingMixin {

	@Inject(method = "getArmPose", at = @At(value = "TAIL"), cancellable = true)
	private static void tryItemPose(AbstractClientPlayerEntity player, Hand hand,
			CallbackInfoReturnable<BipedEntityModel.ArmPose> ci) {
		ItemStack itemstack = player.getStackInHand(hand);
		if (itemstack.getItem() instanceof HWGGunLoadedBase || itemstack.getItem() instanceof HWGGunBase) {
			ci.setReturnValue(BipedEntityModel.ArmPose.BOW_AND_ARROW);
		}
	}
}
