import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProprietarioService {
  private apiUrl = 'http://localhost:8080/api/proprietario';

  constructor(private http: HttpClient) { }

  saveProprietario(proprietario: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, proprietario);
  }
}
