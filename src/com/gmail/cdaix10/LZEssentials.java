package com.gmail.cdaix10;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.cdaix10.commands.*;

public class LZEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
    	
    	this.getLogger().info("LZEssentials has sucessfully loaded!");
    	
    	// Commands
    	this.getCommand("spawn").setExecutor(new CommandSpawn());
    	this.getCommand("setspawn").setExecutor(new CommandSetSpawn());
    	this.getCommand("fly").setExecutor(new CommandFly());
    	this.getCommand("feed").setExecutor(new CommandFeed());
    	this.getCommand("heal").setExecutor(new CommandHeal());
    	
    }

    @Override
    public void onDisable() {
    	
    }
}
 