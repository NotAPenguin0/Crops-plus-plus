package lokko12.berriespp.crops;

import ic2.api.crops.ICropTile;
import ic2.api.crops.CropCard;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

public class RaspberryCrop extends BasicBerryCrop {

    public RaspberryCrop(int id, ItemStack item) {
        super();
    }

    public String name() {
        return "Raspberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Food", "Tendrilly", "Red"}; // Red like CropRedWheat, CropNetherWart
    }


    public String discoveredBy() {
        return "Ancient cultures";
    }
    @Override
	public ItemStack getGain(ICropTile crop) {
		return new ItemStack(NContent.berryItem,3,0);
	}
}
