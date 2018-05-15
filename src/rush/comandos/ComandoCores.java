package rush.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

import rush.utils.ConfigManager;

public class ComandoCores implements Listener, CommandExecutor {
	
	public boolean onCommand(CommandSender s, Command cmd, String lbl, String[] args) {
		if (cmd.getName().equalsIgnoreCase("cores")) {
			for (String list : ConfigManager.getConfig("mensagens").getStringList("Tabela-De-Cores")) {
				s.sendMessage(list);
			}
		}
		return false;
	}
}