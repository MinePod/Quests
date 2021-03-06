package me.blackvein.quests;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class QuestData {

    private final Quester quester;
    private boolean doJournalUpdate = true;
    
    public QuestData(Quester quester) {
        this.quester = quester;
    }
    
    public void setDoJournalUpdate(boolean b) {
        doJournalUpdate = b;
    }
    
    public Map<Material, Integer> blocksDamaged = new EnumMap<Material, Integer>(Material.class) {
        
        @Override
        public Integer put(Material key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Material, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Material, Integer> blocksBroken = new EnumMap<Material, Integer>(Material.class) {
        
        @Override
        public Integer put(Material key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Material, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Material, Integer> blocksPlaced = new EnumMap<Material, Integer>(Material.class) {
        
        @Override
        public Integer put(Material key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Material, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Material, Integer> blocksUsed = new EnumMap<Material, Integer>(Material.class)
             {
        
        @Override
        public Integer put(Material key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Material, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Material, Integer> blocksCut = new EnumMap<Material, Integer>(Material.class) {
        
        @Override
        public Integer put(Material key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Material, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Integer, Integer> potionsBrewed = new HashMap<Integer, Integer>() {
        
        @Override
        public Integer put(Integer key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Integer, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<ItemStack, Integer> itemsDelivered = new HashMap<ItemStack, Integer>() {
        
        @Override
        public Integer put(ItemStack key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends ItemStack, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<UUID, Long> playerKillTimes = new HashMap<UUID, Long>() {
        
        @Override
        public Long put(UUID key, Long val) {
            Long data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Long remove(Object key) {
            Long i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends UUID, ? extends Long> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<Map<Enchantment, Material>, Integer> itemsEnchanted = new HashMap<Map<Enchantment, Material>, Integer>() {
        
        @Override
        public Integer put(Map<Enchantment, Material> key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Map<Enchantment, Material>, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public LinkedList<EntityType> mobsKilled = new LinkedList<EntityType>() {

        @Override
        public boolean add(EntityType e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, EntityType element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends EntityType> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends EntityType> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public EntityType remove(int index) {
            EntityType s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public EntityType set(int index, EntityType element) {
            EntityType s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    public LinkedList<Integer> mobNumKilled = new LinkedList<Integer>() {

        @Override
        public boolean add(Integer e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Integer element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Integer> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Integer remove(int index) {
            Integer s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Integer set(int index, Integer element) {
            Integer s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Location> locationsToKillWithin = new LinkedList<Location>() {

        @Override
        public boolean add(Location e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Location element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Location> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Location> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Location remove(int index) {
            Location s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Location set(int index, Location element) {
            Location s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Integer> radiiToKillWithin = new LinkedList<Integer>() {

        @Override
        public boolean add(Integer e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Integer element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Integer> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Integer remove(int index) {
            Integer s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Integer set(int index, Integer element) {
            Integer s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public Map<Integer, Boolean> citizensInteracted = new HashMap<Integer, Boolean>() {
        
        @Override
        public Boolean put(Integer key, Boolean val) {
            Boolean data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Boolean remove(Object key) {
            Boolean i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends Integer, ? extends Boolean> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
            
            
    public LinkedList<Integer> citizensKilled = new LinkedList<Integer>() {

        @Override
        public boolean add(Integer e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Integer element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Integer> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Integer remove(int index) {
            Integer s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Integer set(int index, Integer element) {
            Integer s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Integer> citizenNumKilled = new LinkedList<Integer>() {

        @Override
        public boolean add(Integer e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Integer element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Integer> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Integer remove(int index) {
            Integer s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Integer set(int index, Integer element) {
            Integer s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Location> locationsReached = new LinkedList<Location>() {

        @Override
        public boolean add(Location e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Location element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Location> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Location> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Location remove(int index) {
            Location s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Location set(int index, Location element) {
            Location s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Boolean> hasReached = new LinkedList<Boolean>() {

        @Override
        public boolean add(Boolean e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Boolean element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Boolean> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Boolean> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Boolean remove(int index) {
            Boolean s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Boolean set(int index, Boolean element) {
            Boolean s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public LinkedList<Integer> radiiToReachWithin = new LinkedList<Integer>() {

        @Override
        public boolean add(Integer e) {
            boolean b = super.add(e);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void add(int index, Integer element) {
            super.add(index, element);
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            boolean b = super.addAll(c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Integer> c) {
            boolean b = super.addAll(index, c);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public boolean remove(Object o) {
            boolean b = super.remove(o);
            if (doJournalUpdate) quester.updateJournal();
            return b;
        }

        @Override
        public Integer remove(int index) {
            Integer s = super.remove(index);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }

        @Override
        public Integer set(int index, Integer element) {
            Integer s = super.set(index, element);
            if (doJournalUpdate) quester.updateJournal();
            return s;
        }
        
    };
    
    
    public Map<EntityType, Integer> mobsTamed = new EnumMap<EntityType, Integer>(EntityType.class) {
        
        @Override
        public Integer put(EntityType key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends EntityType, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<DyeColor, Integer> sheepSheared = new EnumMap<DyeColor, Integer>(DyeColor.class) {
        
        @Override
        public Integer put(DyeColor key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends DyeColor, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<String, Boolean> passwordsSaid = new HashMap<String, Boolean>() {
        
        
        @Override
        public Boolean put(String key, Boolean val) {
            Boolean data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Boolean remove(Object key) {
            Boolean i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends String, ? extends Boolean> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    public Map<String, Integer> customObjectiveCounts = new HashMap<String, Integer>() {
        
        
        @Override
        public Integer put(String key, Integer val) {
            Integer data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Integer remove(Object key) {
            Integer i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends String, ? extends Integer> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    public Map<String, Boolean> eventFired = new HashMap<String, Boolean>() {
        
        
        @Override
        public Boolean put(String key, Boolean val) {
            Boolean data = super.put(key, val);
            if (doJournalUpdate) quester.updateJournal();
            return data;
        }

        @Override
        public Boolean remove(Object key) {
            Boolean i = super.remove(key);
            if (doJournalUpdate) quester.updateJournal();
            return i;
        }
        
        @Override
        public void clear() {
            super.clear();
            if (doJournalUpdate) quester.updateJournal();
        }

        @Override
        public void putAll(Map<? extends String, ? extends Boolean> m) {
            super.putAll(m);
            if (doJournalUpdate) quester.updateJournal();
        }
        
    };
    
    
    private int fishCaught = 0;
    private int playersKilled = 0;
    public long delayStartTime = 0;
    public long delayTimeLeft = -1;
    public boolean delayOver = true;
    
    public void setFishCaught(int i) {
        fishCaught = i;
        if (doJournalUpdate) quester.updateJournal();
    }
    
    public void setPlayersKilled(int i) {
        playersKilled = i;
        if (doJournalUpdate) quester.updateJournal();
    }

    public int getFishCaught() {
        return fishCaught;
    }

    public int getPlayersKilled() {
        return playersKilled;
    }

}
