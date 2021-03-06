package net.meteor.plugin.waila;

import mcp.mobius.waila.api.IWailaRegistrar;
import net.meteor.common.MeteorsMod;
import net.meteor.common.block.BlockFrezarite;
import net.meteor.common.block.BlockMeteor;
import net.meteor.common.block.BlockMeteorShield;
import net.meteor.common.block.BlockMeteorTimer;

public class Waila {
	
	public static void register(IWailaRegistrar reg) {
		
		// Config
		reg.addConfig("Falling Meteors", "meteors.meteorTemp", "Show Meteor Temperature");
		reg.addConfig("Falling Meteors", "meteors.shieldData", "Show Meteor Shield Data");
		reg.addConfig("Falling Meteors", "meteors.timerMode", "Show Timer Mode");
		
		// Registration
		reg.registerBodyProvider(new TimerDataProvider(), BlockMeteorTimer.class);
		reg.registerBodyProvider(new MeteorDataProvider(), BlockMeteor.class);
		reg.registerBodyProvider(new MeteorDataProvider(), BlockFrezarite.class);
		reg.registerBodyProvider(new ShieldDataProvider(), BlockMeteorShield.class);
		
		MeteorsMod.log.info("Waila mod found. Waila integration enabled.");
		
	}

}
