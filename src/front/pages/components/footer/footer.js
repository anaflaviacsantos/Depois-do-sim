class Footer extends HTMLElement {
    constructor() {
        super();
    }

    connectedCallback() {
        this.innerHTML = `
        <footer class="footer-bg">
            <div class="container">
                <div class="row infos">
                    <div class="col-lg-6 col-md-6 col-sm-12 col1">
                        <h5 class="gold " style="margin: 0px 0px 15px 0;">Vamos te ajudar!</h5>
                        <a href="" class="links">Quero criar minha lista de presentes!<br></a>
                        <a href="" class="links">Quero criar uma lista de convidados!<br></a>
                        <a href="" class="links">Quero registrar meus orçamentos!<br></a>
                        <a href="" class="links">Quero agendar uma visita a um fornecedor!<br></a>
                        <a href="" class="links">Quero compartilhar as fotos da cerimônia!<br></a>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col2">
                        <h5 class="gold" style="margin: 0px 0px 15px 0;">Contatos</h5>
                        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 30 30" fill="none"
                            style="vertical-align: middle;">
                            <path
                                d="M5 25C4.3125 25 3.72375 24.755 3.23375 24.265C2.74375 23.775 2.49917 23.1867 2.5 22.5V7.5C2.5 6.8125 2.745 6.22375 3.235 5.73375C3.725 5.24375 4.31334 4.99917 5 5H25C25.6875 5 26.2763 5.245 26.7663 5.735C27.2563 6.225 27.5008 6.81334 27.5 7.5V22.5C27.5 23.1875 27.255 23.7763 26.765 24.2663C26.275 24.7563 25.6867 25.0008 25 25H5ZM15 16.25L5 10V22.5H25V10L15 16.25ZM15 13.75L25 7.5H5L15 13.75ZM5 10V7.5V22.5V10Z"
                                fill="#C2A300" />
                        </svg>
                        <p style="display: inline; vertical-align: middle;" class="links">depoisdosim@gmail.com</p>
                        <br><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 30 30" fill="none">
                            <path
                                d="M8.175 6.25C8.25 7.3625 8.4375 8.45 8.7375 9.4875L7.2375 10.9875C6.725 9.4875 6.4 7.9 6.2875 6.25H8.175ZM20.5 21.275C21.5625 21.575 22.65 21.7625 23.75 21.8375V23.7C22.1 23.5875 20.5125 23.2625 19 22.7625L20.5 21.275ZM9.375 3.75H5C4.3125 3.75 3.75 4.3125 3.75 5C3.75 16.7375 13.2625 26.25 25 26.25C25.6875 26.25 26.25 25.6875 26.25 25V20.6375C26.25 19.95 25.6875 19.3875 25 19.3875C23.45 19.3875 21.9375 19.1375 20.5375 18.675C20.4134 18.63 20.2819 18.6088 20.15 18.6125C19.825 18.6125 19.5125 18.7375 19.2625 18.975L16.5125 21.725C12.9693 19.913 10.087 17.0307 8.275 13.4875L11.025 10.7375C11.375 10.3875 11.475 9.9 11.3375 9.4625C10.8633 8.02257 10.6228 6.516 10.625 5C10.625 4.3125 10.0625 3.75 9.375 3.75Z"
                                fill="#C2A300" />
                        </svg>
                        <p style="display: inline; vertical-align: middle;" class="links">(31)99999-9999</p>
                    </div>
                </div>
                <div class="row">
                    <p class = "gold-bg text-center text-end-bg">© 2023 - 2023 Depois do Sim - Desenvolvido com muito ❤️ na PUC Minas</p>
                </div>
            </div>
        </footer>
        `;
    }
}

customElements.define('current-footer', Footer);