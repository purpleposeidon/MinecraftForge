package net.minecraftforge.client;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface ISegmentedModel {
    public int getSize();
    
    public void populate(IBlockAccess world, BlockPos position, IBlockState state, IBakedModel[] models);
}
