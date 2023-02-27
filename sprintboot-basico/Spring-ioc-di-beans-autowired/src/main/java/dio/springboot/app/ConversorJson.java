package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;




    public ViaCepResponse coverter(String json) {
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    };
}
