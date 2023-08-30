# Site Institucional - Fast Totem

Este repositório contém o código-fonte e informações relacionadas ao projeto Site Institucional do Fast Totem, uma plataforma de monitoramento e manutenção de totens de autoatendimento em estabelecimentos de fast food.

## Funcionalidades

### Página Inicial

- Apresenta uma visão geral do projeto Fast Totem.
- Fornece um link para a plataforma de suporte.

### Cadastro

- Permite o cadastro de empresas que utilizam os totens.
- Possibilita o cadastro de administradores para gerenciar o sistema.
- Permite o cadastro de funcionários relacionados às empresas.
- Possibilita o cadastro de totens para monitoramento.

### Login

- Página de login para acesso ao sistema.
- Realiza verificação de login e senha.
- Implementa diferentes níveis de acesso (administrador, funcionário).
- Oferece opção de recuperação de senha.

### Dashboard

- Integração com API para exibição de dados do banco de dados.
- Exibe um gráfico dinâmico com visão geral dos totens (quantidade por status).
- Apresenta uma lista de totens cadastrados.
- Notificações de aviso para status de Alerta e Crítico.
- Mostra um gráfico de barras comparando tempo de atividade dos totens.

### Totem

- Utiliza API Java para captura de informações do hardware.
- Verifica e exibe status da CPU, RAM, disco e rede do totem.
- Calcula tempo de atividade do totem.
- Apresenta métricas de status dos componentes (Ok, Alerta, Crítico).
- Oferece opções para reiniciar, desligar e limpar cache do totem.
- Exibe gráfico em tempo real dos componentes.

## Tecnologias Utilizadas

- Frontend: HTML, CSS, JavaScript
- Backend: Node.js
- Banco de Dados: MySQL
- Aplicação Cliente para Monitoramento: Java

## Como Executar o Projeto

1. Clone este repositório para sua máquina local.
2. Configure as conexões de banco de dados no arquivo `server.js`.
3. Importe o script SQL (`database.sql`) para criar o banco de dados.
4. Instale as dependências do Node.js: `npm install`.
5. Execute o servidor Node.js: `node server.js`.
6. Inicie a aplicação Java (`MonitorApp.java`) nos totens para monitoramento.
