#Author: israeljdavila@gmail.com

@RunAll
Feature: Fazer login 
  Eu como usuario quero fazer login para acessar os meus dados
  
  Background: Fazer login
  	Given que eu esteja no site "file:///C:/Users/JU/Desktop/Login/Sistema/index.html"

@RunCT01
  Scenario: CT01 - Fazer login com dados validos
    When informar os dados de login validos
    Then login realizado com sucesso 
    
@RunCT02    
  Scenario: CT02 - Fazer login com dados invalidos
    When informar os dados de login invalidos
    Then login nao sera realizado com a mensagem error

@RunCT03    
  Scenario: CT03 - Fazer login com dados em branco
    When nao informar nenhum dado de login
    Then login nao sera realizado com a mensagem error
    
    
    


