package project.test.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.test.test.medico.DadosCadastroMedico;
import project.test.test.medico.Medico;
import project.test.test.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {

   @Autowired
   private MedicoRepository repository;

   @PostMapping
   public void cadastrar(@RequestBody DadosCadastroMedico dados){
      repository.save(new Medico());
   }
}
