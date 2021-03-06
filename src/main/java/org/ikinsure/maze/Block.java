package org.ikinsure.maze;

public enum Block {

    PASSAGE(0, "  "),
    WALL(1, "\u2588\u2588"),
    PATH(2, "//");

    final int id;
    private final String texture;

    Block(int id, String texture) {
        this.id = id;
        this.texture = texture;
    }

    public static String findTextureById(int id) {
        for (Block block : Block.values()) {
            if (block.id == id) {
                return block.texture;
            }
        }
        return null;
    }
}
