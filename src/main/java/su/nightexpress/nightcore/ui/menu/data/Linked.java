package su.nightexpress.nightcore.ui.menu.data;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.nightexpress.nightcore.language.entry.LangItem;
import su.nightexpress.nightcore.ui.menu.Menu;
import su.nightexpress.nightcore.ui.menu.MenuViewer;
import su.nightexpress.nightcore.ui.menu.item.ItemClick;
import su.nightexpress.nightcore.ui.menu.item.ItemOptions;
import su.nightexpress.nightcore.util.bukkit.NightItem;

public interface Linked<T> extends Menu {

    boolean open(@NotNull Player player, @NotNull T obj);

    @NotNull LinkCache<T> getCache();

    T getLink(@NotNull MenuViewer viewer);

    T getLink(@NotNull Player player);

    ItemClick manageLink(@NotNull LinkHandler<T> handler);

    void addItem(@NotNull Material material, @NotNull LangItem locale, int slot, @NotNull LinkHandler<T> handler);

    void addItem(@NotNull Material material, @NotNull LangItem locale, int slot, @NotNull LinkHandler<T> handler, @Nullable ItemOptions options);

    void addItem(@NotNull ItemStack itemStack, @NotNull LangItem locale, int slot, @NotNull LinkHandler<T> handler);

    void addItem(@NotNull ItemStack itemStack, @NotNull LangItem locale, int slot, @NotNull LinkHandler<T> handler, @Nullable ItemOptions options);

    void addItem(@NotNull NightItem item, int slot, @NotNull LinkHandler<T> handler);

    void addItem(@NotNull NightItem item, int slot, @NotNull LinkHandler<T> handler, @Nullable ItemOptions options);
}