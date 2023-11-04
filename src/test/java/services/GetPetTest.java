package services;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPetTest {
    PetHelper petHelper = new PetHelper();

    @Test
    public void getPetHappyPath(){
        Response response = petHelper.getPet(1);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
    }

    @Test
    public void getNonExistPet(){
        petHelper.addNewPet(1,1,"test","test2","testtt",1,"tag test","available");
        petHelper.deletePet(1);
        Response response = petHelper.getPet(1);
        Assert.assertEquals(response.jsonPath().getString("message"), "Pet not found");
    }
}
