package com.example.examplemod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CodingLabMain.MODID)
public class CodingLabMain {
    public static final String MODID = "codinglab";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CodingLabMain() {
        LOGGER.info(":D");
    }

}