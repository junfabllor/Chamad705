
"use strict";

document.addEventListener("DOMContentLoaded", () => {
    const form = document.querySelector("#loginForm");

    if (!form) {
        console.error("Formulário de login não encontrado.");
        return;
    }

    form.addEventListener("submit", (event) => {
        event.preventDefault();

        if (!form.checkValidity()) {
            form.reportValidity();
            return;
        }

        alert(
            "Chamada705: interface funcionando!\n\n" +
            "O login ainda precisa ser conectado ao backend."
        );
    });
});
