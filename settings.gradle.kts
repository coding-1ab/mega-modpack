pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.parchmentmc.org")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

includeBuild("AI-Improvements")
includeBuild("AdvancedPeripherals")
includeBuild("AppleSkin")
includeBuild("Bakery")
includeBuild("Balm")
includeBuild("Better-Burning")
includeBuild("BetterAdvancements")
includeBuild("Big-Brain")
includeBuild("BoatItemView")
includeBuild("CC-Tweaked")
includeBuild("Candlelight")
includeBuild("Catalogue")
includeBuild("Clumps")
includeBuild("Controlling")
includeBuild("CrashUtilities")
includeBuild("Create")
includeBuild("CreateEnchantmentIndustry")
includeBuild("CreateInteriorsMod")
includeBuild("Curios")
includeBuild("Ding")
includeBuild("DoAPI")
includeBuild("DurabilityTooltip")
includeBuild("DynamicLightsReforged")
includeBuild("EmbeddiumPlus")
includeBuild("Enchantment-Descriptions")
includeBuild("FarmersDelight")
includeBuild("FastPaintings")
includeBuild("Fastload")
includeBuild("FerriteCore")
includeBuild("Fusion")
includeBuild("GameMenuModOption")
includeBuild("GetItTogetherDrops")
includeBuild("ImmediatelyFast")
includeBuild("InfinityButtons")
includeBuild("KryptonReforged")
includeBuild("Meadow")
includeBuild("MemoryLeakFix")
includeBuild("ModernFix")
includeBuild("Moonlight")
includeBuild("MouseTweaks")
includeBuild("NetherPortalFix")
includeBuild("Oceans_Delight")
includeBuild("Oculus")
includeBuild("Patchouli")
includeBuild("Piglin-Proliferation")
includeBuild("Railway")
includeBuild("Rechiseled")
includeBuild("RechiseledCreate")
includeBuild("SmarterFarmers")
includeBuild("SuggestionProviderFix")
includeBuild("TerraBlender")
includeBuild("WoodGood")
includeBuild("alternate-current")
includeBuild("betteranimationscollection/betteranimationscollection")
includeBuild("blockrunner/blockrunner")
includeBuild("cccbridge/forge")
includeBuild("cutthrough")
includeBuild("easyanvils/easyanvils")
includeBuild("easymagic/easymagic")
includeBuild("effectdescriptions")
includeBuild("embeddium")
includeBuild("leavesbegone/leavesbegone")
includeBuild("mapatlases-neoforge")
includeBuild("morered")
includeBuild("pickupnotifier/pickupnotifier")
includeBuild("radium-upstream")
includeBuild("right-click-harvest")
includeBuild("rrls")
// includeBuild("rubidium-extra")
includeBuild("searchables")
includeBuild("spark")
includeBuild("spyglass-improvements")
includeBuild("textrues-embeddium-options")
includeBuild("visualworkbench/visualworkbench")
