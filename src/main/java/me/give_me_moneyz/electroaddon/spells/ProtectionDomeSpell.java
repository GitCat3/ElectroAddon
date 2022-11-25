package me.give_me_moneyz.electroaddon.spells;

import electroblob.wizardry.spell.Spell;
import electroblob.wizardry.util.SpellModifiers;
import me.give_me_moneyz.electroaddon.ElectroAddon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ProtectionDomeSpell extends Spell {
    public ProtectionDomeSpell() {
        super(ElectroAddon.MOD_ID, "protection_dome", EnumAction.NONE, false);
    }

    @Override
    public boolean cast(World world, EntityPlayer entityPlayer, EnumHand enumHand, int i, SpellModifiers spellModifiers) {
        return true;
    }
}
