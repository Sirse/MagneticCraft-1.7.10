package com.cout970.magneticraft.handlers;

import com.cout970.magneticraft.client.gui.GuiBasicGenerator;
import com.cout970.magneticraft.client.gui.GuiBattery;
import com.cout970.magneticraft.client.gui.GuiBiomassBurner;
import com.cout970.magneticraft.client.gui.GuiBoiler;
import com.cout970.magneticraft.client.gui.GuiBreaker;
import com.cout970.magneticraft.client.gui.GuiBrickFurnace;
import com.cout970.magneticraft.client.gui.GuiCombustionEngine;
import com.cout970.magneticraft.client.gui.GuiCrafter;
import com.cout970.magneticraft.client.gui.GuiCrusher;
import com.cout970.magneticraft.client.gui.GuiElectricFurnace;
import com.cout970.magneticraft.client.gui.GuiFireBox;
import com.cout970.magneticraft.client.gui.GuiFluidHopper;
import com.cout970.magneticraft.client.gui.GuiGeothermalPump;
import com.cout970.magneticraft.client.gui.GuiGrinder;
import com.cout970.magneticraft.client.gui.GuiGuideBook;
import com.cout970.magneticraft.client.gui.GuiInserter;
import com.cout970.magneticraft.client.gui.GuiKineticGenerator;
import com.cout970.magneticraft.client.gui.GuiMB_Inv;
import com.cout970.magneticraft.client.gui.GuiMiner;
import com.cout970.magneticraft.client.gui.GuiOilDistillery;
import com.cout970.magneticraft.client.gui.GuiPolymerizer;
import com.cout970.magneticraft.client.gui.GuiRefinery;
import com.cout970.magneticraft.client.gui.GuiResistance;
import com.cout970.magneticraft.client.gui.GuiShelvingUnit;
import com.cout970.magneticraft.client.gui.GuiSteamEngine;
import com.cout970.magneticraft.client.gui.GuiSteamTurbine;
import com.cout970.magneticraft.client.gui.GuiStirlingGenerator;
import com.cout970.magneticraft.client.gui.GuiThermopile;
import com.cout970.magneticraft.client.gui.GuiWindTurbine;
import com.cout970.magneticraft.compat.ManagerIntegration;
import com.cout970.magneticraft.container.ContainerBasicGenerator;
import com.cout970.magneticraft.container.ContainerBattery;
import com.cout970.magneticraft.container.ContainerBiomassBurner;
import com.cout970.magneticraft.container.ContainerBoiler;
import com.cout970.magneticraft.container.ContainerBreaker;
import com.cout970.magneticraft.container.ContainerBrickFurnace;
import com.cout970.magneticraft.container.ContainerCombustionEngine;
import com.cout970.magneticraft.container.ContainerCrafter;
import com.cout970.magneticraft.container.ContainerCrusher;
import com.cout970.magneticraft.container.ContainerElectricFurnace;
import com.cout970.magneticraft.container.ContainerFireBox;
import com.cout970.magneticraft.container.ContainerFluidHopper;
import com.cout970.magneticraft.container.ContainerGeothermalPump;
import com.cout970.magneticraft.container.ContainerGrinder;
import com.cout970.magneticraft.container.ContainerGuideBook;
import com.cout970.magneticraft.container.ContainerInserter;
import com.cout970.magneticraft.container.ContainerKineticGenerator;
import com.cout970.magneticraft.container.ContainerMB_Inv;
import com.cout970.magneticraft.container.ContainerMiner;
import com.cout970.magneticraft.container.ContainerOilDistillery;
import com.cout970.magneticraft.container.ContainerPolymerizer;
import com.cout970.magneticraft.container.ContainerRefinery;
import com.cout970.magneticraft.container.ContainerResistance;
import com.cout970.magneticraft.container.ContainerShelvingUnit;
import com.cout970.magneticraft.container.ContainerSteamEngine;
import com.cout970.magneticraft.container.ContainerStirlingGenerator;
import com.cout970.magneticraft.container.ContainerThermopile;
import com.cout970.magneticraft.container.ContainerTurbine;
import com.cout970.magneticraft.container.ContainerWindMill;
import com.cout970.magneticraft.tileentity.TileBasicGenerator;
import com.cout970.magneticraft.tileentity.TileBattery;
import com.cout970.magneticraft.tileentity.TileBiomassBurner;
import com.cout970.magneticraft.tileentity.TileBoiler;
import com.cout970.magneticraft.tileentity.TileBreaker;
import com.cout970.magneticraft.tileentity.TileBrickFurnace;
import com.cout970.magneticraft.tileentity.TileCombustionEngine;
import com.cout970.magneticraft.tileentity.TileCrafter;
import com.cout970.magneticraft.tileentity.TileElectricFurnace;
import com.cout970.magneticraft.tileentity.TileFireBox;
import com.cout970.magneticraft.tileentity.TileFluidHopper;
import com.cout970.magneticraft.tileentity.TileGeothermalPump;
import com.cout970.magneticraft.tileentity.TileInserter;
import com.cout970.magneticraft.tileentity.TileKineticGenerator;
import com.cout970.magneticraft.tileentity.TileMiner;
import com.cout970.magneticraft.tileentity.TileResistance;
import com.cout970.magneticraft.tileentity.TileSteamEngine;
import com.cout970.magneticraft.tileentity.TileThermopile;
import com.cout970.magneticraft.tileentity.TileWindTurbine;
import com.cout970.magneticraft.tileentity.multiblock.TileMB_Inv;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileCrusher;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileGrinder;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileOilDistillery;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TilePolymerizer;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileRefinery;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileSteamTurbineControl;
import com.cout970.magneticraft.tileentity.multiblock.controllers.TileStirlingGenerator;
import com.cout970.magneticraft.tileentity.shelf.TileShelvingUnit;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
                                      int x, int y, int z) {
    	if(ID == 1){
    		return new ContainerGuideBook(player.inventory, null);
    	}
    	
        TileEntity tile = world.getTileEntity(x, y, z);

        if (tile instanceof TileElectricFurnace) {
            return new ContainerElectricFurnace(player.inventory, tile);
        }
        if (tile instanceof TileBattery) {
            return new ContainerBattery(player.inventory, tile);
        }
        if (tile instanceof TileBasicGenerator) {
            return new ContainerBasicGenerator(player.inventory, tile);
        }
        if (tile instanceof TileFireBox) {
            return new ContainerFireBox(player.inventory, tile);
        }
        if (tile instanceof TileBoiler) {
            return new ContainerBoiler(player.inventory, tile);
        }
        if (tile instanceof TileFluidHopper) {
            return new ContainerFluidHopper(player.inventory, tile);
        }
        if (tile instanceof TileWindTurbine) {
            return new ContainerWindMill(player.inventory, tile);
        }
        if (tile instanceof TileGeothermalPump) {
            return new ContainerGeothermalPump(player.inventory, tile);
        }
        if (tile instanceof TileSteamEngine) {
            return new ContainerSteamEngine(player.inventory, tile);
        }
        if (tile instanceof TileCrusher) {
            return new ContainerCrusher(player.inventory, tile);
        }
        if (tile instanceof TileMB_Inv) {
            return new ContainerMB_Inv(player.inventory, tile);
        }
        if (tile instanceof TileMiner) {
            return new ContainerMiner(player.inventory, tile);
        }
        if (tile instanceof TileKineticGenerator) {
            return new ContainerKineticGenerator(player.inventory, tile);
        }
        if (tile instanceof TileBiomassBurner) {
            return new ContainerBiomassBurner(player.inventory, tile);
        }
        if (tile instanceof TileStirlingGenerator) {
            return new ContainerStirlingGenerator(player.inventory, tile);
        }
        if (tile instanceof TileGrinder) {
            return new ContainerGrinder(player.inventory, tile);
        }
        if (tile instanceof TileRefinery) {
            return new ContainerRefinery(player.inventory, tile);
        }
        if (tile instanceof TilePolymerizer) {
            return new ContainerPolymerizer(player.inventory, tile);
        }
        if (tile instanceof TileSteamTurbineControl) {
            return new ContainerTurbine(player.inventory, tile);
        }
        if (tile instanceof TileCombustionEngine) {
            return new ContainerCombustionEngine(player.inventory, tile);
        }
        if (tile instanceof TileBrickFurnace) {
            return new ContainerBrickFurnace(player.inventory, tile);
        }
        if (tile instanceof TileCrafter) {
            return new ContainerCrafter(player.inventory, tile);
        }
        if (tile instanceof TileOilDistillery) {
            return new ContainerOilDistillery(player.inventory, tile);
        }
        if (tile instanceof TileInserter) {
            return new ContainerInserter(player.inventory, tile);
        }
        if (tile instanceof TileResistance) {
            return new ContainerResistance(player.inventory, tile);
        }
        if (tile instanceof TileThermopile) {
            return new ContainerThermopile(player.inventory, tile);
        }
        if (tile instanceof TileBreaker) {
            return new ContainerBreaker(player.inventory, tile);
        }
        if (tile instanceof TileShelvingUnit) {
            return new ContainerShelvingUnit(player.inventory, tile);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
                                      int x, int y, int z) {
    	
    	if(ID == 1){
    		return new GuiGuideBook(new ContainerGuideBook(player.inventory, null));
    	}
    	
        TileEntity tile = world.getTileEntity(x, y, z);

        if (tile instanceof TileElectricFurnace) {
            return new GuiElectricFurnace(new ContainerElectricFurnace(player.inventory, tile), tile);
        }
        if (tile instanceof TileBattery) {
            return new GuiBattery(new ContainerBattery(player.inventory, tile), tile);
        }
        if (tile instanceof TileBasicGenerator) {
            return new GuiBasicGenerator(new ContainerBasicGenerator(player.inventory, tile), tile);
        }
        if (tile instanceof TileFireBox) {
            return new GuiFireBox(new ContainerFireBox(player.inventory, tile), tile);
        }
        if (tile instanceof TileBoiler) {
            return new GuiBoiler(new ContainerBoiler(player.inventory, tile), tile);
        }
        if (tile instanceof TileFluidHopper) {
            return new GuiFluidHopper(new ContainerFluidHopper(player.inventory, tile), tile);
        }
        if (tile instanceof TileWindTurbine) {
            return new GuiWindTurbine(new ContainerWindMill(player.inventory, tile), tile);
        }
        if (tile instanceof TileGeothermalPump) {
            return new GuiGeothermalPump(new ContainerGeothermalPump(player.inventory, tile), tile);
        }
        if (tile instanceof TileSteamEngine) {
            return new GuiSteamEngine(new ContainerSteamEngine(player.inventory, tile), tile);
        }
        if (tile instanceof TileCrusher) {
            return new GuiCrusher(new ContainerCrusher(player.inventory, tile), tile);
        }
        if (tile instanceof TileMB_Inv) {
            return new GuiMB_Inv(new ContainerMB_Inv(player.inventory, tile), tile);
        }
        if (tile instanceof TileMiner) {
            return new GuiMiner(new ContainerMiner(player.inventory, tile), tile);
        }
        if (ManagerIntegration.COFH_ENERGY && (tile instanceof TileKineticGenerator)) {
            return new GuiKineticGenerator(new ContainerKineticGenerator(player.inventory, tile), tile);
        }
        if (tile instanceof TileBiomassBurner) {
            return new GuiBiomassBurner(new ContainerBiomassBurner(player.inventory, tile), tile);
        }
        if (tile instanceof TileStirlingGenerator) {
            return new GuiStirlingGenerator(new ContainerStirlingGenerator(player.inventory, tile), tile);
        }
        if (tile instanceof TileGrinder) {
            return new GuiGrinder(new ContainerGrinder(player.inventory, tile), tile);
        }
        if (tile instanceof TileRefinery) {
            return new GuiRefinery(new ContainerRefinery(player.inventory, tile), tile);
        }
        if (tile instanceof TilePolymerizer) {
            return new GuiPolymerizer(new ContainerPolymerizer(player.inventory, tile), tile);
        }
        if (tile instanceof TileSteamTurbineControl) {
            return new GuiSteamTurbine(new ContainerTurbine(player.inventory, tile), tile);
        }
        if (tile instanceof TileCombustionEngine) {
            return new GuiCombustionEngine(new ContainerCombustionEngine(player.inventory, tile), tile);
        }
        if (tile instanceof TileBrickFurnace) {
            return new GuiBrickFurnace(new ContainerBrickFurnace(player.inventory, tile), tile);
        }
        if (tile instanceof TileCrafter) {
            return new GuiCrafter(new ContainerCrafter(player.inventory, tile), tile);
        }
        if (tile instanceof TileOilDistillery) {
            return new GuiOilDistillery(new ContainerOilDistillery(player.inventory, tile), tile);
        }
        if (tile instanceof TileInserter) {
            return new GuiInserter(new ContainerInserter(player.inventory, tile), tile);
        }
        if (tile instanceof TileResistance) {
            return new GuiResistance(new ContainerResistance(player.inventory, tile), tile);
        }
        if (tile instanceof TileThermopile) {
            return new GuiThermopile(new ContainerThermopile(player.inventory, tile), tile);
        }
        if (tile instanceof TileBreaker) {
            return new GuiBreaker(new ContainerBreaker(player.inventory, tile), tile);
        }
        if (tile instanceof TileShelvingUnit) {
            return new GuiShelvingUnit(new ContainerShelvingUnit(player.inventory, tile), tile);
        }
        return null;
    }

}
