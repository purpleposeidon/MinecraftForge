package net.minecraftforge.client;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface ITessellatorRenderer
{
    
    public boolean func_178270_a(IBlockAccess world, IBlockState state, BlockPos position, WorldRenderer worldRenderer);

    public void func_178268_a();

    public void setModelBrightness(IBlockState state, float brightness);
    
    public void renderDamage(IBlockAccess world, IBlockState state, BlockPos position, WorldRenderer worldRenderer);
}
