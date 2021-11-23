<p align="center"><img width="500" height="210" src="https://i.ibb.co/jGsyd3p/1-0-Hyu03i97p-VH5-TCwlsc-Ag.png"></p>








<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Desafio 1: Strings"></a>API Rest - Validação de senha</h1>
<h3 class="code-line" data-line-start=2 data-line-end=3 ><a id="Sobre_o_projeto"></a>Sobre o projeto</h3>
<p class="has-line-data" data-line-start="5" data-line-end="6">Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

<ul>
<li class="has-line-data" data-line-start="14" data-line-end="15">Nove ou mais caracteres</li>
<li class="has-line-data" data-line-start="15" data-line-end="16">Ao menos 1 dígito</li>
<li class="has-line-data" data-line-start="16" data-line-end="17">Ao menos 1 letra minúscula</li>
<li class="has-line-data" data-line-start="18" data-line-end="19">Ao menos 1 letra maiúscula</li>
<li class="has-line-data" data-line-start="19" data-line-end="20">Ao menos 1 caractere especial</li>
<li class="has-line-data" data-line-start="20" data-line-end="21">Considere como especial os seguintes caracteres: !@#$%^&*()-+</li>
<li class="has-line-data" data-line-start="21" data-line-end="23">Não possuir caracteres repetidos dentro do conjunto</li>
<li class="has-line-data" data-line-start="22" data-line-end="23">Espaços em branco não devem ser considerados como caracteres válidos.</li>
</ul>

Exemplo:

<pre><code class="has-line-data" data-line-start="33" data-line-end="35" class="language-sh">IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
</code></pre>

<h1 class="code-line" data-line-start=23 data-line-end=24 ><a id="Funcionalidades_23"></a>Funcionalidades e instruções de uso</h1>
<p class="has-line-data" data-line-start="25" data-line-end="28">A API expõe um endpoint que define se o password é valido de acordo com os critérios estabelecidos acima.
<br>Esse tutorial orienta sobre as funcionalidades da API utilizando o [Postman](https://www.postman.com/) para o envio de requisições.<br>




<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>1 - Executando o projeto</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Após baixar o projeto, no diretório main, clique com o botão direito na classe PasswordValidatirApplication e execute a aplicação em Run.</p>

<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>2 - Validação de senha</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Para validação da senha, será feita uma requisição POST em:</p>
<pre><code class="has-line-data" data-line-start="33" data-line-end="35" class="language-sh">http://localhost:<span class="hljs-number">8080</span>/password 
</code></pre>
<p class="has-line-data" data-line-start="35" data-line-end="36">Nessa requisição será informada a senha como String no campo password no corpo da requisição, conforme exemplo abaixo:</p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img src="https://thumbs2.imgbox.com/6b/bb/njsQlogd_t.png" alt="N|Solid"></p>

<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>3 - Execução de testes unitários e integrados</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">Para a execução dos testes unitários, vá até o diretório test, na classe PasswordValidatorApplicationTests e execute os testes em Run</p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img src="https://thumbs2.imgbox.com/e4/33/qQPNCwdd_t.png"></p>

<p class="has-line-data" data-line-start="31" data-line-end="32">O mesmo para o teste integrado, porém na classe PasswordControllerTest:</p>

<p class="has-line-data" data-line-start="37" data-line-end="38"><img src="https://thumbs2.imgbox.com/ec/40/rYwKyLwl_t.png"></p>


<h3 class="code-line" data-line-start=29 data-line-end=30 ><a id="1__Criao_de_usurio_29"></a>4 - Sobre a solução</h3>
<p class="has-line-data" data-line-start="31" data-line-end="32">A solução é composta pela criação de uma validação customizada com [Bean Validation Custom Constraints](https://docs.oracle.com/javaee/7/tutorial/bean-validation-advanced001.htm#GKFGX) e adicionando a anotação customizada @ValidPassword à classe PasswordDTO, 
onde será aplicada a lógica de validação contida na classe PasswordValidation ao atributo password. Quaisquer eventuais necessidades de negócio para a mudança de regras de senha estão contidas nessa classe isolada, o que garante mais facilidade de manutenção e clareza no código como um todo.</p>




















<h3 class="code-line" data-line-start=86 data-line-end=87 ><a id="Contato_86"></a>Contato</h3>
<p class="has-line-data" data-line-start="88" data-line-end="90">E-mail: <a href="mailto:maciel.eds@gmail.com">maciel.eds@gmail.com</a><br>
Linkedin: <a href="https://www.linkedin.com/in/edison-maciel-6a83a14a/">https://www.linkedin.com/in/edison-maciel/</a></p>
