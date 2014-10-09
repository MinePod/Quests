package me.blackvein.quests;

import java.util.List;

import net.citizensnpcs.api.npc.NPC;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class NpcEffectThread implements Runnable {

    final Quests plugin;

    public NpcEffectThread(Quests quests) {

        plugin = quests;

    }

    @Override
    public void run() {

        for (Player player : plugin.getServer().getOnlinePlayers()) {

            Quester quester = plugin.getQuester(player.getUniqueId());
            List<Entity> nearby = player.getNearbyEntities(32.0, 32.0, 32.0);
            if (nearby.isEmpty() == false) {

                for (Entity e : nearby) {
                    if (plugin.citizens != null) {
                        if (plugin.citizens.getNPCRegistry().isNPC(e)) {

                            NPC npc = plugin.citizens.getNPCRegistry().getNPC(e);
                            if (plugin.hasQuest(npc, quester)) {
                                showEffect(player, npc);

                            }

                        }
                    }

                }

            }

        }

    }

    private void showEffect(Player player, NPC npc) {

        if (Quests.effect.equalsIgnoreCase("enchant")) {

            try {
                ParticleEffect.ENCHANTMENT_TABLE.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 1, 0, 1, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("crit")) {

            try {
            	ParticleEffect.CRIT.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, (float) 0.35, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("spell")) {

            try {
            	ParticleEffect.INSTANT_SPELL.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, 1, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("magiccrit")) {

            try {
            	ParticleEffect.MAGIC_CRIT.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, (float) 0.35, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("mobspell")) {

            try {
            	ParticleEffect.MOB_SPELL.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, 1, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("note")) {

            try {
                Location old = npc.getBukkitEntity().getEyeLocation();
                Location newLoc = new Location(player.getWorld(), old.getX(), old.getY() + (float) 0.5, old.getZ());
                ParticleEffect.NOTE.sendToPlayer(plugin, player, newLoc, 0, 0, 0, 1, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("portal")) {

            try {
            	ParticleEffect.PORTAL.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, 1, 5);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("dust")) {

            try {
                Location old = npc.getBukkitEntity().getEyeLocation();
                Location newLoc = new Location(player.getWorld(), old.getX(), old.getY() + (float) 0.5, old.getZ());
                ParticleEffect.RED_DUST.sendToPlayer(plugin, player, newLoc, 0, 0, 0, 1, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("witch")) {

            try {
            	ParticleEffect.WITCH_MAGIC.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 0, 0, 1, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("snowball")) {

            try {
                Location old = npc.getBukkitEntity().getEyeLocation();
                Location newLoc = new Location(player.getWorld(), old.getX(), old.getY() + (float) 0.5, old.getZ());
                ParticleEffect.SNOWBALL_POOF.sendToPlayer(plugin, player, newLoc, 0, 0, 0, 1, 3);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("splash")) {

            try {
                Location old = npc.getBukkitEntity().getEyeLocation();
                Location newLoc = new Location(player.getWorld(), old.getX(), old.getY() + (float) 0.5, old.getZ());
                ParticleEffect.SPLASH.sendToPlayer(plugin, player, newLoc, 0, 0, 0, 1, 4);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (Quests.effect.equalsIgnoreCase("smoke")) {

            try {
            	ParticleEffect.TOWN_AURA.sendToPlayer(plugin, player, npc.getBukkitEntity().getEyeLocation(), 0, 1, 0, 1, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
