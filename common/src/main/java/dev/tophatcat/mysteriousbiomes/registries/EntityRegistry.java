package dev.tophatcat.mysteriousbiomes.registries;

import dev.tophatcat.mysteriousbiomes.MysteriousCommon;
import dev.tophatcat.mysteriousbiomes.entity.TheForgottenWarlockEntity;
import dev.tophatcat.mysteriousbiomes.utils.RegistryTools;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class EntityRegistry {

    public static void init() {
        MysteriousCommon.LOG.debug("Registering entities...");
    }

    public static final Supplier<EntityType<TheForgottenWarlockEntity>> THE_FORGOTTEN_WARLOCK = RegistryTools.registerEntity(
        "the_forgotten_warlock", TheForgottenWarlockEntity::new, 0.75F, 2.30F, MobCategory.MONSTER);

    public static void registerEntityAttributes(BiConsumer<EntityType<? extends LivingEntity>,
        AttributeSupplier> registrar) {
        registrar.accept(EntityRegistry.THE_FORGOTTEN_WARLOCK.get(), Mob.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 40.0D)
            .add(Attributes.ATTACK_DAMAGE, 7.0D)
            .add(Attributes.MOVEMENT_SPEED, 0.25D).build());
    }
}
