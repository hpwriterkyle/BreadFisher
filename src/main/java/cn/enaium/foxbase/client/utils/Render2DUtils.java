package cn.enaium.foxbase.client.utils;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

import java.awt.*;

/**
 * Project: FoxBase
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public class Render2DUtils {

    public static void drawRectWH(int x, int y, int width, int height, int color) {
        drawRect(x, y, x + width, y + height, color);
    }

    public static void drawRectWH(double x, double y, double width, double height, int color) {
        drawRect(x, y, x + width, y + height, color);
    }

    public static void drawRectWH(float x, float y, float width, float height, int color) {
        drawRect(x, y, x + width, y + height, color);
    }

    public static void drawRect(int left, int top, int right, int bottom, int color) {
        int lvt_5_2_;
        if (left < right) {
            lvt_5_2_ = left;
            left = right;
            right = lvt_5_2_;
        }

        if (top < bottom) {
            lvt_5_2_ = top;
            top = bottom;
            bottom = lvt_5_2_;
        }

        float lvt_5_3_ = (float) (color >> 24 & 255) / 255.0F;
        float lvt_6_1_ = (float) (color >> 16 & 255) / 255.0F;
        float lvt_7_1_ = (float) (color >> 8 & 255) / 255.0F;
        float lvt_8_1_ = (float) (color & 255) / 255.0F;
        Tessellator lvt_9_1_ = Tessellator.getInstance();
        BufferBuilder lvt_10_1_ = lvt_9_1_.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.color(lvt_6_1_, lvt_7_1_, lvt_8_1_, lvt_5_3_);
        lvt_10_1_.begin(7, DefaultVertexFormats.POSITION);
        lvt_10_1_.pos((double) left, (double) bottom, 0.0D).endVertex();
        lvt_10_1_.pos((double) right, (double) bottom, 0.0D).endVertex();
        lvt_10_1_.pos((double) right, (double) top, 0.0D).endVertex();
        lvt_10_1_.pos((double) left, (double) top, 0.0D).endVertex();
        lvt_9_1_.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawRect(float left, float top, float right, float bottom, int color) {
        float lvt_5_2_;
        if (left < right) {
            lvt_5_2_ = left;
            left = right;
            right = lvt_5_2_;
        }

        if (top < bottom) {
            lvt_5_2_ = top;
            top = bottom;
            bottom = lvt_5_2_;
        }

        float lvt_5_3_ = (float) (color >> 24 & 255) / 255.0F;
        float lvt_6_1_ = (float) (color >> 16 & 255) / 255.0F;
        float lvt_7_1_ = (float) (color >> 8 & 255) / 255.0F;
        float lvt_8_1_ = (float) (color & 255) / 255.0F;
        Tessellator lvt_9_1_ = Tessellator.getInstance();
        BufferBuilder lvt_10_1_ = lvt_9_1_.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.color(lvt_6_1_, lvt_7_1_, lvt_8_1_, lvt_5_3_);
        lvt_10_1_.begin(7, DefaultVertexFormats.POSITION);
        lvt_10_1_.pos(left, bottom, 0.0D).endVertex();
        lvt_10_1_.pos(right, bottom, 0.0D).endVertex();
        lvt_10_1_.pos(right, top, 0.0D).endVertex();
        lvt_10_1_.pos(left, top, 0.0D).endVertex();
        lvt_9_1_.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }

    public static void drawRect(double left, double top, double right, double bottom, int color) {
        double lvt_5_2_;
        if (left < right) {
            lvt_5_2_ = left;
            left = right;
            right = lvt_5_2_;
        }

        if (top < bottom) {
            lvt_5_2_ = top;
            top = bottom;
            bottom = lvt_5_2_;
        }

        float lvt_5_3_ = (float) (color >> 24 & 255) / 255.0F;
        float lvt_6_1_ = (float) (color >> 16 & 255) / 255.0F;
        float lvt_7_1_ = (float) (color >> 8 & 255) / 255.0F;
        float lvt_8_1_ = (float) (color & 255) / 255.0F;
        Tessellator lvt_9_1_ = Tessellator.getInstance();
        BufferBuilder lvt_10_1_ = lvt_9_1_.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.color(lvt_6_1_, lvt_7_1_, lvt_8_1_, lvt_5_3_);
        lvt_10_1_.begin(7, DefaultVertexFormats.POSITION);
        lvt_10_1_.pos(left, bottom, 0.0D).endVertex();
        lvt_10_1_.pos(right, bottom, 0.0D).endVertex();
        lvt_10_1_.pos(right, top, 0.0D).endVertex();
        lvt_10_1_.pos(left, top, 0.0D).endVertex();
        lvt_9_1_.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }


    public static void drawHorizontalLine(int i, int j, int k, int l) {
        if (j < i) {
            int m = i;
            i = j;
            j = m;
        }

        drawRect(i, k, j + 1, k + 1, l);
    }

    public static void drawVerticalLine(int i, int j, int k, int l) {
        if (k < j) {
            int m = j;
            j = k;
            k = m;
        }

        drawRect(i, j + 1, i + 1, k, l);
    }

    public static void setColor(Color color) {
        GL11.glColor4f(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f,
                color.getAlpha() / 255.0f);
    }

    public static void setColor(int rgba) {
        int r = rgba & 0xFF;
        int g = rgba >> 8 & 0xFF;
        int b = rgba >> 16 & 0xFF;
        int a = rgba >> 24 & 0xFF;
        GL11.glColor4b((byte) r, (byte) g, (byte) b, (byte) a);
    }

    public static int toRGBA(Color c) {
        return c.getRed() | c.getGreen() << 8 | c.getBlue() << 16 | c.getAlpha() << 24;
    }

    public static boolean isHovered(int mouseX, int mouseY, int x, int y, int width, int height) {
        return mouseX >= x && mouseX - width <= x && mouseY >= y && mouseY - height <= y;
    }

    public static boolean isHovered(double mouseX, double mouseY, double x, double y, double width, double height) {
        return mouseX >= x && mouseX - width <= x && mouseY >= y && mouseY - height <= y;
    }

    public static boolean isHovered(float mouseX, float mouseY, float x, float y, float width, float height) {
        return mouseX >= x && mouseX - width <= x && mouseY >= y && mouseY - height <= y;
    }


}
