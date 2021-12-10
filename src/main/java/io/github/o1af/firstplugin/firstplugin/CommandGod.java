package io.github.o1af.firstplugin.firstplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CommandGod implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("GOD: I gotchu " + player.getName());
            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS,1);
            boots.addEnchantment(Enchantment.FROST_WALKER,1);
            player.getInventory().addItem(boots);
        }
        return true;
    }

}
