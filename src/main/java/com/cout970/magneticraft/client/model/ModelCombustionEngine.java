// Date: 10/04/2015 21:31:01
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCombustionEngine extends ModelBase {
    //fields
    ModelRenderer eje;
    ModelRenderer v2;
    ModelRenderer v1;
    ModelRenderer intake;
    ModelRenderer soport;
    ModelRenderer valve2;
    ModelRenderer valve1;
    ModelRenderer battery;
    ModelRenderer cable;

    public ModelCombustionEngine() {
        textureWidth = 90;
        textureHeight = 64;

        eje = new ModelRenderer(this, 0, 0);
        eje.addBox(-5F, 0F, -8F, 10, 8, 16);
        eje.setRotationPoint(0F, 16F, 0F);
        eje.setTextureSize(90, 64);
        eje.mirror = true;
        setRotation(eje, 0F, 0F, 0F);
        v2 = new ModelRenderer(this, 0, 45);
        v2.addBox(0F, -5F, -7F, 4, 5, 14);
        v2.setRotationPoint(1F, 16F, 0F);
        v2.setTextureSize(90, 64);
        v2.mirror = true;
        setRotation(v2, 0F, 0F, 0.7853982F);
        v1 = new ModelRenderer(this, 0, 45);
        v1.addBox(0F, 0F, -7F, 4, 5, 14);
        v1.setRotationPoint(-1F, 16F, 0F);
        v1.setTextureSize(90, 64);
        v1.mirror = true;
        setRotation(v1, 0F, 0F, 2.356194F);
        intake = new ModelRenderer(this, 0, 35);
        intake.addBox(-2.5F, -4F, -4F, 5, 2, 8);
        intake.setRotationPoint(0F, 16F, 0F);
        intake.setTextureSize(90, 64);
        intake.mirror = true;
        setRotation(intake, 0F, 0F, 0F);
        soport = new ModelRenderer(this, 26, 40);
        soport.addBox(-1F, -2F, -1.5F, 2, 2, 3);
        soport.setRotationPoint(0F, 16F, 0F);
        soport.setTextureSize(90, 64);
        soport.mirror = true;
        setRotation(soport, 0F, 0F, 0F);
        valve2 = new ModelRenderer(this, 36, 46);
        valve2.addBox(-2F, -5.5F, -8F, 5, 2, 16);
        valve2.setRotationPoint(3F, 16F, 0F);
        valve2.setTextureSize(90, 64);
        valve2.mirror = true;
        setRotation(valve2, 0F, 0F, 0.7853982F);
        valve1 = new ModelRenderer(this, 36, 46);
        valve1.addBox(0F, 5.5F, -8F, 5, 2, 16);
        valve1.setRotationPoint(0F, 16F, 0F);
        valve1.setTextureSize(90, 64);
        valve1.mirror = true;
        setRotation(valve1, 0F, 0F, 2.356194F);
        battery = new ModelRenderer(this, 37, 28);
        battery.addBox(-6F, 2F, -6F, 12, 6, 12);
        battery.setRotationPoint(0F, 16F, 0F);
        battery.setTextureSize(90, 64);
        battery.mirror = true;
        setRotation(battery, 0F, 0F, 0F);
        cable = new ModelRenderer(this, 48, 0);
        cable.addBox(-8F, 5F, -2F, 16, 3, 4);
        cable.setRotationPoint(0F, 16F, 0F);
        cable.setTextureSize(90, 64);
        cable.mirror = true;
        setRotation(cable, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        eje.render(f5);
        v2.render(f5);
        v1.render(f5);
        intake.render(f5);
        soport.render(f5);
        valve2.render(f5);
        valve1.render(f5);
        battery.render(f5);
        cable.render(f5);
    }

    public void renderStatic(float f5) {
        eje.render(f5);
        v2.render(f5);
        v1.render(f5);
        intake.render(f5);
        soport.render(f5);
        valve2.render(f5);
        valve1.render(f5);
        battery.render(f5);
        cable.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
