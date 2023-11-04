package services;

import client.RestAssuredRequestSpecification;
import config.APIConstant;
import io.restassured.response.Response;
import request.*;

public class PetHelper extends RestAssuredRequestSpecification {
    public PetHelper(){
        super(APIConstant.BASE_URL) ;
    }

    public Response addNewPet(Integer id, Integer categoryId, String categoryName, String name, String photoUrl, Integer tagId, String tagName, String status){
        Category category = Category.newCategoryBuilder().setId(categoryId).setName(categoryName).build();
        Tag tag = Tag.newTagBuilder().setId(tagId).setName(tagName).build();
        AddNewPetRequest addNewPetRequest = AddNewPetRequest.newAddPetRequestBuilder().setId(id).setCategory(category)
            .setName(name)
            .addPhotoUrl(photoUrl)
            .addTags(tag)
            .setStatus(status)
            .build();
        return post("pet", null, null, addNewPetRequest);
}
    public Response updatePet(Integer id, Integer categoryId, String categoryName, String name, String photoUrl, Integer tagId, String tagName, String status){
        Category category = Category.newCategoryBuilder().setId(categoryId).setName(categoryName).build();
        Tag tag = Tag.newTagBuilder().setId(tagId).setName(tagName).build();
        UpdatePetRequest updatePetRequest = new UpdatePetRequest();
        updatePetRequest.setId(id).setCategory(category)
                .setName(name)
                .addPhotoUrl(photoUrl)
                .addTag(tag)
                .setStatus(status);
        return put("pet", null, null, updatePetRequest);
    }

    public Response getPet(Integer petId){
        GetPetRequest getPetRequest = new GetPetRequest();
        getPetRequest.setPetId(petId);
        return get("pet/" + petId, null, null, null);
    }


    public Response deletePet(Integer petId){
        DeletePetRequest deletePetRequest = new DeletePetRequest();
        deletePetRequest.setPetId(petId);
        return delete("pet/" + petId, null, null, null);
    }


}
