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
}
