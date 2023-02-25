package mixinManager;

import MainManager.Main1;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main1.class)
public class MixinMain {
    @Inject(at = @At("HEAD"),method = "main")
    private static void main(String[] args, CallbackInfo callbackInfo){
        System.out.println("Hello");
    }
}
