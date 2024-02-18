package builder;
//
// The Builder pattern separates the construction of a complex object from its representation,
// allowing the same construction process to create different representations.
//
public class Builder {
    String part1;
    String part2;

    public Builder part1(String part1) {
        this.part1 = part1;
        return this;
    }

    public Builder part2(String part2) {
        this.part2 = part2;
        return this;
    }

    public BuilderProduct build() {
        return new BuilderProduct(this);
    }
}
