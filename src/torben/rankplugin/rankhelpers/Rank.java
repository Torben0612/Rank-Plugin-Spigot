package torben.rankplugin.rankhelpers;

import org.bukkit.ChatColor;
import torben.rankplugin.Main;

public enum Rank {

    OWNER(ChatColor.DARK_RED + Main.getPhrase("owner-display-name")),
    ADMIN(ChatColor.RED + Main.getPhrase("admin-display-name")),
    MOD(ChatColor.DARK_PURPLE + Main.getPhrase("mod-display-name")),
    MEMBER(ChatColor.BLUE + Main.getPhrase("member-display-name")),
    GUEST(ChatColor.GRAY + Main.getPhrase("guest-display-name"));


    private String display;

    Rank(String display){
        this.display = display;
    }

    public String getDisplay() { return display; }
}
