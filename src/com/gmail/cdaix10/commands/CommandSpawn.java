package com.gmail.cdaix10.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(sender instanceof Player) {
    		
    		((Player) sender).teleport(((Player) sender).getWorld().getSpawnLocation());
    		sender.sendMessage("§5§oYou have fast traveled to Spawn.");
    		
    		return true;
    	}
    	
        return false;
    }

}
