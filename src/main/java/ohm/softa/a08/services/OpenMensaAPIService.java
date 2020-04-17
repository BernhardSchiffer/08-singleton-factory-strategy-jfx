package ohm.softa.a08.services;

import com.google.gson.Gson;
import ohm.softa.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {

	private static OpenMensaAPIService instance;
	private final OpenMensaAPI mensaApiInstance;
	private Gson gson;

	private OpenMensaAPIService() {
		this.gson = new Gson();
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create(gson))
			.baseUrl("http://openmensa.org/api/v2/")
			.build();

		mensaApiInstance = retrofit.create(OpenMensaAPI.class);

	}

	public Gson getGson() {
		return gson;
	}

	public static OpenMensaAPIService getInstance() {
		if(instance == null)
			instance = new OpenMensaAPIService();
		return instance;
	}

	public OpenMensaAPI getApi() {
		return mensaApiInstance;
	}
}
