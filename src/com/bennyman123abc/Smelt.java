package com.bennyman123abc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

import com.bennyman123abc.*;

@SuppressWarnings("unused")
public class Smelt extends JavaPlugin {
	
	public Permission smelt = new Permission("smlt.smelt");
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().addPermission(smelt);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("smelt") && sender instanceof Player) {
			Player player = (Player)sender;
			
			if(player.hasPermission(smelt)) {
				ItemStack itemInHand = player.getItemInHand();
				Material item = itemInHand.getType();
				
				if(item == Items.coalOre) {
					Inventory inv = player.getInventory();
					
					if(inv.contains(Items.coal)) {
						
					}
				}
			}
		}
		
		return false;
	}
}