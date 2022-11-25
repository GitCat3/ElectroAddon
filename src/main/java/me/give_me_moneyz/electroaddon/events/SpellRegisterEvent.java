package me.give_me_moneyz.electroaddon.events;

import electroblob.wizardry.spell.Spell;
import me.give_me_moneyz.electroaddon.ElectroAddon;
import me.give_me_moneyz.electroaddon.spell.ProtectionDome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ElectroAddon.MOD_ID)
public final class SpellRegisterEvent {
    @SubscribeEvent
    public static void registerSpells(RegistryEvent.Register<Spell> event) {
        event.getRegistry().register(new ProtectionDome());
    }
}
