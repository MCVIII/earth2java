package slexom.earthtojava.mobs.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import slexom.earthtojava.mobs.entity.merchant.villager.E2JWanderingTraderEntity;
import slexom.earthtojava.mobs.entity.monster.BoneSpiderEntity;
import slexom.earthtojava.mobs.entity.monster.SkeletonWolfEntity;
import slexom.earthtojava.mobs.entity.passive.*;
import slexom.earthtojava.mobs.entity.projectile.BoneShardEntity;
import slexom.earthtojava.mobs.entity.projectile.MelonSeedProjectileEntity;

public class EntityTypesInit {

    public static final String ALBINO_COW_REGISTRY_NAME = "albino_cow";
    public static final String AMBER_CHICKEN_REGISTRY_NAME = "amber_chicken";
    public static final String ASHEN_COW_REGISTRY_NAME = "ashen_cow";
    public static final String BONE_SHARD_REGISTRY_NAME = "bone_shard";
    public static final String BONE_SPIDER_REGISTRY_NAME = "bone_spider";
    public static final String CLUCKSHROOM_REGISTRY_NAME = "cluckshroom";
    public static final String FLECKED_SHEEP_REGISTRY_NAME = "flecked_sheep";
    public static final String FURNACE_GOLEM_REGISTRY_NAME = "furnace_golem";
    public static final String GLOW_SQUID_REGISTRY_NAME = "glow_squid";
    public static final String HARELEQUIN_RABBIT_REGISTRY_NAME = "harelequin_rabbit";
    public static final String HORNED_SHEEP_REGISTRY_NAME = "horned_sheep";
    public static final String INKY_SHEEP_REGISTRY_NAME = "inky_sheep";
    public static final String JOLLY_LLAMA_REGISTRY_NAME = "jolly_llama";
    public static final String JUMBO_RABBIT_REGISTRY_NAME = "jumbo_rabbit";
    public static final String MELON_GOLEM_REGISTRY_NAME = "melon_golem";
    public static final String MELON_SEED_PROJECTILE_REGISTRY_NAME = "melon_seed_projectile";
    public static final String MIDNIGHT_CHICKEN_REGISTRY_NAME = "midnight_chicken";
    public static final String MOOBLOOM_REGISTRY_NAME = "moobloom";
    public static final String MUDDY_FOOT_RABBIT_REGISTRY_NAME = "muddy_foot_rabbit";
    public static final String MUDDY_PIG_REGISTRY_NAME = "muddy_pig";
    public static final String PALE_PIG_REGISTRY_NAME = "pale_pig";
    public static final String PIEBALD_PIG_REGISTRY_NAME = "piebald_pig";
    public static final String RAINBOW_SHEEP_REGISTRY_NAME = "rainbow_sheep";
    public static final String ROCKY_SHEEP_REGISTRY_NAME = "rocky_sheep";
    public static final String SKELETON_WOLF_REGISTRY_NAME = "skeleton_wolf";
    public static final String SPOTTED_PIG_REGISTRY_NAME = "spotted_pig";
    public static final String STORMY_CHICKEN_REGISTRY_NAME = "stormy_chicken";
    public static final String SUNSET_COW_REGISTRY_NAME = "sunset_cow";
    public static final String TROPICAL_SLIME_REGISTRY_NAME = "tropical_slime";
    public static final String VESTED_RABBIT_REGISTRY_NAME = "vested_rabbit";
    public static final String WANDERING_TRADER_REGISTRY_NAME = "wandering_trader";
    public static final String WOOLY_COW_REGISTRY_NAME = "wooly_cow";
    public static EntityType<AlbinoCowEntity> ALBINO_COW_REGISTRY_OBJECT;
    public static EntityType<AmberChickenEntity> AMBER_CHICKEN_REGISTRY_OBJECT;
    public static EntityType<AshenCowEntity> ASHEN_COW_REGISTRY_OBJECT;
    public static EntityType<BoneShardEntity> BONE_SHARD_REGISTRY_OBJECT;
    public static EntityType<BoneSpiderEntity> BONE_SPIDER_REGISTRY_OBJECT;
    public static EntityType<CluckshroomEntity> CLUCKSHROOM_REGISTRY_OBJECT;
    public static EntityType<FleckedSheepEntity> FLECKED_SHEEP_REGISTRY_OBJECT;
    public static EntityType<FurnaceGolemEntity> FURNACE_GOLEM_REGISTRY_OBJECT;
    public static EntityType<GlowSquidEntity> GLOW_SQUID_REGISTRY_OBJECT;
    public static EntityType<HarelequinRabbitEntity> HARELEQUIN_RABBIT_REGISTRY_OBJECT;
    public static EntityType<HornedSheepEntity> HORNED_SHEEP_REGISTRY_OBJECT;
    public static EntityType<InkySheepEntity> INKY_SHEEP_REGISTRY_OBJECT;
    public static EntityType<JollyLlamaEntity> JOLLY_LLAMA_REGISTRY_OBJECT;
    public static EntityType<JumboRabbitEntity> JUMBO_RABBIT_REGISTRY_OBJECT;
    public static EntityType<MelonGolemEntity> MELON_GOLEM_REGISTRY_OBJECT;
    public static EntityType<MelonSeedProjectileEntity> MELON_SEED_PROJECTILE_REGISTRY_OBJECT;
    public static EntityType<MidnightChickenEntity> MIDNIGHT_CHICKEN_REGISTRY_OBJECT;
    public static EntityType<MoobloomEntity> MOOBLOOM_REGISTRY_OBJECT;
    public static EntityType<MuddyFootRabbitEntity> MUDDY_FOOT_RABBIT_REGISTRY_OBJECT;
    public static EntityType<MuddyPigEntity> MUDDY_PIG_REGISTRY_OBJECT;
    public static EntityType<PalePigEntity> PALE_PIG_REGISTRY_OBJECT;
    public static EntityType<PiebaldPigEntity> PIEBALD_PIG_REGISTRY_OBJECT;
    public static EntityType<RainbowSheepEntity> RAINBOW_SHEEP_REGISTRY_OBJECT;
    public static EntityType<RockySheepEntity> ROCKY_SHEEP_REGISTRY_OBJECT;
    public static EntityType<SkeletonWolfEntity> SKELETON_WOLF_REGISTRY_OBJECT;
    public static EntityType<SpottedPigEntity> SPOTTED_PIG_REGISTRY_OBJECT;
    public static EntityType<StormyChickenEntity> STORMY_CHICKEN_REGISTRY_OBJECT;
    public static EntityType<SunsetCowEntity> SUNSET_COW_REGISTRY_OBJECT;
    public static EntityType<TropicalSlimeEntity> TROPICAL_SLIME_REGISTRY_OBJECT;
    public static EntityType<VestedRabbitEntity> VESTED_RABBIT_REGISTRY_OBJECT;
    public static EntityType<E2JWanderingTraderEntity> WANDERING_TRADER_REGISTRY_OBJECT;
    public static EntityType<WoolyCowEntity> WOOLY_COW_REGISTRY_OBJECT;

