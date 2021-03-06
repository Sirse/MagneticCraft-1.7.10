// Date: 04/04/2015 17:42:04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWireCorner extends ModelBase {
    //fields
    ModelRenderer cornerBack;
    ModelRenderer cornerFront;
    ModelRenderer cornerLeft;
    ModelRenderer cornerRight;

    public ModelWireCorner() {
        textureWidth = 14;
        textureHeight = 26;

        cornerBack = new ModelRenderer(this, 0, 7);
        cornerBack.addBox(-2F, 5F, 8F, 4, 3, 3);
        cornerBack.setRotationPoint(0F, 16F, 0F);
        cornerBack.setTextureSize(14, 26);
        cornerBack.mirror = true;
        setRotation(cornerBack, 0F, 0F, 0F);
        cornerFront = new ModelRenderer(this, 0, 13);
        cornerFront.addBox(-2F, 5F, -11F, 4, 3, 3);
        cornerFront.setRotationPoint(0F, 16F, 0F);
        cornerFront.setTextureSize(14, 26);
        cornerFront.mirror = true;
        setRotation(cornerFront, 0F, 0F, 0F);
        cornerLeft = new ModelRenderer(this, 0, 19);
        cornerLeft.addBox(8F, 5F, -2F, 3, 3, 4);
        cornerLeft.setRotationPoint(0F, 16F, 0F);
        cornerLeft.setTextureSize(14, 26);
        cornerLeft.mirror = true;
        setRotation(cornerLeft, 0F, 0F, 0F);
        cornerRight = new ModelRenderer(this, 0, 0);
        cornerRight.addBox(-11F, 5F, -2F, 3, 3, 4);
        cornerRight.setRotationPoint(0F, 16F, 0F);
        cornerRight.setTextureSize(14, 26);
        cornerRight.mirror = true;
        setRotation(cornerRight, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
//    setRotationAngles(f, f1, f2, f3, f4, f5);
        cornerBack.render(f5);
        cornerFront.render(f5);
        cornerLeft.render(f5);
        cornerRight.render(f5);
    }

    public void renderDynamic(float f5, int conn) {
        if ((conn & 1) > 0) cornerBack.render(f5);
        if ((conn & 2) > 0) cornerLeft.render(f5);
        if ((conn & 4) > 0) cornerFront.render(f5);
        if ((conn & 8) > 0) cornerRight.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
