package mp.slave_mod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import mp.slave_mod.world.inventory.OtrokarGUIMenu;
import mp.slave_mod.procedures.PistureShowCondition2Procedure;
import mp.slave_mod.procedures.PictureShowConditionProcedure;
import mp.slave_mod.procedures.PictureShowConditionDoneProcedure;
import mp.slave_mod.procedures.PictureShowCondition3Procedure;
import mp.slave_mod.procedures.BackgroundShowConditionProcedure;
import mp.slave_mod.network.OtrokarGUIButtonMessage;
import mp.slave_mod.SlaveModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OtrokarGUIScreen extends AbstractContainerScreen<OtrokarGUIMenu> {
	private final static HashMap<String, Object> guistate = OtrokarGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_buy;

	public OtrokarGUIScreen(OtrokarGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 170;
	}

	private static final ResourceLocation texture = new ResourceLocation("slave_mod:textures/screens/otrokar_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (BackgroundShowConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/pozadi_gui.png"), this.leftPos + 8, this.topPos + 6, 0, 0, 295, 112, 295, 112);
		}
		if (PictureShowConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/vystrizek.png"), this.leftPos + 81, this.topPos + 1, 0, 0, 49, 76, 49, 76);
		}
		if (PictureShowConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/vystrizek.png"), this.leftPos + 121, this.topPos + 1, 0, 0, 49, 76, 49, 76);
		}
		if (PistureShowCondition2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/vystrizek.png"), this.leftPos + 101, this.topPos + 1, 0, 0, 49, 76, 49, 76);
		}
		if (PictureShowCondition3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/vystrizek.png"), this.leftPos + 101, this.topPos + 1, 0, 0, 49, 76, 49, 76);
		}
		if (PictureShowConditionDoneProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/emerald_je3_be3.png"), this.leftPos + 15, this.topPos + 9, 0, 0, 20, 20, 20, 20);
		}
		if (PictureShowConditionDoneProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/littlenslave.png"), this.leftPos + 52, this.topPos + 3, 0, 0, 20, 30, 20, 30);
		}

		guiGraphics.blit(new ResourceLocation("slave_mod:textures/screens/godlen_frame.png"), this.leftPos + -30, this.topPos + -17, 0, 0, 250, 140, 250, 140);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		if (PictureShowConditionDoneProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_16"), 25, 20, -1, false);
		if (PictureShowConditionDoneProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_empty"), 41, 15, -12829636, false);
		if (PictureShowConditionDoneProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_buy"), 36, 60, -16777216, false);
		if (BackgroundShowConditionProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_sorry_but_i_am_not_able_to"), 21, 17, -6750208, false);
		if (BackgroundShowConditionProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_offer_you_more"), 53, 30, -6750208, false);
		if (BackgroundShowConditionProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_no_refunds"), 63, 47, -12829636, false);
		if (BackgroundShowConditionProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.slave_mod.otrokar_gui.label_slavery_as"), 103, 70, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_buy = Button.builder(Component.translatable("gui.slave_mod.otrokar_gui.button_buy"), e -> {
			if (PictureShowConditionDoneProcedure.execute(world, x, y, z)) {
				SlaveModMod.PACKET_HANDLER.sendToServer(new OtrokarGUIButtonMessage(0, x, y, z));
				OtrokarGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 23, this.topPos + 55, 40, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (PictureShowConditionDoneProcedure.execute(world, x, y, z))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_buy", button_buy);
		this.addRenderableWidget(button_buy);
	}
}
