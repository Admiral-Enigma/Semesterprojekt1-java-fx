package com.st1.old.st1.inventory;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Item> items = new HashMap<String, Item>();

    public Inventory() {

    }

    public void add(Item item) {
        if (items.containsKey(item.getId())) {
            Item fetchedItem = items.get(item.getId());
            fetchedItem.setQuantity(fetchedItem.getQuantity() + item.getQuantity());
            items.put(fetchedItem.getId(), fetchedItem);
        } else {
            items.put(item.getId(), item);
        }
    }

    public void destroy(Item item) {
        if (!items.containsKey(item.getId())) {
            System.err.println("No item with key " + item.getId() + " found in inventory");
        }

        Item fetchedItem = items.get(item.getId());

        if (fetchedItem.getQuantity() <= 1) {
            items.remove(fetchedItem.getId());
        } else {
            fetchedItem.setQuantity(fetchedItem.getQuantity() - 1);
            items.put(fetchedItem.getId(), fetchedItem);
        }
    }

    public Item getItem(String id) throws Exception {
        if (items.containsKey(id)) {
            return items.get(id);
        } else {
            throw new Exception("You don't seem to have this item in your inventory");
        }

    }

    public Collection<Item> getAllItems() {
        return items.values();
    }


    public boolean containsItemOfClass(Class<? extends BaseItem> itemClass) {
        for (Item item : items.values()) {
            if (itemClass.isInstance(item)) {
                return true;
            }
        }
        return false;
    }
}





