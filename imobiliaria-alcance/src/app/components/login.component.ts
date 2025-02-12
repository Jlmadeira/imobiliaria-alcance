import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {FormsModule} from '@angular/forms';
import {NgIf} from '@angular/common';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  imports: [
    FormsModule,
    NgIf
  ],
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  username: string = '';
  password: string = '';
  errorMessage: string = '';

  constructor(private router: Router) { }

  login() {
    if (this.username === 'admin '&& this.password === 'admin123') {
      this.router.navigate(['/dashboard']);
    } else {
      this.errorMessage = 'Usuario ou senha invalido';
    }
  }

  protected readonly Error = Error;
}
