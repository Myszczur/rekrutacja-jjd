package pl.urbanik;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.addBlock(new MyBlock("red", "clay"));
        wall.addBlock(new MyBlock("white", "clay"));
        wall.addBlock(new MyBlock("yellow", "clay"));
        wall.addBlock(new MyBlock("blue", "clay"));
        wall.addBlock(new MyBlock("green", "steel"));
        wall.addBlock(new MyBlock("black", "steel"));
        wall.addBlock(new MyBlock("pink", "steel"));

        System.out.println(wall.findBlockByColor("white"));
        System.out.println(wall.findBlockByColor("blue"));
        System.out.println(wall.findBlocksByMaterial("clay"));
        System.out.println(wall.findBlocksByMaterial("steel"));
        System.out.println(wall.count());
    }
}

