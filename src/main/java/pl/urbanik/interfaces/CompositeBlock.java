package pl.urbanik.interfaces;

import java.util.List;

public interface CompositeBlock extends Block {

    List<Block> getBlocks();

    @Override
    default int getChildrenCount() {
        return getBlocks()
                .stream()
                .mapToInt(Block::getChildrenCount)
                .sum();
    }
}
