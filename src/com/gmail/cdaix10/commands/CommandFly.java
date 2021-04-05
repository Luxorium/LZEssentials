package com.gmail.cdaix10.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(sender instanceof Player && !((Player) sender).getAllowFlight()) {
    		
    		((Player) sender).setAllowFlight(true);
    		sender.sendMessage("§5§oYou have been blessed with the ability of flight.");
    		
    		return true;
    	}
    	
    	if(sender instanceof Player && ((Player) sender).getAllowFlight()) {
    		
    		((Player) sender).setAllowFlight(false);
    		sender.sendMessage("§5§oYou are no longer blessed with the ability of flight.");
    		
    		return true;
    	}
    	
        return false;
    }

}
