package services;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewPetTest {
    PetHelper petHelper = new PetHelper();


    @Test
    public void addPetHappyPath(){
        Response response = petHelper.addNewPet(1,1,"test","test2","testtt",1,"tag test","available");
        Assert.assertEquals(response.jsonPath().getString("category.name"), "test");
    }
}
