package com.st1.commands;

import com.st1.Context;
import com.st1.Game;
import com.st1.inventory.Item;

import java.util.Collection;

public class CommandInventory extends BaseCommand implements Command {
    @Override
    public void execute(Context context, String command, String[] parameters) {
        Collection<Item> items = Game.context.inventory.getItemValues();
        System.out.println("Your inventory contains:");
        for (Item item : items) {
            System.out.printf(" - %s x [%s] %s%n", item.getQuantity(), item.getId(), item.getName());
        }

    }

}
