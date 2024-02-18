package builder;

public class BuilderProduct {
    private final String part1;
    private final String part2;


    BuilderProduct(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
    }

    public String getPart1() {
        return this.part1;
    }

    public String getPart2() {
        return this.part2;
    }
}
