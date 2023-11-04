package services;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePetTest {
    PetHelper petHelper = new PetHelper();

    @Test
    public void deletePetHappyPath(){
        Response response = petHelper.deletePet(1);
        Assert.assertEquals(response.jsonPath().getInt("code"),200);
    }
}
