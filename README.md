# 💱 Conversor de Moedas em Java

Este é um projeto simples de conversor de moedas criado como parte de um desafio da **Alura**.  
A aplicação é executada no **terminal (console)** e permite converter valores entre diferentes moedas em **tempo real**, utilizando a **API de câmbio ExchangeRate API**.

---

## 🧠 Funcionalidades

- Menu interativo via terminal
- Conversão entre diferentes moedas:
  - USD ↔ BRL
  - EUR ↔ BRL
  - GBP ↔ BRL
- Consulta de taxa de câmbio em tempo real
- Uso da biblioteca **Gson** para interpretar respostas JSON

---

## 🚀 Como executar

### 1. Clone este repositório

```bash
git clone https://github.com/seu-usuario/conversor-de-moedas.git
cd conversor-de-moedas
2. Abra o projeto no IntelliJ IDEA (ou outro IDE)
3. Adicione o Gson manualmente
Baixe o .jar:
gson-2.10.1.jar

Vá em:
File > Project Structure > Libraries > + > Java
E selecione o arquivo .jar

4. Obtenha sua chave da API
Cadastre-se em:
🔗 https://www.exchangerate-api.com/

Copie a chave de API recebida no e-mail.

5. Cole a chave no código
Abra o arquivo ApiService.java e substitua a chave:

java
Copiar código
private static final String API_KEY = "sua_chave_aqui";
6. Execute a aplicação
Execute a classe Main.java no IntelliJ.

🛠️ Tecnologias utilizadas
Java 17

API REST (ExchangeRate API)

Gson (Google JSON)

IntelliJ IDEA

Git

📁 Estrutura do projeto
css
Copiar código
ConversorDeMoedas/
├── src/
│   ├── Main.java
│   ├── Conversor.java
│   ├── ApiService.java
│   └── ExchangeRates.java
├── lib/
│   └── gson-2.10.1.jar
└── README.md
📌 Observações
O projeto não utiliza Maven ou Gradle.

A biblioteca Gson é adicionada manualmente.

O menu permite 6 conversões diferentes (USD, EUR, GBP ↔ BRL).

O projeto é ideal para treinar:

Orientação a Objetos

Consumo de APIs REST

Manipulação de JSON
