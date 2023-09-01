const cepInput = document.getElementById('cepInput');
const ruaInput = document.getElementById('ruaInput');
const bairroInput = document.getElementById('bairroInput');
const alertCep = document.getElementById('alertCep');

async function getEndereco(cep) {
    const url = `https://viacep.com.br/ws/${cep}/json/`;
    const data = await fetch(url);
    const response = await data.json();

    return response;
}

cepInput.addEventListener('input',async (event) => {
    let cep = event.target.value;

    console.log(alertCep.style.display);

    if(cep.length === 8) {
        const enderecoDados = await getEndereco(cep);

        ruaInput.value = enderecoDados.logradouro;
        bairroInput.value = `${enderecoDados.bairro} - ${enderecoDados.uf}`;

        if(!enderecoDados) {
            alertCep.style.display = 'block';
        } else {
            alertCep.style.display = 'none';
        }
    } else if (cep.length > 0 && alertCep.style.display != 'block') {
        alertCep.style.display = 'block';

        ruaInput.value = '';
        bairroInput.value = '';
    }
})
