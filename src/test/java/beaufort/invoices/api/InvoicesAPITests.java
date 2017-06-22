package beaufort.invoices.api;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;

public class InvoicesAPITests {

	URL url;
	HttpURLConnection huc;

	@Before
	public void setUp() throws IOException {
		url = new URL("http://" + Configuration.apiIp + ":" + Configuration.apiPort + "/invoices");
		huc = (HttpURLConnection) url.openConnection();
	}

	@Test
	public void testGetInvoicesReturnsSuccessStatus() throws IOException {
		huc.setRequestMethod("GET");
		huc.connect();
		int expectedResponseCode = 200;
		int actualResponseCode = huc.getResponseCode();
		Assert.assertEquals(
				"Expected response code :" + expectedResponseCode + ", actualResponseCode: " + actualResponseCode,
				expectedResponseCode, actualResponseCode);
	}

}
