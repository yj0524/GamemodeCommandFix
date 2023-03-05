package com.yj0524.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gm implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /gm <0, 1, 2, 3, survival, creative, adventure, spectator> [player]
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                if (sender instanceof Player) {
                    ((Player) sender).setGameMode(GameMode.SURVIVAL);
                    sender.sendMessage("Gamemode has been changed to survival.");
                    return true;
                }
                sender.sendMessage("You must be a player to use this command.");
            }
            if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                if (sender instanceof Player) {
                    ((Player) sender).setGameMode(GameMode.CREATIVE);
                    sender.sendMessage("Gamemode has been changed to creative.");
                    return true;
                }
                sender.sendMessage("You must be a player to use this command.");
            }
            if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                if (sender instanceof Player) {
                    ((Player) sender).setGameMode(GameMode.ADVENTURE);
                    sender.sendMessage("Gamemode has been changed to adventure.");
                    return true;
                }
                sender.sendMessage("You must be a player to use this command.");
            }
            if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                if (sender instanceof Player) {
                    ((Player) sender).setGameMode(GameMode.SPECTATOR);
                    sender.sendMessage("Gamemode has been changed to spectator.");
                    return true;
                }
                sender.sendMessage("You must be a player to use this command.");
            }
        }
        if (args.length == 2) {
            String targetPlayer = args[1];
            if (sender.getServer().getPlayer(targetPlayer) == null) {
                sender.sendMessage("§cPlayer not found.");
                return true;
            }
            else {
                if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                    if (sender instanceof Player) {
                        sender.getServer().getPlayer(targetPlayer).setGameMode(GameMode.SURVIVAL);
                        sender.sendMessage("Gamemode for " + args[1] + " has been changed to survival.");
                        return true;
                    } else {
                        sender.sendMessage("You must be a player to use this command.");
                    }
                }
                if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                    if (sender instanceof Player) {
                        sender.getServer().getPlayer(targetPlayer).setGameMode(GameMode.CREATIVE);
                        sender.sendMessage("Gamemode for " + args[1] + " has been changed to creative.");
                        return true;
                    } else {
                        sender.sendMessage("You must be a player to use this command.");
                    }
                }
                if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                    if (sender instanceof Player) {
                        sender.getServer().getPlayer(targetPlayer).setGameMode(GameMode.ADVENTURE);
                        sender.sendMessage("Gamemode for " + args[1] + " has been changed to adventure.");
                        return true;
                    } else {
                        sender.sendMessage("You must be a player to use this command.");
                    }
                }
                if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                    if (sender instanceof Player) {
                        sender.getServer().getPlayer(targetPlayer).setGameMode(GameMode.SPECTATOR);
                        sender.sendMessage("Gamemode for " + args[1] + " has been changed to spectator.");
                        return true;
                    } else {
                        sender.sendMessage("You must be a player to use this command.");
                    }
                }
            }
        }
        else {
            sender.sendMessage("§cUsage: /gm <0, 1, 2, 3, survival, creative, adventure, spectator> [player]");
            return true;
        }
        return false;
    }
}
