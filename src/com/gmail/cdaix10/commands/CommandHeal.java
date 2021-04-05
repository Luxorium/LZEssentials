package com.gmail.cdaix10.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHeal implements CommandExecutor {
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(sender instanceof Player) {
    		
    		((Player) sender).setHealth(20);
    		sender.sendMessage("§5§oYou have been healed by the gods.");
    		
    		return true;
    	}
    	
        return false;
    }

}
