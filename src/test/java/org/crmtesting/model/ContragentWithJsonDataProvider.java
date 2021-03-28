package org.crmtesting.model;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class ContragentWithJsonDataProvider {

    @DataProvider(name = "ContragentWithJsonDataProvider")
    public Object[][] parameterJsonTestProvider() throws IOException, ParseException {
        String pathToJson = (System.getProperty("user.dir") + "/src/test/resources/json/createContragentTestData.json");
        return JsonReader.getJSONdata(pathToJson, "contragents",4);
    }
}


