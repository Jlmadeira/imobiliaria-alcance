import { Component } from '@angular/core';
import {ProprietarioService} from '../service/proprietario.service';

@Component({
  selector: 'app-proprietario',
  templateUrl: './proprietario.component.ts',
  styleUrls: ['./proprietario.component.ts']
})
export class ProprietarioComponent {
  proprietario= {
    nome: '',
    endereco: '',
    email: '',
    telefone: ''
  };

  errorMessage: string = '';
  successMessage: string = '';

  constructor(private proprietarioService: ProprietarioService) { }

  saveProprietario() {
    if (this.isFormValid()) {
      this.proprietarioService.saveProprietario(this.proprietario).subscribe(
        (response) => {
          this.successMessage = 'Proprietário cadastrado com sucesso!';
          this.proprietario = { nome: '', endereco: '', email: '', telefone: '' }; // Limpa o formulário
        },
        (error) => {
          this.errorMessage = 'Erro ao cadastrar proprietário!';
        }
      );
    } else {
      this.errorMessage = 'Todos os campos são obrigatórios!';
    }
  }

  isFormValid() {
    return this.proprietario.nome && this.proprietario.endereco && this.proprietario.email && this.proprietario.telefone;
  }
}
