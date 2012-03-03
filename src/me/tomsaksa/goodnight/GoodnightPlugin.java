package me.tomsaksa.goodnight;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GoodnightPlugin extends JavaPlugin {
	
	public static GoodnightPlugin plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public final MessageListener MessageListener = new MessageListener(this);
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled.");
	}
	
	@Override
	public void onEnable() {
		 PluginManager pm = getServer().getPluginManager();
		 pm.registerEvents(this.MessageListener, this);
		 PluginDescriptionFile pdfFile = this.getDescription();
		 this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled.");
		 
	}
	

}
 