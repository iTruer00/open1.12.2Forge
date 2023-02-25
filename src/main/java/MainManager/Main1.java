package MainManager;


import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = Main1.MODID, name = Main1.NAME, version = Main1.VERSION)
@Mod.EventBusSubscriber
public class Main1 {
        public static final String MODID = "itrue";
        public static final String NAME = "RPG PVP";
        public static final String VERSION = "1.0";
        final static Minecraft mc = Minecraft.getMinecraft();
        @SubscribeEvent
        public static void OnTick(TickEvent.PlayerTickEvent Tick) {
                if (Minecraft.getMinecraft().player.isServerWorld());
        }

}
