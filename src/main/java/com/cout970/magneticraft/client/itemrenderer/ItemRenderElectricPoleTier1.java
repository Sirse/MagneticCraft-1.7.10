package com.cout970.magneticraft.client.itemrenderer;

import com.cout970.magneticraft.client.model.ModelElectricalPoleTier1;
import com.cout970.magneticraft.client.tilerender.ModelTextures;
import com.cout970.magneticraft.util.RenderUtil;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRenderElectricPoleTier1 implements IItemRenderer {

    public ModelElectricalPoleTier1 model = new ModelElectricalPoleTier1();

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
                                         ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                render(0.0F, -2F, 0.0F, 0.315F, item);
                return;
            }
            case EQUIPPED: {
                render(1.25F, -0.75F, 1.25F, 0.5F, item);
                return;
            }
            case INVENTORY: {
                render(0.0F, -2.5F, 0.0F, 0.3F, item);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                render(0.5F, 0.0F, 0.5F, 0.5F, item);
            }
        }
    }

    public void render(float x, float y, float z, float scale, ItemStack i) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(180F, 0, 0, 1);
        GL11.glTranslatef(0, -1.5f, 0);
        RenderUtil.bindTexture(ModelTextures.POLE_TIER1);
        model.renderStatic(0.0625f);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }

}
