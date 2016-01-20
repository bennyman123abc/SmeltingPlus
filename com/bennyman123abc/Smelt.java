package com.bennyman123abc;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

public class Smelt extends JavaPlugin {
	
	public Permission smelt = new Permission("smlt.smelt");
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().addPermission(smelt);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().getEqualsIgnoreCase("smelt") && sender instanceof Player) {
			Player player = (Player)sender;
			
			if(player.hasPermission(smelt)) {
				
			}
		}
		
		return false;
	}
}