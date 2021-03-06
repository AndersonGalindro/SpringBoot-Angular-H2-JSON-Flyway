###### SpringBoot-Angular


# Anotações & Instruções 
###### Observe que a instrução a baixo tem como referencia o Sistema Operacional Windows 10 e IDE Eclipse.

### Sobre a IDE

A IDE usada para realizar o CRUD com SpringBoot,Angular,H2 & Flyway pode ser baixada no site https://spring.io/tools, vale ressaltar que a IDE usada foi o Eclipse, e as Instruções á baixo tem como referencia a mesma. 

Após a baixar e realizar extração da IDE no site indicado, o usuário deve acessar o local onde os arquivos da IDE foi extraida e clicar no arquivo de nome "eclipsec", essa ação deve inicializar a IDE.

### Sobre a Aplicação

Para iniciar/startar a aplicação o usuário deve clonar esse projeto e em seguida importar-lo para o eclipse.

#### Como Importar O Projeto?

Partindo do ponto que a IDE não possui nem um projeto;

Ao lado esquedo do eclipse, na aba "Packarge Explorer" o usuário deve clicar em "Import projects" ou ir no canto superior á esqueda "File" e clicar na opção "Import".

Ambas as ações deverá resulta na abertura de uma janela de nome "Import", no campo "Select an import wizard" digite "git", irá retornar alguns resultados, o usuário deve esolher a opção "Projects from Git (with smart import)" e em seguida escolher a opção "Existing local repository" e clicar em Next.

Em seguida clicar em "Add...", Na nova janela que irá abrir, deverá se apontado onde foi baixado esse projeto.

##### Exemplo: O clone do projeto foi realizado na raiz do disco local C, Então deverá ser apontado na IDE da seguinte forma "C:\SpringBoot-Angular-H2-JSON-Flyway", para que a IDE possa reconhecer o projeto clonado.

Após apontar o caminho correto, a janela irá carregar o repositório "C:\SpringBoot-Angular-H2-JSON-Flyway\.git", o usuário terá que marcar o checkBox do repositório desejado e clicar em Finish, essa ação irá retornar para janela anterior (aquela antes de clicar em "add..."), só que agora nessa janela terá o repositório marcado anteriormente.

Uma vez confirmado que o repositório marcado está lá, o usuário deverá clicar em Next e em seguida "Finish".

Em seguinda o Eclipse irá carregar todas as configurações necessárias para iniciar o projeto (o usuário poderá acompanhar o andamento das configurações na barra inferior á direito), Assim que o eclipse terminar de configurar o projeto já está pronto para ser startado ou modificado.

#### Como Startar O Projeto?

Clicar com o botão direito do mouse no projeto "SpringBoot-Angular-H2-JSON-Flyway", ir em "Run As" e escolha a opção "Spring Boot App", a aplicação poderá ser acessada na URL "http://localhost:8080" e o H2 pode ser acessado "http://localhost:8080/h2-console"

#### Observação: Se em "Run As" não tiver a opção "Spring Boot App", o projeto deverá ser convertido para "Maven Project", Uma forma de converter é: Botão direito do mouse no projeto, "Configure" e escolher a opção "Convert To Maven Project", Assim que o procedimento for finalizar, a opção "Spring Boot App" deverá aparecer em "Run As"


##### segue vídeo para melhor auxiliar nos procedimentos citado á cima https://youtu.be/jHarA52BC6o 

### Sobre o Banco De Dados

Dentro do reposotório "SpringBoot-Angular-H2-JSON-Flyway\src\main\resources" existe um arquivo com o nome de "application.properties" esse arquivo é onde fica configurado a conexão com o banco. como o H2 esta integrado, não se faz necessário a preocupação com o banco.

#### ATENÇÂO: Como nessa aplicação temos o Flyway, Lembre-se de que o caminho para a pasta de migração é "SpringBoot-Angular-H2-JSON-Flyway\src\main\resources\db\migration" e o padrão dos arquivos que devem ficar lá dentro possui a nomaclatura "V[seguencial]__[NomeQue Quiser].sql , Exemplo: V1__ScriptDeCriação.sql , V2__ScriptDeAlteração.sql" e o padrão de query segue conforme o banco usado.
