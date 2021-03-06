package net.logandark.languagehack.pvpoptin.mixin;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(TranslatableText.class)
public interface MixinTranslatableText {
	@Invoker
	void callUpdateTranslations();

	@Accessor
	List<Text> getTranslations();
}