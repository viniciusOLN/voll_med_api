package project.test.test.cliente;

import project.test.test.endereco.DadosEndereco;

public record DadosCadastroCliente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {}
