package Sophos.Reto.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/sophos.feature", glue="Sophos.Reto.definitions")

public class Runner {

	
}
