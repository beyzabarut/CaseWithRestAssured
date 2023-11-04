package request;

public class Category {
    public int id;
    public String name;

    private Category(CategoryBuilder categoryBuilder) {
        id = categoryBuilder.id;
        name = categoryBuilder.name;
    }

    public static CategoryBuilder newCategoryBuilder() {
        return new CategoryBuilder();
    }

    public static class CategoryBuilder {
        private int id;
        private String name;

        public CategoryBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public CategoryBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
