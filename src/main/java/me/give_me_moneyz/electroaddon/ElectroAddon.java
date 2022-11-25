package me.give_me_moneyz.electroaddon;

import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = ElectroAddon.MOD_ID,
        name = ElectroAddon.MOD_NAME,
        version = ElectroAddon.VERSION,
        dependencies = "required-after:ebwizardry@4.3.8"
)
public class ElectroAddon {

    public static final String MOD_ID = "electroaddon";
    public static final String MOD_NAME = "Electro Addon";
    public static final String VERSION = "1.0-SNAPSHOT";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static ElectroAddon INSTANCE;
}
