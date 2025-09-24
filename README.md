# Projeto: rolarDado 🎲

Este projeto é um exemplo simples em **Java** que simula o **rolar de um tipo dado**.  
Ele foi desenvolvido como parte de um exercício e pode ser executado tanto no **terminal** quanto em **IDEs** como VS Code, Eclipse ou IntelliJ.

---

## 📂 Estrutura do Projeto

```
pasta_escolhida/
 ├── bin/                 # Arquivos compilados (.class)
 │    └── rolarDado.class
 └── src/                 # Código-fonte Java
      └── rolarDado.java
```

- O código-fonte principal está em `src/rolarDado.java`.
- Após a compilação, o bytecode é gerado na pasta `bin/`.

---

## ⚙️ Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-downloads.html)  
- [VS Code](https://code.visualstudio.com/) (opcional, mas recomendado)  
- Extensão do Java no VS Code (caso use essa IDE)

Verifique se o Java está instalado corretamente:

```bash
java -version
javac -version
```

---

## ▶️ Como Compilar e Executar

### 🔹 Usando o Terminal

1. Acesse a pasta do projeto:
   ```bash
   cd pasta_escolhida/RolarDados
   ```

2. Compile o programa (gerando o `.class` na pasta `bin/`):
   ```bash
   javac -d bin src/rolarDado.java
   ```

3. Execute o programa:
   ```bash
   java -cp bin rolarDado
   ```

---

### 🔹 Usando o VS Code

1. Abra a pasta `pasta_escolhida/RolarDados` no VS Code.  
2. Certifique-se de que a extensão **Extension Pack for Java** está instalada.  
3. Clique em **Run** ▶️ no topo do arquivo `rolarDado.java` ou use `Ctrl + F5`.  
4. O resultado aparecerá no terminal integrado.

---

### 🔹 Usando Eclipse

1. Abra o Eclipse e selecione um **workspace**.  
2. Importe o projeto (`File > Import > Existing Projects into Workspace`).  
3. Selecione a pasta `pasta_escolhida/RolarDados`.  
4. Clique com o botão direito em `rolarDado.java` > **Run As > Java Application**.  

---

### 🔹 Usando IntelliJ IDEA

1. Abra o IntelliJ e vá em **Open Project**.  
2. Selecione a pasta `pasta_escolhida/RolarDados`.  
3. Abra o arquivo `rolarDado.java`.  
4. Clique no botão **Run** ▶️ ao lado da declaração da classe.  

---

## 🖥️ Exemplo de Execução

```bash
$ java -cp bin rolarDado
Você rolou o número: 4 🎲
```

A cada execução, o número pode variar desde **1 até o tipo de dado escolhido**.

---

## 📜 Licença

Este projeto foi desenvolvido para fins educacionais e pode ser utilizado livremente para estudos.

---

## ✨ Autor

- **Alex Freire**
