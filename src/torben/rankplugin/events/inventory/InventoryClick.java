package torben.rankplugin.events.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import torben.rankplugin.helpers.Utilities;

import static torben.rankplugin.helpers.ActionSound.CLICK;

public class InventoryClick implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Utilities.playSound(CLICK, (Player)event.getWhoClicked());
    }

}