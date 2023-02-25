package mixinManager;

import net.minecraft.launchwrapper.IClassTransformer;

public class Transform implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        System.out.println(name);
        return basicClass;
    }
}
