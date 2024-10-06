package com.daniking.backtools;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Environment(EnvType.CLIENT)
@Config(name = "BackTools")
public class BackToolsConfig implements ConfigData {
    @Comment(value = "\nThese options affect only the client that loads the mod.\nIt is not possible to override the environment of the mod.")
    public final String environment = EnvType.CLIENT.name();
    @Comment(value = "What items should render on your belt by their resource name. Eg: minecraft:diamond_hoe")
    public List<String> beltTools = new ArrayList<>();
    @Comment(value = "Enabled tools, by their resource name. Eg: minecraft:diamond_hoe. Putting any entry in here converts BackTools to a whitelist-only mod. Disabled Tools will be ignored.")
    public List<String> enabledTools = new ArrayList<>();
    @Comment(value = "Disabled tools, by their resource name. Eg: minecraft:diamond_hoe")
    public List<String> disabledTools = new ArrayList<>();
    @Comment(value =
        """
        Tool orientation, by class file and degrees.
        Entries starting with "#" are tags (https://minecraft.wiki/w/Tag)
        Leading namespace (e.g. minecraft:) is optional.
        Separate with ":" for rotation.
        Later occurrences of the same item override the previous once (Like in hoes override their config values set in mining).
        Item types not listed here will default to 0.
        "See defaults for examples.""")
    public List<String> toolOrientation = Arrays.asList("#minecraft:enchantable/mining" + ":0", "#minecraft:hoes" + ":0", "#minecraft:enchantable/fishing" + ":0", "#minecraft:enchantable/trident" + ":0", "bow" + ":90", "crossbow" + ":90");
    @Comment(value = "Get in swimming position and your tools go \"Weeee\"")
    public boolean helicopterMode = false;
}
