package ui;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\Documents\\eclipse workspace\\cucmberdatatable\\src\\test\\resources\\ui",glue= {"Datatable"},monochrome = true,
strict = true, // it will check if any step is not define in the ui package
dryRun = true // to check the mapping is proper between feature file and ui file

//format= {"pretty","html:test-output","json:jsonn_output/cucumber.json"}
)
public class Runner {

}
