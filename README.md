# Arquitetura-de-Aplicacoes-Web

##Documentação da API JWT User

#Visão Geral

A API JWT User suporta autenticação com JSON Web Tokens (JWT). Isso facilita a autenticação de usuários e a emissão de tokens JWT para acessar endpoints seguros.

APIs Disponíveis

POST /login: Endpoint de autenticação para obter um token JWT.

GET /username/{token}: Rota que obtém o nome de usuário a partir de um token JWT.

GET /user: Rota que obtém informações sobre o usuário autenticado.

GET /admin: Rota protegida acessível apenas por usuários com a função ADMIN.

GET /moderado: Rota protegida acessível apenas por usuários com a função MODERADO.

GET /comum: Rota acessível por usuários comuns.

Guia de Introdução
Para começar a usar a API JWT User, siga estes passos:

Obtenha uma chave de API ativa para autenticar suas solicitações.
Certifique-se de que a chave de API esteja incluída em cada solicitação para os endpoints da API.
Todas as solicitações devem ser feitas por HTTPS.
As respostas da API estão no formato JSON.
Autenticação
A API autentica as chamadas usando um token JWT.

Para autenticar uma solicitação:
Obtenha um token JWT no endpoint POST /login.
Passe o token JWT no cabeçalho da solicitação para chamadas subsequentes (Authorization: Bearer {token}).
Resposta de Erro de Autenticação:
Se uma chave de API estiver ausente ou inválida/malformada, a resposta retornará um código de status HTTP 401 Não Autorizado.

Testes com Insomnia
A API JWT User foi testada usando o Insomnia. Você pode baixar a coleção de testes e importá-la diretamente no Insomnia para testar os endpoints e o comportamento da API.

Link para a Coleção de Testes no Insomnia
Baixar Coleção do Insomnia

Limites de Taxa e Uso
Os limites de taxa e uso da API JWT User são os seguintes:

Limite de Taxa: 300 solicitações por minuto por chave de API.
Código de Status: Você receberá uma resposta HTTP 429 Too Many Requests se exceder o limite de taxa.
Cabeçalhos de Resposta:
X-RateLimit-Limit: O número máximo de solicitações permitidas por minuto.
X-RateLimit-Remaining: O número de solicitações restantes na janela de limite de taxa atual.
X-RateLimit-Reset: O timestamp de quando a janela de limite de taxa atual será redefinida, em segundos do éon UTC.
Resposta HTTP 503
Uma resposta HTTP 503 indica que o tráfego da API aumentou inesperadamente. O servidor deve retornar ao normal em um máximo de cinco minutos. Se o problema persistir ou se você continuar recebendo qualquer erro HTTP 5XX, sinta-se à vontade para contatar a equipe de suporte.

Precisa de Ajuda?
Para mais informações ou assistência, consulte os seguintes recursos:

Tutoriais: Exemplos detalhados de como usar a API.
FAQ: Respostas para as perguntas mais comuns.
Fórum da Comunidade: Junte-se à nossa comunidade para trocar ideias com outros desenvolvedores e obter suporte.

Diagrama - JWT

<img width="328" alt="2024-06-14_19h03_18" src="https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/ece95c54-a4fa-4e08-9127-3d193eb46e27">

Imagens do Insomnia em execusão: 

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/07b1d97d-230d-49c1-bf4a-e9da8fc25a8c)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/078c25d7-1c76-41b0-aa7b-e1132eb417c8)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/152b3dbc-c977-4a26-8d59-413901ff0f3a)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/2aa6aa81-9dcc-4c8d-844c-6da8b8122e75)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/9ecca62d-890d-4b13-96a8-f2a7e4b4b2f4)

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/4b1720c7-5bda-49a6-a95c-b3f848a1edeb)

EXEMPLO DE USER NÃO AUTORIZADO:

![image](https://github.com/jadebrandao/Arquitetura-de-Aplicacoes-Web/assets/108814737/ee301811-2a9b-4e29-a2a8-46c8c69e2854)






