package com.github.tckz916.signcoloring;

import com.github.tckz916.signcoloring.listener.SignListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by tckz916 on 2015/11/23.
 */
public class SignColoring extends JavaPlugin {

    private PluginManager pluginManager = this.getServer().getPluginManager();

    @Override
    public void onEnable() {
        super.onEnable();

        pluginManager.registerEvents(new SignListener(), this);

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }


}
