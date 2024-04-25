package com.example.RestAPI.service;
import com.example.RestAPI.model.UserEntity;
import com.example.RestAPI.repository.IbgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private IbgeRepository ibgeRepository;

    public String preverIbge() {
        String dadosMeteorologicos = "";
        //Nível BR
        String apiUrl = "http://servicodados.ibge.gov.br/api/v3/noticias/";


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dadosMeteorologicos = responseEntity.getBody();
        } else {
            dadosMeteorologicos = "Falha ao obter dados do IBGE. Código de status: " + responseEntity.getStatusCode();
        }
        inserirDados(dadosMeteorologicos);
        return dadosMeteorologicos;
    }

    public void inserirDados(String dadosIbge) {

        UserEntity ue = new UserEntity();
        ue.setNoticiasReleases(dadosIbge);
        ibgeRepository.save(ue);

    }

}