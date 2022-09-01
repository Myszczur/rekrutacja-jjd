package pl.urbanik;

import pl.urbanik.interfaces.Block;
import pl.urbanik.interfaces.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks = new ArrayList<>();

    public void addBlock(Block block) {
        blocks.add(block);
    }

    private Block getBlockObject(Object block) {

        if (block instanceof Block) {
            return (Block) block;
        }
        return null;
    }

    @Override
    public Optional findBlockByColor(String color) {
        return blocks.stream()
                .filter(it -> Objects.requireNonNull(getBlockObject(it)).getColor().equals(color))
                .findFirst();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(it -> Objects.requireNonNull(getBlockObject(it)).getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks
                .stream()
                .mapToInt(Block::getChildrenCount)
                .sum();
    }
}

