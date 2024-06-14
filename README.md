# Arquitetura-de-Aplicacoes-Web

API documentation - JWT

Visão Geral 

 A JWT – User  API suporta autenticação com JSON Web Tokens (JWT). Isso suporta autenticação de usuário e emissão de tokens de JWT para acessar endpoints seguros. 

APIs Disponíveis 

 POST /login: O endpoint de autenticação para obter um token de JWT. 
 GET /username/{token}: Rota que obtém o nome de usuário de um token JWT.
 GET /user: Rota que obtém as informações do usuário autenticado. 
 GET /admin: Rota protegida que só pode ser acessada por usuários com função ADMIN.
 GET /moderado: Rota protegida que só pode ser acessada por usuários com função MODERADO. 
 GET /comum: Rota que pode ser acessada por um usuário comum. 

Guia de Introdução: 
Caso você queira começar a usar la API de ((nombre del producto)), veja como fazer: 
Obtenha uma chave de API ativa para que você possa autenticar suas solicitações. Garanta que a chave de API em cada solicitação que você fizer para os pontos finais da API seja válida. Toda solicitação que você fizer deve ser feita por HTTPS. O formato em que você receberá respostas da API é JSON. 

Autenticação: 
A API ((product_name)) autentica chamadas usando um token JWT. 

Para autenticar a solicitação:  
Você precisa de um token JWT fornecido pelo ponto de extremidade POST /login. Passe o token JWT no cabeçalho da solicitação de chamadas seguintes (Autorização: Portador {token}). 

Erro de Resposta de Autenticação:
Se uma chave de API estiver ausente ou for inválida/malformada, a resposta retornará um código de status HTTP 401 Não Autorizado. 

Testes Realizados no Insomnia: 
Os testes da API do ((nome do produto)) foram realizados no Insomnia. Você pode baixar a coleção de testes e, a partir disso, importar diretamente para o Insomnia para testar os endpoints e o comportamento da API. 

Vincular a coleção de testes em Insomnia 

Limites de Taxa e Uso 

 Os limites de taxa e uso da API JWT - User são os seguintes: 

 Limite de taxa: 300 solicitações por minuto por chave de API.  

Códigos de status: Você receberá uma resposta HTTP 429 Too Many Requests se exceder o limite de taxa.  

Cabeçalhos de resposta: 
 X-RateLimit-Limite: O número de solicitações permitidas no máximo por minuto. X-RateLimit-Restante: O número de solicitações restantes na janela de limite de taxa atual.  

X-RateLimit-Redefinição: O carimbo de data/hora em que a janela de limite de taxa atual será redefinida em segundos do éon UTC. 

Resposta 503 

 Uma resposta HTTP 503 é um sinal de que o tráfego de acesso à API aumentou inesperadamente. O servidor é obrigado a retornar ao seu estado normal em um máximo de cinco minutos. Então, se você continuar tendo o problema, ou se você continuar recebendo um erro HTTP 5XX de qualquer tipo, fique à vontade para contatar a equipe de suporte. 

Precisa de Ajuda?  

Para mais informações ou ajuda, consulte o seguinte: 
Dê uma olhada em nossos tutoriais para ver exemplos detalhados do uso da API. Verifique nossa seção de perguntas frequentes para ver as respostas das perguntas mais comuns. Junte-se à nossa comunidade e use o fórum para trocar ideias com outros desenvolvedores e obter suporte. 

 

Diagrama - JWT

<img width="328" alt="2024-06-14_19h03_18" src="https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/ece95c54-a4fa-4e08-9127-3d193eb46e27">

Imagens do Insomnia em execusão: 

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/07b1d97d-230d-49c1-bf4a-e9da8fc25a8c)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/078c25d7-1c76-41b0-aa7b-e1132eb417c8)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/152b3dbc-c977-4a26-8d59-413901ff0f3a)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/2aa6aa81-9dcc-4c8d-844c-6da8b8122e75)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/9ecca62d-890d-4b13-96a8-f2a7e4b4b2f4)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/4b1720c7-5bda-49a6-a95c-b3f848a1edeb)






