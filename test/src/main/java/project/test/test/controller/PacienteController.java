package project.test.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.test.test.cliente.DadosCadastroCliente;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

   @PostMapping
  public void cadastrar(@RequestBody DadosCadastroCliente novoCliente){}
}
