public class Product {

    private String part1;
    private String part2;

    private Product(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
    }

    public static class Builder {

        private String part1;
        private String part2;

        public Builder part1(String part1) {
            this.part1 = part1;
            return this;
        }

        public Builder part2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
