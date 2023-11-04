package request;

import java.util.ArrayList;
import java.util.List;

public class UpdatePetRequest {
        public int id;
        public Category category;
        public String name;
        public List<String> photoUrls = new ArrayList<>();
        public List<Tag> tags = new ArrayList<>();
        public String status;

    public UpdatePetRequest(int id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public UpdatePetRequest() {

    }

    public int getId() {
        return id;
    }

    public UpdatePetRequest setId(int id) {
        this.id = id;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public UpdatePetRequest setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdatePetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public UpdatePetRequest setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    public UpdatePetRequest addPhotoUrl(String photoUrl) {
        photoUrls.add(photoUrl);
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public UpdatePetRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdatePetRequest addTag(Tag tag) {
        tags.add(tag);
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdatePetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
}