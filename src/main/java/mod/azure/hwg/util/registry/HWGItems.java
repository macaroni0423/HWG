package mod.azure.hwg.util.registry;

import java.util.HashMap;
import java.util.Map;

import mod.azure.hwg.HWGMod;
import mod.azure.hwg.item.HWGSpawnEgg;
import mod.azure.hwg.item.ammo.BulletAmmo;
import mod.azure.hwg.item.ammo.FlareItem;
import mod.azure.hwg.item.ammo.GrenadeEmpItem;
import mod.azure.hwg.item.ammo.GrenadeFragItem;
import mod.azure.hwg.item.ammo.GrenadeNapalmItem;
import mod.azure.hwg.item.ammo.GrenadeSmokeItem;
import mod.azure.hwg.item.ammo.GrenadeStunItem;
import mod.azure.hwg.item.weapons.Assasult1Item;
import mod.azure.hwg.item.weapons.Assasult2Item;
import mod.azure.hwg.item.weapons.AssasultItem;
import mod.azure.hwg.item.weapons.BalrogItem;
import mod.azure.hwg.item.weapons.BrimstoneItem;
import mod.azure.hwg.item.weapons.FlamethrowerItem;
import mod.azure.hwg.item.weapons.FlareGunItem;
import mod.azure.hwg.item.weapons.GPistolItem;
import mod.azure.hwg.item.weapons.GrenadeLauncherItem;
import mod.azure.hwg.item.weapons.HellhorseRevolverItem;
import mod.azure.hwg.item.weapons.LugerItem;
import mod.azure.hwg.item.weapons.Meanie1Item;
import mod.azure.hwg.item.weapons.Meanie2Item;
import mod.azure.hwg.item.weapons.Minigun;
import mod.azure.hwg.item.weapons.PistolItem;
import mod.azure.hwg.item.weapons.RocketLauncher;
import mod.azure.hwg.item.weapons.SPistolItem;
import mod.azure.hwg.item.weapons.ShotgunItem;
import mod.azure.hwg.item.weapons.SniperItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HWGItems {

	public static Minigun MINIGUN = item(new Minigun(), "minigun");
	public static LugerItem LUGER = item(new LugerItem(), "luger");
	public static PistolItem PISTOL = item(new PistolItem(), "pistol");
	public static BulletAmmo ROCKET = item(new BulletAmmo(), "rocket");
	public static BulletAmmo BULLETS = item(new BulletAmmo(), "bullets");
	public static BalrogItem BALROG = item(new BalrogItem(), "balrog_gun");
	public static FlareItem RED_FLARE = item(new FlareItem(), "red_flare");
	public static ShotgunItem SHOTGUN = item(new ShotgunItem(), "shotgun");
	public static SPistolItem SPISTOL = item(new SPistolItem(), "spistol");
	public static FlareItem BLUE_FLARE = item(new FlareItem(), "blue_flare");
	public static FlareItem CYAN_FLARE = item(new FlareItem(), "cyan_flare");
	public static FlareItem GRAY_FLARE = item(new FlareItem(), "gray_flare");
	public static FlareItem LIME_FLARE = item(new FlareItem(), "lime_flare");
	public static FlareItem PINK_FLARE = item(new FlareItem(), "pink_flare");
	public static SniperItem SNIPER = item(new SniperItem(), "sniper_rifle");
	public static FlareItem BLACK_FLARE = item(new FlareItem(), "black_flare");
	public static FlareItem BROWN_FLARE = item(new FlareItem(), "brown_flare");
	public static FlareItem GREEN_FLARE = item(new FlareItem(), "green_flare");
	public static FlareItem WHITE_FLARE = item(new FlareItem(), "white_flare");
	public static Meanie1Item MEANIE1 = item(new Meanie1Item(), "meanie_gun_1");
	public static Meanie2Item MEANIE2 = item(new Meanie2Item(), "meanie_gun_2");
	public static FlareGunItem FLARE_GUN = item(new FlareGunItem(), "flare_gun");
	public static FlareItem ORANGE_FLARE = item(new FlareItem(), "orange_flare");
	public static FlareItem PURPLE_FLARE = item(new FlareItem(), "purple_flare");
	public static FlareItem YELLOW_FLARE = item(new FlareItem(), "yellow_flare");
	public static GPistolItem GOLDEN_GUN = item(new GPistolItem(), "golden_gun");
	public static GrenadeEmpItem G_EMP = item(new GrenadeEmpItem(), "grenade_emp");
	public static FlareItem MAGENTA_FLARE = item(new FlareItem(), "magenta_flare");
	public static BulletAmmo SNIPER_ROUND = item(new BulletAmmo(), "sniper_round");
	public static BulletAmmo SHOTGUN_SHELL = item(new BulletAmmo(), "shotgun_shell");
	public static BrimstoneItem BRIMSTONE = item(new BrimstoneItem(), "brimstone_gun");
	public static GrenadeFragItem G_FRAG = item(new GrenadeFragItem(), "grenade_frag");
	public static GrenadeStunItem G_STUN = item(new GrenadeStunItem(), "grenade_stun");
	public static FlareItem LIGHTBLUE_FLARE = item(new FlareItem(), "lightblue_flare");
	public static FlareItem LIGHTGRAY_FLARE = item(new FlareItem(), "lightgray_flare");
	public static AssasultItem AK47 = item(new AssasultItem(21, 5, "akfiring"), "ak47");
	public static Assasult1Item SMG = item(new Assasult1Item(51, 3, "smgfiring"), "smg");
	public static GrenadeSmokeItem G_SMOKE = item(new GrenadeSmokeItem(), "grenade_smoke");
	public static FlamethrowerItem FLAMETHROWER = item(new FlamethrowerItem(), "flamethrower");
	public static GrenadeNapalmItem G_NAPALM = item(new GrenadeNapalmItem(), "grenade_napalm");
	public static RocketLauncher ROCKETLAUNCHER = item(new RocketLauncher(), "rocketlauncher");
	public static HWGSpawnEgg SPY_SPAWN_EGG = item(new HWGSpawnEgg(HWGMobs.SPY), "spy_spawn_egg");
	public static HWGSpawnEgg MERC_SPAWN_EGG = item(new HWGSpawnEgg(HWGMobs.MERC), "merc_spawn_egg");
	public static Assasult2Item TOMMYGUN = item(new Assasult2Item(51, 2, "tommyfiring"), "tommy_gun");
	public static GrenadeLauncherItem G_LAUNCHER = item(new GrenadeLauncherItem(), "grenade_launcher");
	public static HellhorseRevolverItem HELLHORSE = item(new HellhorseRevolverItem(), "hellhorse_revolver");
	public static HWGSpawnEgg LESSER_SPAWN_EGG = item(new HWGSpawnEgg(HWGMobs.TECHNOLESSER), "lesser_spawn_egg");
	public static HWGSpawnEgg GREATER_SPAWN_EGG = item(new HWGSpawnEgg(HWGMobs.TECHNOGREATER), "greater_spawn_egg");
	public static BlockItem FUEL_TANK = item(
			new BlockItem(HWGBlocks.FUEL_TANK, new Item.Settings().group(HWGMod.WeaponItemGroup)), "fuel_tank");
	public static BlockItem GUN_TABLE = item(
			new BlockItem(HWGBlocks.GUN_TABLE, new Item.Settings().group(HWGMod.WeaponItemGroup)), "gun_table");

	static <T extends Item> T item(T c, String id) {
		Registry.register(Registry.ITEM, new Identifier(HWGMod.MODID, id), c);
		return c;
	}

	public static Item[] ITEMS = { HELLHORSE, G_LAUNCHER, ROCKETLAUNCHER, FLAMETHROWER, TOMMYGUN, BRIMSTONE, GOLDEN_GUN,
			AK47, FLARE_GUN, SMG, SNIPER, MEANIE1, MEANIE2, SPISTOL, SHOTGUN, BALROG, PISTOL, LUGER, MINIGUN };

	public static Map<Item, Item> getItemMap() {
		Map<Item, Item> vanillaItemMap = new HashMap<>();
		for (Item i : HWGItems.ITEMS) {
			vanillaItemMap.put(Registry.ITEM.get(new Identifier(HWGMod.MODID, Registry.ITEM.getId(i).getPath())), i);
		}
		return vanillaItemMap;
	}
}
