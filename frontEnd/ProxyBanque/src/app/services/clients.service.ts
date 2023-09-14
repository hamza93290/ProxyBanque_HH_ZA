import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Clients } from '../models/clients';

@Injectable({
  providedIn: 'root'
})
export class ClientsService {

  constructor( private serv: HttpClient) { }

  getClients():Observable<Clients[]>{
    return this.serv.get<Clients[]>('http://localhost:3000/clients')
  }
}
