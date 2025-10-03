# BACKEND API REST TESTE

Descrição curta do projeto:  
> Um sistema backend em Java para testes de funcionalidades básicas

---

## Pré-requisitos

Antes de rodar o projeto ou os testes, certifique-se de:

- Java JDK 21  
- Maven 3.4.5  
- Banco de dados PostgreSQL
- Ferramentas adicionais: Insomnia/Postman ou qualquer ferramenta de API REST
- Extensão no VS para Java
  
Explique quais credenciais ou parâmetros precisam ser ajustados.

---

## ✅ O que deve ser feito

### 1. Testes Unitários
- Acesse a pasta `src/test/java`.
- Crie ou edite os arquivos de teste **sem alterar o código das funcionalidades principais**.
- Utilize **JUnit** (já incluso no projeto) para escrever os testes.
- Garanta que cada funcionalidade possua casos de teste básicos (sucesso e falha).

### 2. Testes Manuais
- Utilize uma ferramenta de API REST, como **Postman** ou **Insomnia**.
- Realize chamadas aos endpoints principais (ex: criação, leitura, atualização e exclusão).
- Valide as respostas recebidas e compare com o comportamento esperado.
- Teste também cenários de erro (exemplo: IDs inexistentes, dados inválidos, campos obrigatórios vazios).

### 3. Relatório de Resultados
Ao final da execução dos testes, documente:
- **Erros encontrados** (com descrição, endpoint/teste, entrada utilizada e saída inesperada).
- **Sugestões de melhorias** na API ou na estrutura dos dados.
- **Cobertura dos testes** (opcional: rodar `mvn test jacoco:report` para gerar relatório).

```bash
mvn clean install
