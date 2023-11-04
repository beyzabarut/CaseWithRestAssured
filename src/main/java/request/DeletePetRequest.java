package request;

public class DeletePetRequest {
    public Integer petId;

    public DeletePetRequest(Integer petId) {
        this.petId = petId;
    }

    public DeletePetRequest() {

    }

    public Integer getPetId() {
        return petId;
    }

    public DeletePetRequest setPetId(Integer petId) {
        this.petId = petId;
        return this;
    }
}
