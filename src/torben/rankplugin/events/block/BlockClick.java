package torben.rankplugin.events.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import torben.rankplugin.helpers.ActionSound;
import torben.rankplugin.helpers.Utilities;

public class BlockClick implements Listener {

    @EventHandler
    public void onBlockClick(PlayerInteractEvent event) {
        Utilities.playSound(ActionSound.ERROR, event.getPlayer());

    }

}