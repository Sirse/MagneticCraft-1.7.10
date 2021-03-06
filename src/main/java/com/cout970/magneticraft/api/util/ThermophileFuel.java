package com.cout970.magneticraft.api.util;

import com.cout970.magneticraft.api.access.MgRecipeRegister;

/**
 * This Class if for register an fuel for the Termopile
 *
 * @author Cout970
 */
public class ThermophileFuel {

    public boolean heat;//true == heat source, false == cold source
    public BlockInfo source;
    public double temp;//always positive

    public ThermophileFuel(BlockInfo s, double t, boolean heat) {
        source = s;
        temp = t;
        this.heat = heat;
    }

    public static ThermophileFuel getRecipe(BlockInfo p) {
        for (ThermophileFuel f : MgRecipeRegister.thermopileSources) {
            if (f.source.equals(p)) {
                return f;
            }
        }
        return null;
    }

    public String toString() {
        return "Recipe Thermopile " + (heat ? "Hot" : "Cold") + " Source, Temp: " + (heat ? temp : -temp);
    }
}
