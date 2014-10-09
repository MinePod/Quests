package me.blackvein.quests;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public enum ParticleEffect {

    HUGE_EXPLOSION("hugeexplosion"),
    LARGE_EXPLODE("largeexplode"),
    FIREWORKS_SPARK("fireworksSpark"),
    BUBBLE("bubble"),
    SUSPEND("susgpend"),
    DEPTH_SUSPEND("depthSuspend"),
    TOWN_AURA("townaura"),	
    CRIT("crit"),
    MAGIC_CRIT("magicCrit"),
    MOB_SPELL("mobSpell"),
    MOB_SPELL_AMBIENT("mobSpellAmbient"),
    SPELL("spell"),
    INSTANT_SPELL("instantSpell"),
    WITCH_MAGIC("witchMagic"),
    NOTE("note"),
    PORTAL("portal"),
    ENCHANTMENT_TABLE("enchantmenttable"),
    EXPLODE("explode"),
    FLAME("flame"),
    LAVA("lava"),
    FOOTSTEP("footstep"),
    SPLASH("splash"),
    LARGE_SMOKE("largesmoke"),
    CLOUD("cloud"),
    RED_DUST("reddust"),
    SNOWBALL_POOF("snowballpoof"),
    DRIP_WATER("dripWater"),
    DRIP_LAVA("dripLava"),
    SNOW_SHOVEL("snowshovel"),
    SLIME("slime"),
    HEART("heart"),
    ANGRY_VILLAGER("angryVillager"),
    HAPPY_VILLAGER("happyVillager"),
    ICONCRACK("iconcrack_"),
    TILECRACK("tilecrack_");

    private final String particleName;
    
    ParticleEffect(String particleName) {
        this.particleName = particleName;
    }

    public void sendToPlayer(Quests quests, Player player, Location location, float offsetX, float offsetY, float offsetZ, float speed, int count) throws Exception {
    	
    	PacketContainer container = new PacketContainer(PacketType.Play.Server.WORLD_PARTICLES);
    	container.getStrings().write(0, particleName);
    	container.getFloat().write(0, (float) location.getX());
    	container.getFloat().write(1, (float) location.getY());
    	container.getFloat().write(2, (float) location.getZ());
    	container.getFloat().write(3, offsetX);
    	container.getFloat().write(4, offsetY);
    	container.getFloat().write(5, offsetZ);
    	container.getFloat().write(6, speed);
    	container.getIntegers().write(0, count);
        quests.protocolManager.sendServerPacket(player, container);
    }

}
