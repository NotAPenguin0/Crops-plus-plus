package lokko12.berriespp.crops.bpp;

import ic2.api.crops.ICropTile;
import lokko12.berriespp.ConfigValures;
import lokko12.berriespp.crops.abstracts.BasicTinkerBerryCrop;
import lokko12.croploadcore.Operators;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CobaltBerryCrop extends BasicTinkerBerryCrop {

	public CobaltBerryCrop ()
	{
		super();
	}

	@Override
	public String name() {
		return "Cobalt Berry";
	}
       
	@Override
	public int tier() {
        return 7;
    }
    @Override
    public ItemStack getGain(ICropTile crop) {
    	if ((crop.isBlockBelow("blockCobalt") == true||ConfigValures.Debug == true) && OreDictionary.getOres("nuggetCobalt").size()!= 0)
    	{
            return OreDictionary.getOres("nuggetCobalt").get(OreDictionary.getOres("nuggetCobalt").size()-1);
        }
    	else 
    		return null;
    }
    
    @Override
    public int growthDuration(ICropTile crop) {
    	if (ConfigValures.Debug == true)
    		return 1;
        if (crop.getSize() == 2)
            return 3000;
        	else
		if (Operators.AND(crop.getSize() == 3,crop.isBlockBelow("blockCobalt")))
		    return 3000;
		    else
		    return 500;
        }
	@Override
	public String[] attributes() {
        return new String[] {"Berry", "Cobalt", "Tendrilly", "Metal", "Blue"};
	}


}
