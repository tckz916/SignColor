package com.github.tckz916.signcoloring.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

/**
 * Created by tckz916 on 2015/11/23.
 */
public class SignListener implements Listener {
    @EventHandler
    public void onSign(SignChangeEvent event) {
        for (int i = 0; i <= 3; i++) {
            event.setLine(i, coloring(event.getLine(i)));
        }
    }

    private String coloring(String str) {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
