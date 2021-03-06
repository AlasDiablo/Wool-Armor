package fr.alasdiablo.woolarmor.data;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void gatherDate(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        generator.addProvider(new ShapedRecipes(generator));
    }
}
