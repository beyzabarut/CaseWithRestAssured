package services;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePetTest {
    PetHelper petHelper = new PetHelper();
    Integer petId;

    @Test
    public void deletePetHappyPath(){
        Response responseAddNewPet = petHelper.addNewPet(1,1,"test","test2","testtt",1,"tag test","available");
        petId = responseAddNewPet.jsonPath().getInt("id");
        Response response = petHelper.deletePet(petId);
        Assert.assertEquals(response.jsonPath().getInt("code"),200);
    }

    @Test
    public void deleteNonExistPet(){
        Response responseAddNewPet = petHelper.addNewPet(1,1,"test","test2","testtt",1,"tag test","available");
        petId = responseAddNewPet.jsonPath().getInt("id");
        Response response = petHelper.deletePet(petId);
        Assert.assertEquals(response.jsonPath().getInt("code"),200);
        Response responseDelete = petHelper.deletePet(petId);
        Integer status = responseDelete.statusCode();
        System.out.println(status);
    }


}
