package mixinManager;

import MainManager.Main1;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.io.File;
import java.util.List;

public class Tweaker implements ITweaker {
    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {

    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixin.json");
        classLoader.registerTransformer(Transform.class.getName());
    }

    @Override
    public String getLaunchTarget() {
        return Main1.class.getName();
    }

    @Override
    public String[] getLaunchArguments() {
        return new String[0];
    }
}
