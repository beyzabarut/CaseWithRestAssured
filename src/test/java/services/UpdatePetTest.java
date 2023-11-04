package services;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdatePetTest {
    PetHelper petHelper = new PetHelper();
    Integer petId = 1;

    @Test
    public void addPetHappyPath(){
        Response response = petHelper.updatePet(1,1,"test","test2","testtt",1,"tag test","available");
        Assert.assertEquals(response.jsonPath().getString("category.name"), "test");
    }

    @Test
    public void deleteNonExistPet(){
        petHelper.addNewPet(petId,1,"test","","testtt",1,"tag test","available");
        petHelper.deletePet(petId);
        Response response = petHelper.updatePet(petId,1,"test","test2","testtt",1,"tag test","available");
        Assert.assertEquals(response.jsonPath().getString("category.name"), "test");
    }
}
