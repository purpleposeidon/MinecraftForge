package net.minecraftforge.client;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface ISegmentedModel {
    public IBakedModel[] getModels(IBlockAccess world, BlockPos position, IBlockState state);
}
