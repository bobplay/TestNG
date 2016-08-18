package train1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parame {
	@Test
	@Parameters({"browser","version"})
	public void parameTest(@Optional("ie") String browser,@Optional("1.0.0") String version){
		System.out.println(browser+"++++++++"+version);
	}
}
