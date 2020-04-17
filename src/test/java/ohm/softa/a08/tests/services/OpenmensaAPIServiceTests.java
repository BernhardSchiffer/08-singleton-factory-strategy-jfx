package ohm.softa.a08.tests.services;

import ohm.softa.a08.services.OpenMensaAPIService;
import org.junit.jupiter.api.Test;

public class OpenmensaAPIServiceTests {

	@Test
	public void testSigelton() {
		OpenMensaAPIService instance = OpenMensaAPIService.getInstance();

		OpenMensaAPIService instance2 = OpenMensaAPIService.getInstance();

		assert(instance == instance2);
	}
}
