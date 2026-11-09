package committee.nova.oworld2create.mixin;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.worldselection.WorldSelectionList;
import net.minecraft.world.level.storage.LevelSummary;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(WorldSelectionList.class)
public abstract class WorldSelectionListMixin {
    @Shadow
    private String filter;

    @Shadow
    private List<LevelSummary> currentlyDisplayedLevels;

    @Shadow
    private void fillLevels(String filter, List<LevelSummary> levels) {
        throw new AssertionError();
    }

    @Redirect(
            method = "handleNewLevels",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/worldselection/CreateWorldScreen;openFresh(Lnet/minecraft/client/Minecraft;Ljava/lang/Runnable;)V")
    )
    private void oworld2create$showEmptyWorldList(Minecraft minecraft, Runnable onCancel, List<LevelSummary> levels) {
        fillLevels(filter, levels);
        currentlyDisplayedLevels = levels;
    }
}
