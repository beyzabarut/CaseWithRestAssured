package request;

public class Tag {
    public int id;
    public String name;

    private Tag(TagBuilder tagBuilder) {
        id = tagBuilder.id;
        name = tagBuilder.name;
    }

    public static TagBuilder newTagBuilder() {
        return new TagBuilder();
    }


    public static final class TagBuilder {
        private int id;
        private String name;

        public TagBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public TagBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Tag build() {
            return new Tag(this);
        }
    }
}
