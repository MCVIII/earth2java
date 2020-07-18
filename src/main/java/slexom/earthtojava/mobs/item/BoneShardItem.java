package slexom.earthtojava.mobs.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import slexom.earthtojava.mobs.entity.projectile.BoneShardEntity;

public class BoneShardItem extends E2JItem {
    public BoneShardItem(Item.Settings builder) {
        super(builder);
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (RANDOM.nextFloat() * 0.4F + 0.8F));
        if (!world.isClient) {
            BoneShardEntity boneShardEntity = new BoneShardEntity(world, user);
            boneShardEntity.setItem(itemStack);
            boneShardEntity.setProperties(user, user.pitch, user.yaw, 0.0F, 1.5F, 1.0F);
            world.spawnEntity(boneShardEntity);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.abilities.creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.method_29237(itemStack, world.isClient());
    }
}