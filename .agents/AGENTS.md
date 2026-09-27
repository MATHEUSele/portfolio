# Contexto do Portfólio (Atualizações de Design - Setembro 2026)

## O que foi feito recentemente:
Nesta sessão, focamos em melhorar a apresentação dos cards de projeto na página principal (`index.html`), deixando-os mais imersivos, e adicionamos uma galeria dedicada para o projeto Artemis.

1. **Card do Artemis 2.0**:
   - Criamos e aplicamos o fundo abstrato cósmico/cyberpunk (`images/artemis_background.jpg`).
   - Adicionamos um botão "Ver Imagens" ao lado do link do repositório.

2. **Galeria do Artemis**:
   - Criamos o arquivo `artemis.html` como uma página inteira dedicada a expor screenshots do Artemis.
   - Para inserir as imagens reais do projeto, basta abrir `artemis.html` e substituir o conteúdo das `div.image-card` pela respectiva imagem (`<img>`).

3. **Card do WhatsApp Chatbot**:
   - Criamos e aplicamos um fundo tecnológico voltado para conexões/redes neurais na cor verde neon (`images/whatsapp_background.jpg`).

4. **Card do Sistema Acadêmico Java**:
   - Criamos e aplicamos um fundo tecnológico clássico com tons de azul e vermelho/bordo (`images/java_background.jpg`).

## Como os fundos foram aplicados:
Os planos de fundo foram aplicados nos cards através de estilos embutidos (inline styles) na própria div `<div class="projeto-card">`. Foi usado o `linear-gradient` escuro (com opacidade) por cima da imagem `url(...)` para escurecer o fundo propositalmente e não atrapalhar a leitura do texto branco.

Exemplo de estrutura atual de um card:
```html
<div class="projeto-card reveal" style="... background: linear-gradient(rgba(15, 23, 42, 0.7), rgba(15, 23, 42, 0.95)), url('images/nome_do_fundo.jpg'); ...">
```

> **Nota:** Use este arquivo sempre que precisar retomar o contexto de como esses cards e a galeria foram estruturados.
