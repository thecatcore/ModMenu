package com.terraformersmc.modmenu.mc_1_19_3;

import com.terraformersmc.modmenu.util.compat.CompatInitializer;
import com.terraformersmc.modmenu.util.compat.MCCompat;

public class ModMenuMCCompat implements CompatInitializer {
	@Override
	public void onInitialize(MCCompat compat) {
		if (!MCCompat.after23w03a) {
			compat.setBlaze3DHelper(new Blaze3DHelper1193());
			compat.setDescriptionListWidgetHelper(new DescriptionListWidgetHelper1193());
			compat.setMcVersionHelper(new MCVersionHelper1193());
			compat.setFocusHelper(new FocusHelper1193());

			if (MCCompat.after22w45a) compat.setButtonHelper(new ButtonHelper1193());
		}
	}
}
