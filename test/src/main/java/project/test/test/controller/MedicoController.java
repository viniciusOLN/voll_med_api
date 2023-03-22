package project.test.test.controller;

import org.springframework.web.bind.annotation.*;
import project.test.test.medico.DadosCadastroMedico;

@RestController
@RequestMapping("medicos")
public class MedicoController {

   @PostMapping
   public void cadastrar(@RequestBody DadosCadastroMedico dados){
      System.out.println(dados.nome());
   }
}
