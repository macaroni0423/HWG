package mod.azure.hwg.util.registry;

import mod.azure.hwg.HWGMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HWGSounds {

	public static SoundEvent AK = of("hwg.ak");
	public static SoundEvent RPG = of("hwg.rpg");
	public static SoundEvent SMG = of("hwg.smg");
	public static SoundEvent LUGER = of("hwg.luger");
	public static SoundEvent TOMMY = of("hwg.tommy");
	public static SoundEvent PISTOL = of("hwg.pistol");
	public static SoundEvent SNIPER = of("hwg.sniper");
	public static SoundEvent MINIGUN = of("hwg.minigun");
	public static SoundEvent SHOTGUN = of("hwg.shotgun");
	public static SoundEvent SPISTOL = of("hwg.spistol");
	public static SoundEvent FLAREGUN = of("hwg.flare_gun");
	public static SoundEvent REVOLVER = of("hwg.revolver");
	public static SoundEvent CLIPRELOAD = of("hwg.clipreload");
	public static SoundEvent PISTOLRELOAD = of("hwg.pistolreload");
	public static SoundEvent SNIPERRELOAD = of("hwg.sniperreload");
	public static SoundEvent SHOTGUNRELOAD = of("hwg.shotgunreload");
	public static SoundEvent GLAUNCHERFIRE = of("hwg.glauncher-fire");
	public static SoundEvent REVOLVERRELOAD = of("hwg.revolverreload");
	public static SoundEvent GLAUNCHERRELOAD = of("hwg.glauncher-reload");

	static SoundEvent of(String id) {
		SoundEvent sound = new SoundEvent(new Identifier(HWGMod.MODID, id));
		Registry.register(Registry.SOUND_EVENT, new Identifier(HWGMod.MODID, id), sound);
		return sound;
	}
}
