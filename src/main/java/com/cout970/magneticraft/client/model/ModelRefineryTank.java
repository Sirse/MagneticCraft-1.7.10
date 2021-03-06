// Date: 29/03/2015 17:56:18
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRefineryTank extends ModelBase {
    //fields
    ModelRenderer base1;
    ModelRenderer gap1;
    ModelRenderer gap2;
    ModelRenderer base2l;
    ModelRenderer base2r;
    ModelRenderer valve;
    ModelRenderer in;

    public ModelRefineryTank() {
        textureWidth = 256;
        textureHeight = 128;

        base1 = new ModelRenderer(this, 0, 27);
        base1.addBox(-24F, 7F, -24F, 48, 1, 48);
        base1.setRotationPoint(0F, 16F, 0F);
        base1.setTextureSize(256, 128);
        base1.mirror = true;
        setRotation(base1, 0F, 0F, 0F);
        gap1 = new ModelRenderer(this, 0, 75);
        gap1.addBox(-23F, 0F, -23F, 46, 7, 46);
        gap1.setRotationPoint(0F, 16F, 0F);
        gap1.setTextureSize(256, 128);
        gap1.mirror = true;
        setRotation(gap1, 0F, 0F, 0F);
        gap2 = new ModelRenderer(this, 0, 75);
        gap2.addBox(-23F, -8F, -23F, 46, 7, 46);
        gap2.setRotationPoint(0F, 16F, 0F);
        gap2.setTextureSize(256, 128);
        gap2.mirror = true;
        setRotation(gap2, 0F, 0F, 0F);
        base2l = new ModelRenderer(this, 0, 0);
        base2l.addBox(-24F, -1F, 4F, 48, 1, 20);
        base2l.setRotationPoint(0F, 16F, 0F);
        base2l.setTextureSize(256, 128);
        base2l.mirror = true;
        setRotation(base2l, 0F, 0F, 0F);
        base2r = new ModelRenderer(this, 0, 0);
        base2r.addBox(-24F, -1F, -24F, 48, 1, 20);
        base2r.setRotationPoint(0F, 16F, 0F);
        base2r.setTextureSize(256, 128);
        base2r.mirror = true;
        setRotation(base2r, 0F, 0F, 0F);
        valve = new ModelRenderer(this, 137, 0);
        valve.addBox(-24F, -4F, -4F, 1, 8, 8);
        valve.setRotationPoint(0F, 16F, 0F);
        valve.setTextureSize(256, 128);
        valve.mirror = true;
        setRotation(valve, 0F, 0F, 0F);
        in = new ModelRenderer(this, 146, 18);
        in.addBox(-23F, -1F, -4F, 47, 1, 8);
        in.setRotationPoint(0F, 16F, 0F);
        in.setTextureSize(256, 128);
        in.mirror = true;
        setRotation(in, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        base1.render(f5);
        gap1.render(f5);
        gap2.render(f5);
        base2l.render(f5);
        base2r.render(f5);
        valve.render(f5);
        in.render(f5);
    }

    public void renderStatic(float f5) {
        base1.render(f5);
        gap1.render(f5);
        gap2.render(f5);
        base2l.render(f5);
        base2r.render(f5);
        valve.render(f5);
        in.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
