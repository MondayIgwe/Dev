package RestAPI;

import Support.*;
import Utils.Specifications;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Random;

public class TestAirlines {

    private Map<String, String> data;

    @BeforeTest
    public void setUp() {
      //  String env = System.getProperty("env") == null ? Environment.QA_ENV: System.getProperty("env");
        data = JsonUtils.getJsonDataAsMap(Environment.QA_ENV, "airlineConfig.json");
    }

    @Test()
    @Parameters({"testData"})
    public void RunApiTest(@Optional String testData) {
        if (testData != null && !(testData.isEmpty())) {
            Response response = RestUtils.performPost(data.get("airlineBaseURI"), data.get("airlineResource"),
                    Payload.createAirlineByMap(new Random().nextLong()),
                    Specifications.HeadersConfig());

            Assert.assertEquals(response.statusCode(), HttpStatus.SC_OK);
        }


    }


}