    public static void init() {
        AMBER_CHICKEN_REGISTRY_OBJECT = RegisterHelper.registerEntity(AMBER_CHICKEN_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AmberChickenEntity::new).dimensions(EntityDimensions.fixed(EntityType.CHICKEN.getWidth(), EntityType.CHICKEN.getHeight())).trackable(64, 3).build());
        ASHEN_COW_REGISTRY_OBJECT = RegisterHelper.registerEntity(ASHEN_COW_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AshenCowEntity::new).dimensions(EntityDimensions.fixed(EntityType.COW.getWidth(), EntityType.COW.getHeight())).trackable(64, 3).build());
        ALBINO_COW_REGISTRY_OBJECT = RegisterHelper.registerEntity(ALBINO_COW_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AlbinoCowEntity::new).dimensions(EntityDimensions.fixed(EntityType.COW.getWidth(), EntityType.COW.getHeight())).trackable(64, 3).build());
        BONE_SHARD_REGISTRY_OBJECT = RegisterHelper.registerEntity(BONE_SHARD_REGISTRY_NAME, FabricEntityTypeBuilder.<BoneShardEntity>create(SpawnGroup.MISC, BoneShardEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackable(64, 3).build());
        BONE_SPIDER_REGISTRY_OBJECT = RegisterHelper.registerEntity(BONE_SPIDER_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BoneSpiderEntity::new).dimensions(EntityDimensions.fixed(0.6F, 0.7F)).trackable(64, 3).build());
        CLUCKSHROOM_REGISTRY_OBJECT = RegisterHelper.registerEntity(CLUCKSHROOM_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CluckshroomEntity::new).dimensions(EntityDimensions.fixed(EntityType.CHICKEN.getWidth(), EntityType.CHICKEN.getHeight())).trackable(64, 3).build());
        FLECKED_SHEEP_REGISTRY_OBJECT = RegisterHelper.registerEntity(FLECKED_SHEEP_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FleckedSheepEntity::new).dimensions(EntityDimensions.fixed(EntityType.SHEEP.getWidth(), EntityType.SHEEP.getHeight())).trackable(64, 3).build());
        FURNACE_GOLEM_REGISTRY_OBJECT = RegisterHelper.registerEntity(FURNACE_GOLEM_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.MISC, FurnaceGolemEntity::new).dimensions(EntityDimensions.fixed(EntityType.IRON_GOLEM.getWidth(), EntityType.IRON_GOLEM.getHeight())).fireImmune().trackable(64, 3).build());
        GLOW_SQUID_REGISTRY_OBJECT = RegisterHelper.registerEntity(GLOW_SQUID_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, GlowSquidEntity::new).dimensions(EntityDimensions.fixed(EntityType.SQUID.getWidth(), EntityType.SQUID.getHeight())).trackable(64, 3).build());
        HARELEQUIN_RABBIT_REGISTRY_OBJECT = RegisterHelper.registerEntity(HARELEQUIN_RABBIT_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HarelequinRabbitEntity::new).dimensions(EntityDimensions.fixed(EntityType.RABBIT.getWidth(), EntityType.RABBIT.getHeight())).trackable(64, 3).build());
        HORNED_SHEEP_REGISTRY_OBJECT = RegisterHelper.registerEntity(HORNED_SHEEP_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HornedSheepEntity::new).dimensions(EntityDimensions.fixed(EntityType.SHEEP.getWidth(), EntityType.SHEEP.getHeight())).trackable(64, 3).build());
        INKY_SHEEP_REGISTRY_OBJECT = RegisterHelper.registerEntity(INKY_SHEEP_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, InkySheepEntity::new).dimensions(EntityDimensions.fixed(EntityType.SHEEP.getWidth(), EntityType.SHEEP.getHeight())).trackable(64, 3).build());
        JOLLY_LLAMA_REGISTRY_OBJECT = RegisterHelper.registerEntity(JOLLY_LLAMA_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, JollyLlamaEntity::new).dimensions(EntityDimensions.fixed(EntityType.LLAMA.getWidth(), EntityType.LLAMA.getHeight())).trackable(64, 3).build());
        JUMBO_RABBIT_REGISTRY_OBJECT = RegisterHelper.registerEntity(JUMBO_RABBIT_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, JumboRabbitEntity::new).dimensions(EntityDimensions.fixed(0.8F, 1.0F)).trackable(64, 3).build());
        MELON_GOLEM_REGISTRY_OBJECT = RegisterHelper.registerEntity(MELON_GOLEM_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.MISC, MelonGolemEntity::new).dimensions(EntityDimensions.fixed(EntityType.SNOW_GOLEM.getWidth(), EntityType.SNOW_GOLEM.getHeight())).trackable(64, 3).build());
        MELON_SEED_PROJECTILE_REGISTRY_OBJECT = RegisterHelper.registerEntity(MELON_SEED_PROJECTILE_REGISTRY_NAME, FabricEntityTypeBuilder.<MelonSeedProjectileEntity>create(SpawnGroup.MISC, MelonSeedProjectileEntity::new).dimensions(EntityDimensions.fixed(0.25F, 0.25F)).trackable(64, 3).build());
        MIDNIGHT_CHICKEN_REGISTRY_OBJECT = RegisterHelper.registerEntity(MIDNIGHT_CHICKEN_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MidnightChickenEntity::new).dimensions(EntityDimensions.fixed(EntityType.CHICKEN.getWidth(), EntityType.CHICKEN.getHeight())).trackable(64, 3).build());
        MOOBLOOM_REGISTRY_OBJECT = RegisterHelper.registerEntity(MOOBLOOM_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MoobloomEntity::new).dimensions(EntityDimensions.fixed(EntityType.COW.getWidth(), EntityType.COW.getHeight())).trackable(64, 3).build());
        MUDDY_FOOT_RABBIT_REGISTRY_OBJECT = RegisterHelper.registerEntity(MUDDY_FOOT_RABBIT_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MuddyFootRabbitEntity::new).dimensions(EntityDimensions.fixed(EntityType.RABBIT.getWidth(), EntityType.RABBIT.getHeight())).trackable(64, 3).build());
        MUDDY_PIG_REGISTRY_OBJECT = RegisterHelper.registerEntity(MUDDY_PIG_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MuddyPigEntity::new).dimensions(EntityDimensions.fixed(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())).trackable(64, 3).build());
        PALE_PIG_REGISTRY_OBJECT = RegisterHelper.registerEntity(PALE_PIG_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PalePigEntity::new).dimensions(EntityDimensions.fixed(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())).trackable(64, 3).build());
        PIEBALD_PIG_REGISTRY_OBJECT = RegisterHelper.registerEntity(PIEBALD_PIG_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PiebaldPigEntity::new).dimensions(EntityDimensions.fixed(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())).trackable(64, 3).build());
        RAINBOW_SHEEP_REGISTRY_OBJECT = RegisterHelper.registerEntity(RAINBOW_SHEEP_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RainbowSheepEntity::new).dimensions(EntityDimensions.fixed(EntityType.SHEEP.getWidth(), EntityType.SHEEP.getHeight())).trackable(64, 3).build());
        ROCKY_SHEEP_REGISTRY_OBJECT = RegisterHelper.registerEntity(ROCKY_SHEEP_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RockySheepEntity::new).dimensions(EntityDimensions.fixed(EntityType.SHEEP.getWidth(), EntityType.SHEEP.getHeight())).trackable(64, 3).build());
        SKELETON_WOLF_REGISTRY_OBJECT = RegisterHelper.registerEntity(SKELETON_WOLF_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeletonWolfEntity::new).dimensions(EntityDimensions.fixed(EntityType.WOLF.getWidth(), EntityType.WOLF.getHeight())).trackable(64, 3).build());
        SPOTTED_PIG_REGISTRY_OBJECT = RegisterHelper.registerEntity(SPOTTED_PIG_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SpottedPigEntity::new).dimensions(EntityDimensions.fixed(EntityType.PIG.getWidth(), EntityType.PIG.getHeight())).trackable(64, 3).build());
        STORMY_CHICKEN_REGISTRY_OBJECT = RegisterHelper.registerEntity(STORMY_CHICKEN_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, StormyChickenEntity::new).dimensions(EntityDimensions.fixed(EntityType.CHICKEN.getWidth(), EntityType.CHICKEN.getHeight())).trackable(64, 3).build());
        SUNSET_COW_REGISTRY_OBJECT = RegisterHelper.registerEntity(SUNSET_COW_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SunsetCowEntity::new).dimensions(EntityDimensions.fixed(EntityType.COW.getWidth(), EntityType.COW.getHeight())).trackable(64, 3).build());
        TROPICAL_SLIME_REGISTRY_OBJECT = RegisterHelper.registerEntity(TROPICAL_SLIME_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TropicalSlimeEntity::new).dimensions(EntityDimensions.fixed(2.04F, 2.04F)).fireImmune().trackable(64, 3).build());
        VESTED_RABBIT_REGISTRY_OBJECT = RegisterHelper.registerEntity(VESTED_RABBIT_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, VestedRabbitEntity::new).dimensions(EntityDimensions.fixed(EntityType.RABBIT.getWidth(), EntityType.RABBIT.getHeight())).trackable(64, 3).build());
        WANDERING_TRADER_REGISTRY_OBJECT = RegisterHelper.registerEntity(WANDERING_TRADER_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, E2JWanderingTraderEntity::new).dimensions(EntityDimensions.fixed(EntityType.WANDERING_TRADER.getWidth(), EntityType.WANDERING_TRADER.getHeight())).trackable(64, 3).build());
        WOOLY_COW_REGISTRY_OBJECT = RegisterHelper.registerEntity(WOOLY_COW_REGISTRY_NAME, FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WoolyCowEntity::new).dimensions(EntityDimensions.fixed(EntityType.COW.getWidth(), EntityType.COW.getHeight())).trackable(64, 3).build());
    }

}


