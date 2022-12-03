package cn.enaium.foxbase.client.clickgui.setting;

import cn.enaium.foxbase.client.settings.EnableSetting;
import cn.enaium.foxbase.client.utils.ColorUtils;
import cn.enaium.foxbase.client.utils.Render2D;
import net.minecraft.client.util.math.MatrixStack;

/**
 * Project: FoxBase
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public class BooleanSettingElement extends SettingElement {

    private boolean hovered;

    public BooleanSettingElement(EnableSetting setting, Object module) {
        super(setting, module);
    }


    @Override
    public void render(int mouseX, int mouseY, float delta, double x, double y, double width, double height) {
        super.render(mouseX, mouseY, delta, x, y, width, height);
        this.hovered = Render2D.isHovered(mouseX, mouseY, x + width + 2, y + 2, height - 4, height - 4);
        int color = ColorUtils.CHECK_BG;
        if (((EnableSetting) this.setting).getEnable()) {
            color = ColorUtils.CHECK_TOGGLE;
        }
        if (this.hovered) {
            color = ColorUtils.SELECT;
        }
        Render2D.drawRectWH(x + width + 2, y + 2, height - 4, height - 4, color);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (this.hovered && button == 0) {
            ((EnableSetting) this.setting).setEnable(!((EnableSetting) this.setting).getEnable());
        }
        super.mouseClicked(mouseX, mouseY, button);
    }
}
