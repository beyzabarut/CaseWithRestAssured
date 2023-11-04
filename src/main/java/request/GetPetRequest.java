package request;

public class GetPetRequest {
    public Integer petId;

    public GetPetRequest() {

    }

    public Integer getPetId() {
        return petId;
    }

    public GetPetRequest setPetId(Integer petId) {
        this.petId = petId;
        return this;
    }

    public GetPetRequest(Integer petId) {
        this.petId = petId;
    }
}
