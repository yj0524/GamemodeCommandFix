package com.yj0524.tabcom;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class GmTabCom implements TabCompleter {

    List<String> arguments = new ArrayList<>();

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] arg) {
        if (arguments.isEmpty()) {
            arguments.add("0");
            arguments.add("1");
            arguments.add("2");
            arguments.add("3");
            arguments.add("survival");
            arguments.add("creative");
            arguments.add("adventure");
            arguments.add("spectator");
        }

        List<String> result = new ArrayList<>();

        if (arg.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(arg[0].toLowerCase())) {
                    result.add(a);
                }
            }
            return result;
        }

        // arg 3개 이상 뒤에는 아무것도 띄우지 않음
        if (arg.length >= 3) {
            result.clear();
            return result;
        }

        // all players
        if (arg.length == 2) {
            return null;
        }

        return arguments;
    }
}
