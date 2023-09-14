import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Conseiller } from '../models/conseiller';

@Injectable({
  providedIn: 'root'
})
export class ConseillersService {

  constructor(private serv: HttpClient ) { }

  getConseillers():Observable<Conseiller[]>{
    return this.serv.get<Conseiller[]>('http://localhost:3000/conseillers')
  }
}
