package com.example.Fipe.service;

import com.example.Fipe.model.FipeEntity;
import com.example.Fipe.repository.FipeRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FipeService {

    @Autowired
    private FipeRepository fipeRepository;

    public String consultaURL(String apiURL) {
        String dados = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "\"Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        inserirDados(dados);
        return dados;
    }
    public String consultaMarcas() {
        return consultaURL("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }

    public String consultarModelos(int id) {
        return consultaURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+id+"/modelos");
    }

    public String consultarAnos(int marca, int modelo) {
        return consultaURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos");
    }

    public String consultarValor(int marca, int modelo, String ano) {
        return consultaURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+marca+"/modelos/"+modelo+"/anos/"+ano);
    }

    public void inserirDados(String dadosMeteorologicos) {
        try {
            JSONArray jsonArray = new JSONArray(dadosMeteorologicos);
            for (int i = 0; i < jsonArray.length(); i++) {
                try {
                    JSONObject jsonObj = jsonArray.getJSONObject(i);
                    FipeEntity fipe = criarFipeEntityDeJson(jsonObj);
                    fipeRepository.save(fipe);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private FipeEntity criarFipeEntityDeJson(JSONObject jsonObj) {
        FipeEntity fipe = new FipeEntity();
        try {
            fipe.setId(jsonObj.getString("codigo"));
            fipe.setModelo(jsonObj.getString("nome"));
//            fipe.setMarca(jsonObj.getString("marca"));
//            fipe.setAno(jsonObj.getString("text"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return fipe;
    }
}
