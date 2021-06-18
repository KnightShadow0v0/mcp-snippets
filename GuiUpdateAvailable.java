import java.io.IOException;

import YourClient.MainMenu;
import YourClient.util.UpdateChecker;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;

public class GuiUpdateAvailable extends GuiScreen {

	public GuiUpdateAvailable(DevilzMainMenu devilzMainMenu) {
		// TODO Auto-generated constructor stub
	}


	public void initGui()
	{
		ScaledResolution sr = new ScaledResolution(mc);
		this.buttonList.add(new GuiButton(1, this.width / 2 - 90, 70, 180, 20, I18n.format("Update and Come again", new Object[0])));
		}
	
	 
	    @Override
	    public void onGuiClosed() {
	    	super.onGuiClosed();
	    }
	    public void openConfigScreen() {
	    	this.mc.displayGuiScreen(this);
	    }
	    
	    public void drawScreen(int mouseX,int mouseY, float partialTicks)
	    {
	    	ScaledResolution sr = new ScaledResolution(mc);
	    	
	    	this.drawDefaultBackground();
	    		  this.drawCenteredString(this.fontRendererObj, I18n.format("Update Found", new Object[0]), this.width / 2, 40, 0xffffff);
	    		  if(UpdateChecker.shouldUpdate()) {
	    				this.drawCenteredString(this.fontRendererObj, I18n.format("§bDear Player. We found a New Update and it's look like you have an Older Version", new Object[0]), this.width / 2, 150, 0xffffff);
	    				this.drawCenteredString(this.fontRendererObj, I18n.format("§bYour Current Version 0.0.1. Available Version 0.0.2", new Object[0]), this.width / 2, 175, 0xffffff);
	    				this.drawCenteredString(this.fontRendererObj, I18n.format("§bYou should update the client", new Object[0]), this.width / 2, 200, 0xffffff);
	    			}
	    		
	    	  
	     super.drawScreen(mouseX, mouseY, partialTicks);
	     }
	    public void actionPerformed(GuiButton button) throws IOException
	    {
	    	if(button.id == 1) {
	    		mc.shutdown();
	    	}
	    
	    	}
	
}
