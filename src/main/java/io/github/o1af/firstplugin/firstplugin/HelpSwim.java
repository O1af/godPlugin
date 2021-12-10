package io.github.o1af.firstplugin.firstplugin;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.UUID;

public class HelpSwim implements Listener {
    public static ArrayList<UUID> gotHelp = new ArrayList<>();
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getPlayer().getLocation().getBlock().getType().equals(Material.WATER)
        && !gotHelp.contains(event.getPlayer().getUniqueId())) {
            Player player = event.getPlayer();
            player.sendMessage("GOD: Looks like you need a hand " + player.getName() + ", DW I gotchu bro");
            ItemStack boat = new ItemStack(Material.OAK_BOAT,1);
            player.getInventory().addItem(boat);
            gotHelp.add(player.getUniqueId());
        }
    }
}
