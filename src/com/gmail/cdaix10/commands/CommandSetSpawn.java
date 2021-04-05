package com.gmail.cdaix10.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSetSpawn implements CommandExecutor {
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(sender instanceof Player) {
    		
    		((Player) sender).getWorld().setSpawnLocation(((Player) sender).getLocation());
    		sender.sendMessage("§5§oYou have moved Spawn to your location.");
    		
    		return true;
    	}
    	
        return false;
    }

}
