package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "StepDefinations",
      //    tags = "@bmetPdo or @pdologout or @PdoSupport or @Supportlogout or @PdoPrincipal",
//        tags = "@PdoPrincipal or @Principallogout",
//        tags = "@PdoSupport or @Supportlogout" ,
          tags = "@bmetPdo",
//        tags = "@BMETClearance",
     //  tags = "@bmetR or @logout or @approval or @approvlogout or @bmetRpay" ,
//
  //    tags = "@RMApplication",
//      tags = "@AddNewStudent",
//        tags = "@Grading&certificate",



        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedrerun.txt"},
        monochrome = true)
public class FullTestRunner {
  }


//  tags = "@bmetR or @logout or @approval or @approvlogout or @bmetRpay or @close",
