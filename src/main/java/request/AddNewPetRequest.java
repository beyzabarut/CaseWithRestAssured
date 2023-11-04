package request;

import java.util.ArrayList;
import java.util.List;

public class AddNewPetRequest {
    public int id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tag> tags;
    public String status;

    private AddNewPetRequest(AddNewPetRequestBuilder addNewPetRequestBuilder) {
        id = addNewPetRequestBuilder.id;
        category = addNewPetRequestBuilder.category;
        name = addNewPetRequestBuilder.name;
        photoUrls = addNewPetRequestBuilder.photoUrls;
        tags = addNewPetRequestBuilder.tags;
        status = addNewPetRequestBuilder.status;
    }

    public static AddNewPetRequestBuilder newAddPetRequestBuilder() {
        return new AddNewPetRequestBuilder();
    }


    public static class AddNewPetRequestBuilder {
        private int id;
        private Category category;
        private String name;
        private List<String> photoUrls = new ArrayList<>();
        private List<Tag> tags = new ArrayList<>();
        private String status;

        public AddNewPetRequestBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public AddNewPetRequestBuilder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public AddNewPetRequestBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AddNewPetRequestBuilder addPhotoUrl(String photoUrl) {
            photoUrls.add(photoUrl);
            return this;
        }

        public AddNewPetRequestBuilder setTags(List<Tag> tags) {
            this.tags = tags;
            return this;
        }


        public AddNewPetRequestBuilder addTags(Tag tag) {
            tags.add(tag);
            return this;
        }

        public AddNewPetRequestBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public AddNewPetRequest build() {
            return new AddNewPetRequest(this);
        }
    }
}