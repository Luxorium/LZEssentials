package com.gmail.cdaix10.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFeed implements CommandExecutor {
	
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	
    	if(sender instanceof Player) {
    		
    		((Player) sender).setFoodLevel(20);
    		((Player) sender).setSaturation(20);
    		sender.sendMessage("§5§oThe gods have satiated your hunger.");
    		
    		return true;
    	}
    	
        return false;
    }

}
