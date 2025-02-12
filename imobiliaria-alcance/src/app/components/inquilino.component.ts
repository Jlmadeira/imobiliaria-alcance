import {Component} from '@angular/core';
import {InquilinoService} from '../service/inquilino.service';
import {FormsModule} from '@angular/forms';
import {NgIf} from '@angular/common';

@Component({
  selector: 'app-inquilino',
  templateUrl: './inquilino.component.html',
  imports: [
    FormsModule,
    NgIf
  ],
  styleUrls: ['./inquilino.component.css']
})
export class InquilinoComponent {
  inquilino = {
    nome: '',
    email: '',
    telefone: ''
  };

  errorMessage: string = '';
  successMessage: string = '';

  constructor(private inquilinoService: InquilinoService) {
  }

  saveInquilino() {
    if (this.isFormValid()) {
      this.inquilinoService.saveInquilino(this.inquilino).subscribe(
        (response) => {
          this.successMessage = 'Inquilino cadastrado com sucesso!';
          this.inquilino = {nome: '', email: '', telefone: ''};
        },
        (error) => {
          this.errorMessage = 'Erro ao cadastrar inquilino!';
        }
      );
    } else {
      this.errorMessage = 'Todos os campos são obrigatórios!';
    }
  }

  isFormValid() {
    return this.inquilino.nome && this.inquilino.email && this.inquilino.telefone;
  }

}


